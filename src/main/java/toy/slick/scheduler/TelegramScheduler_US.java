package toy.slick.scheduler;

import feign.Response;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import toy.slick.aspect.TimeLogAspect;
import toy.slick.common.Const;
import toy.slick.common.EnvUtils;
import toy.slick.common.MsgUtils;
import toy.slick.feign.telegram.TelegramFeign;
import toy.slick.service.TelegramService;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Slf4j
@Component
@EnableAsync
@EnableScheduling
public class TelegramScheduler_US {
    private final String SPRING_PROFILES_ACTIVE;
    private final String BOT_SLICK_TOKEN;
    private final String CHAT_SLICK_US_ID;

    /* Feign */
    private final TelegramFeign telegramFeign;

    /* Service */
    private final TelegramService telegramService;

    public TelegramScheduler_US(@Value("${spring.profiles.active}") String SPRING_PROFILES_ACTIVE,
                                @Value("${telegram.bot.slick.token}") String BOT_SLICK_TOKEN,
                                @Value("${telegram.chat.slick.us.id}") String CHAT_SLICK_US_ID,
                                TelegramFeign telegramFeign,
                                TelegramService telegramService) {
        this.SPRING_PROFILES_ACTIVE = SPRING_PROFILES_ACTIVE;
        this.BOT_SLICK_TOKEN = BOT_SLICK_TOKEN;
        this.CHAT_SLICK_US_ID = CHAT_SLICK_US_ID;
        this.telegramFeign = telegramFeign;
        this.telegramService = telegramService;
    }

    @TimeLogAspect.TimeLog
    @Async
    @Scheduled(cron = "0 0 8 * * *", zone = Const.ZoneId.NEW_YORK)
    public void sendEconomicEventList() throws Exception {
        if (EnvUtils.isNotProd(SPRING_PROFILES_ACTIVE)) {
            return;
        }

        ZonedDateTime searchDateTime = ZonedDateTime.now(ZoneId.of(Const.ZoneId.NEW_YORK))
                .minusDays(1)
                .withHour(7)
                .withMinute(49)
                .withSecond(0);

        String message = telegramService.getEconomicEventListMessage(Const.Country.US, searchDateTime, searchDateTime.plusDays(1));

        if (StringUtils.isBlank(message)) {
            throw new Exception(MsgUtils.blankMsg(message));
        }

        try (Response response = telegramFeign.sendHtmlWithoutPreview(BOT_SLICK_TOKEN, CHAT_SLICK_US_ID, message)) {
            if (response.status() >= 400) {
                throw new Exception(response.toString());
            }
        }
    }

    @TimeLogAspect.TimeLog
    @Async
    @Scheduled(cron = "0 15 18 * * 1-5", zone = Const.ZoneId.NEW_YORK)
    public void sendFearAndGreed() throws Exception {
        if (EnvUtils.isNotProd(SPRING_PROFILES_ACTIVE)) {
            return;
        }

        if (telegramService.isHoliday(Const.Country.US, LocalDate.now(ZoneId.of(Const.ZoneId.NEW_YORK)))) {
            return;
        }

        String message = telegramService.getFearAndGreedMessage();

        if (StringUtils.isBlank(message)) {
            throw new Exception(MsgUtils.blankMsg(message));
        }

        try (Response response = telegramFeign.sendHtmlWithoutPreview(BOT_SLICK_TOKEN, CHAT_SLICK_US_ID, message)) {
            if (response.status() >= 400) {
                throw new Exception(response.toString());
            }
        }
    }

    @TimeLogAspect.TimeLog
    @Async
    @Scheduled(cron = "0 20 18 * * 1-5", zone = Const.ZoneId.NEW_YORK)
    public void sendIndices() throws Exception {
        if (EnvUtils.isNotProd(SPRING_PROFILES_ACTIVE)) {
            return;
        }

        if (telegramService.isHoliday(Const.Country.US, LocalDate.now(ZoneId.of(Const.ZoneId.NEW_YORK)))) {
            return;
        }

        String djiMessage = telegramService.getDjiMessage();
        String ixicMessage = telegramService.getIxicMessage();
        String spxMessage = telegramService.getSpxMessage();

        String message = djiMessage + ixicMessage + spxMessage;

        if (StringUtils.isBlank(message)) {
            throw new Exception(MsgUtils.blankMsg(message));
        }

        try (Response response = telegramFeign.sendHtmlWithoutPreview(BOT_SLICK_TOKEN, CHAT_SLICK_US_ID, message)) {
            if (response.status() >= 400) {
                throw new Exception(response.toString());
            }
        }
    }
}
