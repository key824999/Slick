/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.pojos;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.time.LocalDateTime;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class EconomicIndex implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String price;
    private String priceChange;
    private String priceChangePercent;
    private LocalDateTime regDatetime;
    private String regId;
    private LocalDateTime uptDatetime;
    private String uptId;
    private String url;
    private String title;

    public EconomicIndex() {}

    public EconomicIndex(EconomicIndex value) {
        this.code = value.code;
        this.price = value.price;
        this.priceChange = value.priceChange;
        this.priceChangePercent = value.priceChangePercent;
        this.regDatetime = value.regDatetime;
        this.regId = value.regId;
        this.uptDatetime = value.uptDatetime;
        this.uptId = value.uptId;
        this.url = value.url;
        this.title = value.title;
    }

    public EconomicIndex(
        String code,
        String price,
        String priceChange,
        String priceChangePercent,
        LocalDateTime regDatetime,
        String regId,
        LocalDateTime uptDatetime,
        String uptId,
        String url,
        String title
    ) {
        this.code = code;
        this.price = price;
        this.priceChange = priceChange;
        this.priceChangePercent = priceChangePercent;
        this.regDatetime = regDatetime;
        this.regId = regId;
        this.uptDatetime = uptDatetime;
        this.uptId = uptId;
        this.url = url;
        this.title = title;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.CODE</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.CODE</code>.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.PRICE</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getPrice() {
        return this.price;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.PRICE</code>.
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.PRICE_CHANGE</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getPriceChange() {
        return this.priceChange;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.PRICE_CHANGE</code>.
     */
    public void setPriceChange(String priceChange) {
        this.priceChange = priceChange;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.PRICE_CHANGE_PERCENT</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getPriceChangePercent() {
        return this.priceChangePercent;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.PRICE_CHANGE_PERCENT</code>.
     */
    public void setPriceChangePercent(String priceChangePercent) {
        this.priceChangePercent = priceChangePercent;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.REG_DATETIME</code>.
     */
    @NotNull
    public LocalDateTime getRegDatetime() {
        return this.regDatetime;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.REG_DATETIME</code>.
     */
    public void setRegDatetime(LocalDateTime regDatetime) {
        this.regDatetime = regDatetime;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.REG_ID</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getRegId() {
        return this.regId;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.REG_ID</code>.
     */
    public void setRegId(String regId) {
        this.regId = regId;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.UPT_DATETIME</code>.
     */
    @NotNull
    public LocalDateTime getUptDatetime() {
        return this.uptDatetime;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.UPT_DATETIME</code>.
     */
    public void setUptDatetime(LocalDateTime uptDatetime) {
        this.uptDatetime = uptDatetime;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.UPT_ID</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getUptId() {
        return this.uptId;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.UPT_ID</code>.
     */
    public void setUptId(String uptId) {
        this.uptId = uptId;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.URL</code>.
     */
    @NotNull
    @Size(max = 500)
    public String getUrl() {
        return this.url;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.URL</code>.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for <code>slick_prod.ECONOMIC_INDEX.TITLE</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>slick_prod.ECONOMIC_INDEX.TITLE</code>.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final EconomicIndex other = (EconomicIndex) obj;
        if (this.code == null) {
            if (other.code != null)
                return false;
        }
        else if (!this.code.equals(other.code))
            return false;
        if (this.price == null) {
            if (other.price != null)
                return false;
        }
        else if (!this.price.equals(other.price))
            return false;
        if (this.priceChange == null) {
            if (other.priceChange != null)
                return false;
        }
        else if (!this.priceChange.equals(other.priceChange))
            return false;
        if (this.priceChangePercent == null) {
            if (other.priceChangePercent != null)
                return false;
        }
        else if (!this.priceChangePercent.equals(other.priceChangePercent))
            return false;
        if (this.regDatetime == null) {
            if (other.regDatetime != null)
                return false;
        }
        else if (!this.regDatetime.equals(other.regDatetime))
            return false;
        if (this.regId == null) {
            if (other.regId != null)
                return false;
        }
        else if (!this.regId.equals(other.regId))
            return false;
        if (this.uptDatetime == null) {
            if (other.uptDatetime != null)
                return false;
        }
        else if (!this.uptDatetime.equals(other.uptDatetime))
            return false;
        if (this.uptId == null) {
            if (other.uptId != null)
                return false;
        }
        else if (!this.uptId.equals(other.uptId))
            return false;
        if (this.url == null) {
            if (other.url != null)
                return false;
        }
        else if (!this.url.equals(other.url))
            return false;
        if (this.title == null) {
            if (other.title != null)
                return false;
        }
        else if (!this.title.equals(other.title))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.code == null) ? 0 : this.code.hashCode());
        result = prime * result + ((this.price == null) ? 0 : this.price.hashCode());
        result = prime * result + ((this.priceChange == null) ? 0 : this.priceChange.hashCode());
        result = prime * result + ((this.priceChangePercent == null) ? 0 : this.priceChangePercent.hashCode());
        result = prime * result + ((this.regDatetime == null) ? 0 : this.regDatetime.hashCode());
        result = prime * result + ((this.regId == null) ? 0 : this.regId.hashCode());
        result = prime * result + ((this.uptDatetime == null) ? 0 : this.uptDatetime.hashCode());
        result = prime * result + ((this.uptId == null) ? 0 : this.uptId.hashCode());
        result = prime * result + ((this.url == null) ? 0 : this.url.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("EconomicIndex (");

        sb.append(code);
        sb.append(", ").append(price);
        sb.append(", ").append(priceChange);
        sb.append(", ").append(priceChangePercent);
        sb.append(", ").append(regDatetime);
        sb.append(", ").append(regId);
        sb.append(", ").append(uptDatetime);
        sb.append(", ").append(uptId);
        sb.append(", ").append(url);
        sb.append(", ").append(title);

        sb.append(")");
        return sb.toString();
    }
}
