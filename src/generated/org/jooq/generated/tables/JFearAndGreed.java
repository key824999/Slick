/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.time.LocalDateTime;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.generated.JFreedb_Mysql_8_0;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.records.FearAndGreedRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JFearAndGreed extends TableImpl<FearAndGreedRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>freedb_ MySQL 8.0.FEAR_AND_GREED</code>
     */
    public static final JFearAndGreed FEAR_AND_GREED = new JFearAndGreed();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FearAndGreedRecord> getRecordType() {
        return FearAndGreedRecord.class;
    }

    /**
     * The column <code>freedb_ MySQL 8.0.FEAR_AND_GREED.RATING</code>.
     */
    public final TableField<FearAndGreedRecord, String> RATING = createField(DSL.name("RATING"), SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>freedb_ MySQL 8.0.FEAR_AND_GREED.SCORE</code>.
     */
    public final TableField<FearAndGreedRecord, Double> SCORE = createField(DSL.name("SCORE"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>freedb_ MySQL 8.0.FEAR_AND_GREED.REG_DATETIME</code>.
     */
    public final TableField<FearAndGreedRecord, LocalDateTime> REG_DATETIME = createField(DSL.name("REG_DATETIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>freedb_ MySQL 8.0.FEAR_AND_GREED.REG_ID</code>.
     */
    public final TableField<FearAndGreedRecord, String> REG_ID = createField(DSL.name("REG_ID"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>freedb_ MySQL 8.0.FEAR_AND_GREED.UPT_DATETIME</code>.
     */
    public final TableField<FearAndGreedRecord, LocalDateTime> UPT_DATETIME = createField(DSL.name("UPT_DATETIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>freedb_ MySQL 8.0.FEAR_AND_GREED.UPT_ID</code>.
     */
    public final TableField<FearAndGreedRecord, String> UPT_ID = createField(DSL.name("UPT_ID"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    private JFearAndGreed(Name alias, Table<FearAndGreedRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JFearAndGreed(Name alias, Table<FearAndGreedRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>freedb_ MySQL 8.0.FEAR_AND_GREED</code> table
     * reference
     */
    public JFearAndGreed(String alias) {
        this(DSL.name(alias), FEAR_AND_GREED);
    }

    /**
     * Create an aliased <code>freedb_ MySQL 8.0.FEAR_AND_GREED</code> table
     * reference
     */
    public JFearAndGreed(Name alias) {
        this(alias, FEAR_AND_GREED);
    }

    /**
     * Create a <code>freedb_ MySQL 8.0.FEAR_AND_GREED</code> table reference
     */
    public JFearAndGreed() {
        this(DSL.name("FEAR_AND_GREED"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JFreedb_Mysql_8_0.FREEDB__MYSQL_8_0;
    }

    @Override
    public UniqueKey<FearAndGreedRecord> getPrimaryKey() {
        return Keys.KEY_FEAR_AND_GREED_PRIMARY;
    }

    @Override
    public JFearAndGreed as(String alias) {
        return new JFearAndGreed(DSL.name(alias), this);
    }

    @Override
    public JFearAndGreed as(Name alias) {
        return new JFearAndGreed(alias, this);
    }

    @Override
    public JFearAndGreed as(Table<?> alias) {
        return new JFearAndGreed(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JFearAndGreed rename(String name) {
        return new JFearAndGreed(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JFearAndGreed rename(Name name) {
        return new JFearAndGreed(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JFearAndGreed rename(Table<?> name) {
        return new JFearAndGreed(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JFearAndGreed where(Condition condition) {
        return new JFearAndGreed(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JFearAndGreed where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JFearAndGreed where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JFearAndGreed where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JFearAndGreed where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JFearAndGreed where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JFearAndGreed where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JFearAndGreed where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JFearAndGreed whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JFearAndGreed whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
