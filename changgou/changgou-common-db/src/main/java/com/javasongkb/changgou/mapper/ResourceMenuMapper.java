package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.ResourceMenuKey;

public interface ResourceMenuMapper {
    int deleteByPrimaryKey(ResourceMenuKey key);

    int insert(ResourceMenuKey record);

    int insertSelective(ResourceMenuKey record);
}