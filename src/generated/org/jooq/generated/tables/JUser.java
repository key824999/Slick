/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Index;
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
import org.jooq.generated.Indexes;
import org.jooq.generated.JSlickProd;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.records.UserRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JUser extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>slick_prod.USER</code>
     */
    public static final JUser USER = new JUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>slick_prod.USER.EMAIL</code>.
     */
    public final TableField<UserRecord, String> EMAIL = createField(DSL.name("EMAIL"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>slick_prod.USER.PASSWORD</code>.
     */
    public final TableField<UserRecord, String> PASSWORD = createField(DSL.name("PASSWORD"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>slick_prod.USER.REG_DATETIME</code>.
     */
    public final TableField<UserRecord, LocalDateTime> REG_DATETIME = createField(DSL.name("REG_DATETIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>slick_prod.USER.REG_ID</code>.
     */
    public final TableField<UserRecord, String> REG_ID = createField(DSL.name("REG_ID"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>slick_prod.USER.UPT_DATETIME</code>.
     */
    public final TableField<UserRecord, LocalDateTime> UPT_DATETIME = createField(DSL.name("UPT_DATETIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>slick_prod.USER.UPT_ID</code>.
     */
    public final TableField<UserRecord, String> UPT_ID = createField(DSL.name("UPT_ID"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    private JUser(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JUser(Name alias, Table<UserRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>slick_prod.USER</code> table reference
     */
    public JUser(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>slick_prod.USER</code> table reference
     */
    public JUser(Name alias) {
        this(alias, USER);
    }

    /**
     * Create a <code>slick_prod.USER</code> table reference
     */
    public JUser() {
        this(DSL.name("USER"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSlickProd.SLICK_PROD;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.USER_USER_EMAIL_IDX);
    }

    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    @Override
    public JUser as(String alias) {
        return new JUser(DSL.name(alias), this);
    }

    @Override
    public JUser as(Name alias) {
        return new JUser(alias, this);
    }

    @Override
    public JUser as(Table<?> alias) {
        return new JUser(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JUser rename(String name) {
        return new JUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JUser rename(Name name) {
        return new JUser(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JUser rename(Table<?> name) {
        return new JUser(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JUser where(Condition condition) {
        return new JUser(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JUser where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JUser where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JUser where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JUser where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JUser where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JUser where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JUser where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JUser whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JUser whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
