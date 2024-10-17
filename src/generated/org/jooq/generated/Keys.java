/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.generated.tables.JApiKey;
import org.jooq.generated.tables.JEconomicEvent;
import org.jooq.generated.tables.JEconomicIndex;
import org.jooq.generated.tables.JFearAndGreed;
import org.jooq.generated.tables.JUser;
import org.jooq.generated.tables.records.ApiKeyRecord;
import org.jooq.generated.tables.records.EconomicEventRecord;
import org.jooq.generated.tables.records.EconomicIndexRecord;
import org.jooq.generated.tables.records.FearAndGreedRecord;
import org.jooq.generated.tables.records.UserRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * slick_dev.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ApiKeyRecord> KEY_API_KEY_API_KEY_UNIQUE = Internal.createUniqueKey(JApiKey.API_KEY, DSL.name("KEY_API_KEY_API_KEY_UNIQUE"), new TableField[] { JApiKey.API_KEY.EMAIL }, true);
    public static final UniqueKey<ApiKeyRecord> KEY_API_KEY_PRIMARY = Internal.createUniqueKey(JApiKey.API_KEY, DSL.name("KEY_API_KEY_PRIMARY"), new TableField[] { JApiKey.API_KEY.KEY }, true);
    public static final UniqueKey<EconomicEventRecord> KEY_ECONOMIC_EVENT_PRIMARY = Internal.createUniqueKey(JEconomicEvent.ECONOMIC_EVENT, DSL.name("KEY_ECONOMIC_EVENT_PRIMARY"), new TableField[] { JEconomicEvent.ECONOMIC_EVENT.ID }, true);
    public static final UniqueKey<EconomicIndexRecord> KEY_ECONOMIC_INDEX_PRIMARY = Internal.createUniqueKey(JEconomicIndex.ECONOMIC_INDEX, DSL.name("KEY_ECONOMIC_INDEX_PRIMARY"), new TableField[] { JEconomicIndex.ECONOMIC_INDEX.CODE }, true);
    public static final UniqueKey<FearAndGreedRecord> KEY_FEAR_AND_GREED_PRIMARY = Internal.createUniqueKey(JFearAndGreed.FEAR_AND_GREED, DSL.name("KEY_FEAR_AND_GREED_PRIMARY"), new TableField[] { JFearAndGreed.FEAR_AND_GREED.REG_DATETIME }, true);
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(JUser.USER, DSL.name("KEY_USER_PRIMARY"), new TableField[] { JUser.USER.EMAIL }, true);
}
