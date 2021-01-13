package com.javasongkb.changgou.model;

import java.io.Serializable;

public class OauthAccessTokenWithBLOBs extends OauthAccessToken implements Serializable {
    private byte[] token;

    private byte[] authentication;

    public byte[] getToken() {
        return token;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }

    public byte[] getAuthentication() {
        return authentication;
    }

    public void setAuthentication(byte[] authentication) {
        this.authentication = authentication;
    }
}