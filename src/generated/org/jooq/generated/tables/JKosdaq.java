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
import org.jooq.generated.JSlickProd;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.records.KosdaqRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JKosdaq extends TableImpl<KosdaqRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>slick_prod.KOSDAQ</code>
     */
    public static final JKosdaq KOSDAQ = new JKosdaq();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<KosdaqRecord> getRecordType() {
        return KosdaqRecord.class;
    }

    /**
     * The column <code>slick_prod.KOSDAQ.TITLE</code>.
     */
    public final TableField<KosdaqRecord, String> TITLE = createField(DSL.name("TITLE"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>slick_prod.KOSDAQ.PRICE</code>.
     */
    public final TableField<KosdaqRecord, String> PRICE = createField(DSL.name("PRICE"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>slick_prod.KOSDAQ.PRICE_CHANGE</code>.
     */
    public final TableField<KosdaqRecord, String> PRICE_CHANGE = createField(DSL.name("PRICE_CHANGE"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>slick_prod.KOSDAQ.PRICE_CHANGE_PERCENT</code>.
     */
    public final TableField<KosdaqRecord, String> PRICE_CHANGE_PERCENT = createField(DSL.name("PRICE_CHANGE_PERCENT"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>slick_prod.KOSDAQ.URL</code>.
     */
    public final TableField<KosdaqRecord, String> URL = createField(DSL.name("URL"), SQLDataType.VARCHAR(500).nullable(false), this, "");

    /**
     * The column <code>slick_prod.KOSDAQ.REG_DATETIME</code>.
     */
    public final TableField<KosdaqRecord, LocalDateTime> REG_DATETIME = createField(DSL.name("REG_DATETIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>slick_prod.KOSDAQ.REG_ID</code>.
     */
    public final TableField<KosdaqRecord, String> REG_ID = createField(DSL.name("REG_ID"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>slick_prod.KOSDAQ.UPT_DATETIME</code>.
     */
    public final TableField<KosdaqRecord, LocalDateTime> UPT_DATETIME = createField(DSL.name("UPT_DATETIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>slick_prod.KOSDAQ.UPT_ID</code>.
     */
    public final TableField<KosdaqRecord, String> UPT_ID = createField(DSL.name("UPT_ID"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    private JKosdaq(Name alias, Table<KosdaqRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JKosdaq(Name alias, Table<KosdaqRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>slick_prod.KOSDAQ</code> table reference
     */
    public JKosdaq(String alias) {
        this(DSL.name(alias), KOSDAQ);
    }

    /**
     * Create an aliased <code>slick_prod.KOSDAQ</code> table reference
     */
    public JKosdaq(Name alias) {
        this(alias, KOSDAQ);
    }

    /**
     * Create a <code>slick_prod.KOSDAQ</code> table reference
     */
    public JKosdaq() {
        this(DSL.name("KOSDAQ"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSlickProd.SLICK_PROD;
    }

    @Override
    public UniqueKey<KosdaqRecord> getPrimaryKey() {
        return Keys.KEY_KOSDAQ_PRIMARY;
    }

    @Override
    public JKosdaq as(String alias) {
        return new JKosdaq(DSL.name(alias), this);
    }

    @Override
    public JKosdaq as(Name alias) {
        return new JKosdaq(alias, this);
    }

    @Override
    public JKosdaq as(Table<?> alias) {
        return new JKosdaq(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JKosdaq rename(String name) {
        return new JKosdaq(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JKosdaq rename(Name name) {
        return new JKosdaq(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JKosdaq rename(Table<?> name) {
        return new JKosdaq(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JKosdaq where(Condition condition) {
        return new JKosdaq(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JKosdaq where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JKosdaq where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JKosdaq where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JKosdaq where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JKosdaq where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JKosdaq where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JKosdaq where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JKosdaq whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JKosdaq whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
