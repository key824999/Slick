/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.generated.tables.JIxic;
import org.jooq.generated.tables.pojos.Ixic;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class IxicRecord extends UpdatableRecordImpl<IxicRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>slick_prod.IXIC.TITLE</code>.
     */
    public void setTitle(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>slick_prod.IXIC.TITLE</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getTitle() {
        return (String) get(0);
    }

    /**
     * Setter for <code>slick_prod.IXIC.PRICE</code>.
     */
    public void setPrice(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>slick_prod.IXIC.PRICE</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getPrice() {
        return (String) get(1);
    }

    /**
     * Setter for <code>slick_prod.IXIC.PRICE_CHANGE</code>.
     */
    public void setPriceChange(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>slick_prod.IXIC.PRICE_CHANGE</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getPriceChange() {
        return (String) get(2);
    }

    /**
     * Setter for <code>slick_prod.IXIC.PRICE_CHANGE_PERCENT</code>.
     */
    public void setPriceChangePercent(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>slick_prod.IXIC.PRICE_CHANGE_PERCENT</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getPriceChangePercent() {
        return (String) get(3);
    }

    /**
     * Setter for <code>slick_prod.IXIC.URL</code>.
     */
    public void setUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>slick_prod.IXIC.URL</code>.
     */
    @NotNull
    @Size(max = 500)
    public String getUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>slick_prod.IXIC.REG_DATETIME</code>.
     */
    public void setRegDatetime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>slick_prod.IXIC.REG_DATETIME</code>.
     */
    @NotNull
    public LocalDateTime getRegDatetime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>slick_prod.IXIC.REG_ID</code>.
     */
    public void setRegId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>slick_prod.IXIC.REG_ID</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getRegId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>slick_prod.IXIC.UPT_DATETIME</code>.
     */
    public void setUptDatetime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>slick_prod.IXIC.UPT_DATETIME</code>.
     */
    @NotNull
    public LocalDateTime getUptDatetime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>slick_prod.IXIC.UPT_ID</code>.
     */
    public void setUptId(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>slick_prod.IXIC.UPT_ID</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getUptId() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<LocalDateTime> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IxicRecord
     */
    public IxicRecord() {
        super(JIxic.IXIC);
    }

    /**
     * Create a detached, initialised IxicRecord
     */
    public IxicRecord(String title, String price, String priceChange, String priceChangePercent, String url, LocalDateTime regDatetime, String regId, LocalDateTime uptDatetime, String uptId) {
        super(JIxic.IXIC);

        setTitle(title);
        setPrice(price);
        setPriceChange(priceChange);
        setPriceChangePercent(priceChangePercent);
        setUrl(url);
        setRegDatetime(regDatetime);
        setRegId(regId);
        setUptDatetime(uptDatetime);
        setUptId(uptId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised IxicRecord
     */
    public IxicRecord(Ixic value) {
        super(JIxic.IXIC);

        if (value != null) {
            setTitle(value.getTitle());
            setPrice(value.getPrice());
            setPriceChange(value.getPriceChange());
            setPriceChangePercent(value.getPriceChangePercent());
            setUrl(value.getUrl());
            setRegDatetime(value.getRegDatetime());
            setRegId(value.getRegId());
            setUptDatetime(value.getUptDatetime());
            setUptId(value.getUptId());
            resetChangedOnNotNull();
        }
    }
}
