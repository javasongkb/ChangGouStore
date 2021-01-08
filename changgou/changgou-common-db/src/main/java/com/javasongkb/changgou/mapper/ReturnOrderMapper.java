package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.ReturnOrder;

public interface ReturnOrderMapper {
    int deleteByPrimaryKey(String id);

    int insert(ReturnOrder record);

    int insertSelective(ReturnOrder record);

    ReturnOrder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ReturnOrder record);

    int updateByPrimaryKey(ReturnOrder record);
}