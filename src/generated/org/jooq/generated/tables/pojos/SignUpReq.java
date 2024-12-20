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
@lombok.Builder
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SignUpReq implements Serializable {

    private static final long serialVersionUID = 1L;

    private String email;
    private String password;
    private String authCode;
    private LocalDateTime regDatetime;
    private String regId;
    private LocalDateTime uptDatetime;
    private String uptId;

    public SignUpReq() {}

    public SignUpReq(SignUpReq value) {
        this.email = value.email;
        this.password = value.password;
        this.authCode = value.authCode;
        this.regDatetime = value.regDatetime;
        this.regId = value.regId;
        this.uptDatetime = value.uptDatetime;
        this.uptId = value.uptId;
    }

    public SignUpReq(
        String email,
        String password,
        String authCode,
        LocalDateTime regDatetime,
        String regId,
        LocalDateTime uptDatetime,
        String uptId
    ) {
        this.email = email;
        this.password = password;
        this.authCode = authCode;
        this.regDatetime = regDatetime;
        this.regId = regId;
        this.uptDatetime = uptDatetime;
        this.uptId = uptId;
    }

    /**
     * Getter for <code>slick_prod.SIGN_UP_REQ.EMAIL</code>.
     */
    @NotNull
    @Size(max = 100)
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>slick_prod.SIGN_UP_REQ.EMAIL</code>.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for <code>slick_prod.SIGN_UP_REQ.PASSWORD</code>.
     */
    @NotNull
    @Size(max = 128)
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>slick_prod.SIGN_UP_REQ.PASSWORD</code>.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for <code>slick_prod.SIGN_UP_REQ.AUTH_CODE</code>.
     */
    @NotNull
    @Size(max = 128)
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * Setter for <code>slick_prod.SIGN_UP_REQ.AUTH_CODE</code>.
     */
    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * Getter for <code>slick_prod.SIGN_UP_REQ.REG_DATETIME</code>.
     */
    @NotNull
    public LocalDateTime getRegDatetime() {
        return this.regDatetime;
    }

    /**
     * Setter for <code>slick_prod.SIGN_UP_REQ.REG_DATETIME</code>.
     */
    public void setRegDatetime(LocalDateTime regDatetime) {
        this.regDatetime = regDatetime;
    }

    /**
     * Getter for <code>slick_prod.SIGN_UP_REQ.REG_ID</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getRegId() {
        return this.regId;
    }

    /**
     * Setter for <code>slick_prod.SIGN_UP_REQ.REG_ID</code>.
     */
    public void setRegId(String regId) {
        this.regId = regId;
    }

    /**
     * Getter for <code>slick_prod.SIGN_UP_REQ.UPT_DATETIME</code>.
     */
    @NotNull
    public LocalDateTime getUptDatetime() {
        return this.uptDatetime;
    }

    /**
     * Setter for <code>slick_prod.SIGN_UP_REQ.UPT_DATETIME</code>.
     */
    public void setUptDatetime(LocalDateTime uptDatetime) {
        this.uptDatetime = uptDatetime;
    }

    /**
     * Getter for <code>slick_prod.SIGN_UP_REQ.UPT_ID</code>.
     */
    @NotNull
    @Size(max = 200)
    public String getUptId() {
        return this.uptId;
    }

    /**
     * Setter for <code>slick_prod.SIGN_UP_REQ.UPT_ID</code>.
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
        final SignUpReq other = (SignUpReq) obj;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        if (this.authCode == null) {
            if (other.authCode != null)
                return false;
        }
        else if (!this.authCode.equals(other.authCode))
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
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.authCode == null) ? 0 : this.authCode.hashCode());
        result = prime * result + ((this.regDatetime == null) ? 0 : this.regDatetime.hashCode());
        result = prime * result + ((this.regId == null) ? 0 : this.regId.hashCode());
        result = prime * result + ((this.uptDatetime == null) ? 0 : this.uptDatetime.hashCode());
        result = prime * result + ((this.uptId == null) ? 0 : this.uptId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SignUpReq (");

        sb.append(email);
        sb.append(", ").append(password);
        sb.append(", ").append(authCode);
        sb.append(", ").append(regDatetime);
        sb.append(", ").append(regId);
        sb.append(", ").append(uptDatetime);
        sb.append(", ").append(uptId);

        sb.append(")");
        return sb.toString();
    }
}
