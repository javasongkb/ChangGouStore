package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.SecKillGoods;

public interface SecKillGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SecKillGoods record);

    int insertSelective(SecKillGoods record);

    SecKillGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SecKillGoods record);

    int updateByPrimaryKey(SecKillGoods record);
}