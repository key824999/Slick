package toy.slick.service;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.jooq.generated.tables.pojos.Dji;
import org.jooq.generated.tables.pojos.EconomicEvent;
import org.jooq.generated.tables.pojos.FearAndGreed;
import org.jooq.generated.tables.pojos.Ixic;
import org.jooq.generated.tables.pojos.Kosdaq;
import org.jooq.generated.tables.pojos.Kospi;
import org.jooq.generated.tables.pojos.Spx;
import org.springframework.stereotype.Service;
import toy.slick.common.Const;
import toy.slick.repository.mariadb.DjiRepository;
import toy.slick.repository.mariadb.EconomicEventRepository;
import toy.slick.repository.mariadb.FearAndGreedRepository;
import toy.slick.repository.mariadb.HolidayRepository;
import toy.slick.repository.mariadb.IxicRepository;
import toy.slick.repository.mariadb.KosdaqRepository;
import toy.slick.repository.mariadb.KospiRepository;
import toy.slick.repository.mariadb.SpxRepository;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TelegramService {
    private final HolidayRepository holidayRepository;
    private final FearAndGreedRepository fearAndGreedRepository;
    private final EconomicEventRepository economicEventRepository;
    private final DjiRepository djiRepository;
    private final IxicRepository ixicRepository;
    private final SpxRepository spxRepository;
    private final KospiRepository kospiRepository;
    private final KosdaqRepository kosdaqRepository;

    public TelegramService(HolidayRepository holidayRepository,
                           FearAndGreedRepository fearAndGreedRepository,
                           EconomicEventRepository economicEventRepository,
                           DjiRepository djiRepository,
                           IxicRepository ixicRepository,
                           SpxRepository spxRepository,
                           KospiRepository kospiRepository,
                           KosdaqRepository kosdaqRepository) {
        this.holidayRepository = holidayRepository;
        this.fearAndGreedRepository = fearAndGreedRepository;
        this.economicEventRepository = economicEventRepository;
        this.djiRepository = djiRepository;
        this.ixicRepository = ixicRepository;
        this.spxRepository = spxRepository;
        this.kospiRepository = kospiRepository;
        this.kosdaqRepository = kosdaqRepository;
    }

    public boolean isHoliday(String country, LocalDate date) {
        return holidayRepository.select(country, date).isPresent();
    }

    public String getDjiMessage() {
        Optional<Dji> dji = djiRepository.selectRecentOne();

        if (dji.isEmpty()) {
            return StringUtils.EMPTY;
        }

        return this.generateIndexMessage(
                dji.get().getPriceChange().startsWith("-") ? Const.DOWN_CHART : Const.UP_CHART,
                dji.get().getUrl(),
                dji.get().getTitle(),
                dji.get().getPrice(),
                dji.get().getPriceChange(),
                dji.get().getPriceChangePercent()
        );
    }

    public String getSpxMessage() {
        Optional<Spx> spx = spxRepository.selectRecentOne();

        if (spx.isEmpty()) {
            return StringUtils.EMPTY;
        }

        return this.generateIndexMessage(
                spx.get().getPriceChange().startsWith("-") ? Const.DOWN_CHART : Const.UP_CHART,
                spx.get().getUrl(),
                spx.get().getTitle(),
                spx.get().getPrice(),
                spx.get().getPriceChange(),
                spx.get().getPriceChangePercent()
        );
    }

    public String getIxicMessage() {
        Optional<Ixic> ixic = ixicRepository.selectRecentOne();

        if (ixic.isEmpty()) {
            return StringUtils.EMPTY;
        }

        return this.generateIndexMessage(
                ixic.get().getPriceChange().startsWith("-") ? Const.DOWN_CHART : Const.UP_CHART,
                ixic.get().getUrl(),
                ixic.get().getTitle(),
                ixic.get().getPrice(),
                ixic.get().getPriceChange(),
                ixic.get().getPriceChangePercent()
        );
    }

    public String getKosdaqMessage() {
        Optional<Kosdaq> kosdaq = kosdaqRepository.selectRecentOne();

        if (kosdaq.isEmpty()) {
            return StringUtils.EMPTY;
        }

        return this.generateIndexMessage(
                kosdaq.get().getPriceChange().startsWith("-") ? Const.DOWN_CHART : Const.UP_CHART,
                kosdaq.get().getUrl(),
                kosdaq.get().getTitle(),
                kosdaq.get().getPrice(),
                kosdaq.get().getPriceChange(),
                kosdaq.get().getPriceChangePercent()
        );
    }

    public String getKospiMessage() {
        Optional<Kospi> kospi = kospiRepository.selectRecentOne();

        if (kospi.isEmpty()) {
            return StringUtils.EMPTY;
        }

        return this.generateIndexMessage(
                kospi.get().getPriceChange().startsWith("-") ? Const.DOWN_CHART : Const.UP_CHART,
                kospi.get().getUrl(),
                kospi.get().getTitle(),
                kospi.get().getPrice(),
                kospi.get().getPriceChange(),
                kospi.get().getPriceChangePercent()
        );
    }

    private String generateIndexMessage(String titleIcon, String url, String title, String price, String priceChange, String priceChangePercent) {
        return titleIcon + "<b><a href='" + url + "'>" + title + "</a></b>\n"
                + " - price : <b><u>" + price + "</u></b>\n"
                + " - change : <b><u>" + priceChange + " (" + priceChangePercent + ")</u></b>\n";
    }

    public String getFearAndGreedMessage() throws Exception {
        Optional<FearAndGreed> fearAndGreed = fearAndGreedRepository.selectRecentOne();

        if (fearAndGreed.isEmpty()) {
            throw new Exception("fearAndGreed is Empty");
        }

        String rating = fearAndGreed.get().getRating();
        double score = fearAndGreed.get().getScore();
        StringBuilder messageBuilder = new StringBuilder();

        messageBuilder
                .append("Current <b><a href='https://www.cnn.com/markets/fear-and-greed'>CNN Fear & Greed Index</a></b> Information").append("\n")
                .append(" - Rating : <b><u>")
                .append(rating)
                .append("</u></b>\n")
                .append(" - Score : <b><u>")
                .append(String.format("%.2f", score))
                .append("</u></b> ");

        if (score < 25) {
            messageBuilder.append(Const.FACE_SCREAMING_IN_FEAR);
        } else if (score < 30) {
            messageBuilder.append(Const.FEARFUL_FACE);
        } else if (score < 70) {
            messageBuilder.append(Const.THINKING_FACE);
        } else if (score < 75) {
            messageBuilder.append(Const.GRINNING_SQUINTING_FACE);
        } else {
            messageBuilder.append(Const.ZANY_FACE);
        }

        return messageBuilder.toString();
    }

    public String getEconomicEventListMessage(String country, ZonedDateTime startDateTime, ZonedDateTime endDateTime) {
        List<EconomicEvent> economicEventList = economicEventRepository
                .select(country,
                        startDateTime.withZoneSameInstant(ZoneId.of(Const.ZoneId.UTC)).toLocalDateTime(),
                        endDateTime.withZoneSameInstant(ZoneId.of(Const.ZoneId.UTC)).toLocalDateTime());

        if (CollectionUtils.isEmpty(economicEventList)) {
            return Const.CHECK_MARK
                    + "<b><a href='https://m.investing.com/economic-calendar/'>Economic Event List</a> is Empty</b>";
        }

        Map<String, List<String>> economicEventListMap = economicEventList
                .stream()
                .collect(Collectors.groupingBy(EconomicEvent::getCountry,
                        Collectors.mapping(economicEvent -> {
                            String eventId = economicEvent.getId();
                            String eventName = economicEvent.getName();
                            String actualValue = economicEvent.getActual();
                            String forecastValue = StringUtils.defaultIfBlank(economicEvent.getForecast(), "-");
                            String previousValue = economicEvent.getPrevious();

                            return "<a href='https://m.investing.com/economic-calendar/" + eventId + "'>" + eventName + "</a>" + "\n"
                                    + " : " + actualValue + " | " + forecastValue + " | " + previousValue;
                        }, Collectors.toList())));

        StringBuilder messageBuilder = new StringBuilder();

        messageBuilder
                .append(Const.CHECK_MARK)
                .append("<b><a href='https://m.investing.com/economic-calendar/'>Economic Event List</a></b>")
                .append("\n")
                .append(" : Actual | Forecast | Previous")
                .append("\n")
                .append("————————").append("\n");

        for (Map.Entry<String, List<String>> economicEventListEntry : economicEventListMap.entrySet()) {
            messageBuilder
                    .append(Const.FLAG)
                    .append("<b>")
                    .append(economicEventListEntry.getKey())
                    .append("</b>")
                    .append("\n")
                    .append(String.join("\n", economicEventListEntry.getValue()))
                    .append("\n")
                    .append("————————")
                    .append("\n");
        }

        return messageBuilder.toString();
    }
}
