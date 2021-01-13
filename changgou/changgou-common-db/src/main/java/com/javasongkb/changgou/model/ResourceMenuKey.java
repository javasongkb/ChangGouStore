package com.javasongkb.changgou.model;

import java.io.Serializable;

public class ResourceMenuKey implements Serializable {
    private Integer resourceId;

    private String menuId;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}