package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.AdminRoleKey;

public interface AdminRoleMapper {
    int deleteByPrimaryKey(AdminRoleKey key);

    int insert(AdminRoleKey record);

    int insertSelective(AdminRoleKey record);
}