package com.javasongkb.changgou.model;

import java.util.Date;

public class OauthApprovals {
    private String userid;

    private String clientid;

    private String scope;

    private String status;

    private Date expiresat;

    private Date lastmodifiedat;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getExpiresat() {
        return expiresat;
    }

    public void setExpiresat(Date expiresat) {
        this.expiresat = expiresat;
    }

    public Date getLastmodifiedat() {
        return lastmodifiedat;
    }

    public void setLastmodifiedat(Date lastmodifiedat) {
        this.lastmodifiedat = lastmodifiedat;
    }
}