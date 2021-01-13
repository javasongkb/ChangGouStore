package com.javasongkb.changgou.model;

import java.io.Serializable;

public class AdminRoleKey implements Serializable {
    private Integer adminId;

    private Integer roleId;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}