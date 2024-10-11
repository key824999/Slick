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
public class FearAndGreed implements Serializable {

    private static final long serialVersionUID = 1L;

    private String rating;
    private Double score;
    private LocalDateTime regDatetime;
    private String regId;
    private LocalDateTime uptDatetime;
    private String uptId;

    public FearAndGreed() {}

    public FearAndGreed(FearAndGreed value) {
        this.rating = value.rating;
        this.score = value.score;
        this.regDatetime = value.regDatetime;
        this.regId = value.regId;
        this.uptDatetime = value.uptDatetime;
        this.uptId = value.uptId;
    }

    public FearAndGreed(
        String rating,
        Double score,
        LocalDateTime regDatetime,
        String regId,
        LocalDateTime uptDatetime,
        String uptId
    ) {
        this.rating = rating;
        this.score = score;
        this.regDatetime = regDatetime;
        this.regId = regId;
        this.uptDatetime = uptDatetime;
        this.uptId = uptId;
    }

    /**
     * Getter for <code>slick_prod.FEAR_AND_GREED.RATING</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getRating() {
        return this.rating;
    }

    /**
     * Setter for <code>slick_prod.FEAR_AND_GREED.RATING</code>.
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     * Getter for <code>slick_prod.FEAR_AND_GREED.SCORE</code>.
     */
    @NotNull
    public Double getScore() {
        return this.score;
    }

    /**
     * Setter for <code>slick_prod.FEAR_AND_GREED.SCORE</code>.
     */
    public void setScore(Double score) {
        this.score = score;
    }

    /**
     * Getter for <code>slick_prod.FEAR_AND_GREED.REG_DATETIME</code>.
     */
    @NotNull
    public LocalDateTime getRegDatetime() {
        return this.regDatetime;
    }

    /**
     * Setter for <code>slick_prod.FEAR_AND_GREED.REG_DATETIME</code>.
     */
    public void setRegDatetime(LocalDateTime regDatetime) {
        this.regDatetime = regDatetime;
    }

    /**
     * Getter for <code>slick_prod.FEAR_AND_GREED.REG_ID</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getRegId() {
        return this.regId;
    }

    /**
     * Setter for <code>slick_prod.FEAR_AND_GREED.REG_ID</code>.
     */
    public void setRegId(String regId) {
        this.regId = regId;
    }

    /**
     * Getter for <code>slick_prod.FEAR_AND_GREED.UPT_DATETIME</code>.
     */
    @NotNull
    public LocalDateTime getUptDatetime() {
        return this.uptDatetime;
    }

    /**
     * Setter for <code>slick_prod.FEAR_AND_GREED.UPT_DATETIME</code>.
     */
    public void setUptDatetime(LocalDateTime uptDatetime) {
        this.uptDatetime = uptDatetime;
    }

    /**
     * Getter for <code>slick_prod.FEAR_AND_GREED.UPT_ID</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getUptId() {
        return this.uptId;
    }

    /**
     * Setter for <code>slick_prod.FEAR_AND_GREED.UPT_ID</code>.
     */
    public void setUptId(String uptId) {
        this.uptId = uptId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final FearAndGreed other = (FearAndGreed) obj;
        if (this.rating == null) {
            if (other.rating != null)
                return false;
        }
        else if (!this.rating.equals(other.rating))
            return false;
        if (this.score == null) {
            if (other.score != null)
                return false;
        }
        else if (!this.score.equals(other.score))
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.rating == null) ? 0 : this.rating.hashCode());
        result = prime * result + ((this.score == null) ? 0 : this.score.hashCode());
        result = prime * result + ((this.regDatetime == null) ? 0 : this.regDatetime.hashCode());
        result = prime * result + ((this.regId == null) ? 0 : this.regId.hashCode());
        result = prime * result + ((this.uptDatetime == null) ? 0 : this.uptDatetime.hashCode());
        result = prime * result + ((this.uptId == null) ? 0 : this.uptId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FearAndGreed (");

        sb.append(rating);
        sb.append(", ").append(score);
        sb.append(", ").append(regDatetime);
        sb.append(", ").append(regId);
        sb.append(", ").append(uptDatetime);
        sb.append(", ").append(uptId);

        sb.append(")");
        return sb.toString();
    }
}
