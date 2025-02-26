/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.generated.tables.JDji;
import org.jooq.generated.tables.JEconomicEvent;
import org.jooq.generated.tables.JFearAndGreed;
import org.jooq.generated.tables.JHoliday;
import org.jooq.generated.tables.JIxic;
import org.jooq.generated.tables.JKosdaq;
import org.jooq.generated.tables.JKospi;
import org.jooq.generated.tables.JSpx;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JSlickDev extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>slick_dev</code>
     */
    public static final JSlickDev SLICK_DEV = new JSlickDev();

    /**
     * The table <code>slick_dev.DJI</code>.
     */
    public final JDji DJI = JDji.DJI;

    /**
     * The table <code>slick_dev.ECONOMIC_EVENT</code>.
     */
    public final JEconomicEvent ECONOMIC_EVENT = JEconomicEvent.ECONOMIC_EVENT;

    /**
     * The table <code>slick_dev.FEAR_AND_GREED</code>.
     */
    public final JFearAndGreed FEAR_AND_GREED = JFearAndGreed.FEAR_AND_GREED;

    /**
     * The table <code>slick_dev.HOLIDAY</code>.
     */
    public final JHoliday HOLIDAY = JHoliday.HOLIDAY;

    /**
     * The table <code>slick_dev.IXIC</code>.
     */
    public final JIxic IXIC = JIxic.IXIC;

    /**
     * The table <code>slick_dev.KOSDAQ</code>.
     */
    public final JKosdaq KOSDAQ = JKosdaq.KOSDAQ;

    /**
     * The table <code>slick_dev.KOSPI</code>.
     */
    public final JKospi KOSPI = JKospi.KOSPI;

    /**
     * The table <code>slick_dev.SPX</code>.
     */
    public final JSpx SPX = JSpx.SPX;

    /**
     * No further instances allowed
     */
    private JSlickDev() {
        super("slick_dev", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            JDji.DJI,
            JEconomicEvent.ECONOMIC_EVENT,
            JFearAndGreed.FEAR_AND_GREED,
            JHoliday.HOLIDAY,
            JIxic.IXIC,
            JKosdaq.KOSDAQ,
            JKospi.KOSPI,
            JSpx.SPX
        );
    }
}
