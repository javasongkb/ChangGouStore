package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.StockBack;
import com.javasongkb.changgou.model.StockBackKey;

public interface StockBackMapper {
    int deleteByPrimaryKey(StockBackKey key);

    int insert(StockBack record);

    int insertSelective(StockBack record);

    StockBack selectByPrimaryKey(StockBackKey key);

    int updateByPrimaryKeySelective(StockBack record);

    int updateByPrimaryKey(StockBack record);
}