package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.OrderItem;

public interface OrderItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}