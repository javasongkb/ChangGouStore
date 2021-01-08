package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.RoleResourceKey;

public interface RoleResourceMapper {
    int deleteByPrimaryKey(RoleResourceKey key);

    int insert(RoleResourceKey record);

    int insertSelective(RoleResourceKey record);
}