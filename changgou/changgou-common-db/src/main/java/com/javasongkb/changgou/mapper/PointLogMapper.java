package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.PointLog;

public interface PointLogMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(PointLog record);

    int insertSelective(PointLog record);

    PointLog selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(PointLog record);

    int updateByPrimaryKey(PointLog record);
}