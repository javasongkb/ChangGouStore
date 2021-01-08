package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.ReturnOrderItem;

public interface ReturnOrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(ReturnOrderItem record);

    int insertSelective(ReturnOrderItem record);

    ReturnOrderItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ReturnOrderItem record);

    int updateByPrimaryKey(ReturnOrderItem record);
}