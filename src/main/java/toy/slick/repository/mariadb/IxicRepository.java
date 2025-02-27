package toy.slick.repository.mariadb;

import lombok.NonNull;
import org.jooq.DSLContext;
import org.jooq.DeleteConditionStep;
import org.jooq.InsertSetMoreStep;
import org.jooq.Record;
import org.jooq.SelectConditionStep;
import org.jooq.generated.tables.JIxic;
import org.jooq.generated.tables.pojos.Ixic;
import org.jooq.generated.tables.records.IxicRecord;
import org.jooq.impl.DSL;
import org.springframework.stereotype.Repository;
import toy.slick.common.Const;
import toy.slick.repository.mariadb.inheritable.QueryCRUD;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;

@Repository
public class IxicRepository extends QueryCRUD<IxicRecord> {
    private final JIxic tIxic = JIxic.IXIC;

    public IxicRepository(DSLContext dslContext) {
        super(dslContext);
    }

    public int insert(@NonNull Ixic ixic, @NonNull String regId) {
        LocalDateTime now = LocalDateTime.now(ZoneId.of(Const.ZoneId.UTC));

        InsertSetMoreStep<IxicRecord> query = this.queryInsert(
                tIxic,
                new IxicRecord(
                        ixic.getTitle(),
                        ixic.getPrice(),
                        ixic.getPriceChange(),
                        ixic.getPriceChangePercent(),
                        ixic.getUrl(),
                        now,
                        regId,
                        now,
                        regId));

        return query.execute();
    }

    public Optional<Ixic> selectRecentOne() {
        SelectConditionStep<Record> query = this.querySelect(
                tIxic,
                DSL.noCondition());

        return Optional.ofNullable(query
                .orderBy(tIxic.REG_DATETIME.desc())
                .limit(1)
                .fetchOneInto(Ixic.class));
    }

    public int delete(@NonNull LocalDateTime untilDateTime) {
        DeleteConditionStep<IxicRecord> query = this.queryDelete(
                tIxic,
                tIxic.REG_DATETIME.lessThan(untilDateTime));

        return query.execute();
    }
}
