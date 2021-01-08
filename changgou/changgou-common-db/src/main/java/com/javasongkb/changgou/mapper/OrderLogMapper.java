package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.OrderLog;

public interface OrderLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderLog record);

    int insertSelective(OrderLog record);

    OrderLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderLog record);

    int updateByPrimaryKey(OrderLog record);
}