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
import org.jooq.generated.tables.records.SignUpReqRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class JSignUpReq extends TableImpl<SignUpReqRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>slick_prod.SIGN_UP_REQ</code>
     */
    public static final JSignUpReq SIGN_UP_REQ = new JSignUpReq();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SignUpReqRecord> getRecordType() {
        return SignUpReqRecord.class;
    }

    /**
     * The column <code>slick_prod.SIGN_UP_REQ.EMAIL</code>.
     */
    public final TableField<SignUpReqRecord, String> EMAIL = createField(DSL.name("EMAIL"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>slick_prod.SIGN_UP_REQ.PASSWORD</code>.
     */
    public final TableField<SignUpReqRecord, String> PASSWORD = createField(DSL.name("PASSWORD"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>slick_prod.SIGN_UP_REQ.AUTH_CODE</code>.
     */
    public final TableField<SignUpReqRecord, String> AUTH_CODE = createField(DSL.name("AUTH_CODE"), SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>slick_prod.SIGN_UP_REQ.REG_DATETIME</code>.
     */
    public final TableField<SignUpReqRecord, LocalDateTime> REG_DATETIME = createField(DSL.name("REG_DATETIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>slick_prod.SIGN_UP_REQ.REG_ID</code>.
     */
    public final TableField<SignUpReqRecord, String> REG_ID = createField(DSL.name("REG_ID"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>slick_prod.SIGN_UP_REQ.UPT_DATETIME</code>.
     */
    public final TableField<SignUpReqRecord, LocalDateTime> UPT_DATETIME = createField(DSL.name("UPT_DATETIME"), SQLDataType.LOCALDATETIME(0).nullable(false), this, "");

    /**
     * The column <code>slick_prod.SIGN_UP_REQ.UPT_ID</code>.
     */
    public final TableField<SignUpReqRecord, String> UPT_ID = createField(DSL.name("UPT_ID"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    private JSignUpReq(Name alias, Table<SignUpReqRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private JSignUpReq(Name alias, Table<SignUpReqRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>slick_prod.SIGN_UP_REQ</code> table reference
     */
    public JSignUpReq(String alias) {
        this(DSL.name(alias), SIGN_UP_REQ);
    }

    /**
     * Create an aliased <code>slick_prod.SIGN_UP_REQ</code> table reference
     */
    public JSignUpReq(Name alias) {
        this(alias, SIGN_UP_REQ);
    }

    /**
     * Create a <code>slick_prod.SIGN_UP_REQ</code> table reference
     */
    public JSignUpReq() {
        this(DSL.name("SIGN_UP_REQ"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : JSlickProd.SLICK_PROD;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.SIGN_UP_REQ_SIGN_UP_REQ_EMAIL_IDX, Indexes.SIGN_UP_REQ_SIGN_UP_REQ_REG_DATETIME_IDX);
    }

    @Override
    public UniqueKey<SignUpReqRecord> getPrimaryKey() {
        return Keys.KEY_SIGN_UP_REQ_PRIMARY;
    }

    @Override
    public JSignUpReq as(String alias) {
        return new JSignUpReq(DSL.name(alias), this);
    }

    @Override
    public JSignUpReq as(Name alias) {
        return new JSignUpReq(alias, this);
    }

    @Override
    public JSignUpReq as(Table<?> alias) {
        return new JSignUpReq(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public JSignUpReq rename(String name) {
        return new JSignUpReq(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JSignUpReq rename(Name name) {
        return new JSignUpReq(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public JSignUpReq rename(Table<?> name) {
        return new JSignUpReq(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSignUpReq where(Condition condition) {
        return new JSignUpReq(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSignUpReq where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSignUpReq where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSignUpReq where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JSignUpReq where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JSignUpReq where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JSignUpReq where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public JSignUpReq where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSignUpReq whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public JSignUpReq whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
