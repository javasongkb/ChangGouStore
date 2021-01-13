package com.javasongkb.changgou.model;

import java.io.Serializable;

public class Provinces implements Serializable {
    private String provinceid;

    private String province;

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}