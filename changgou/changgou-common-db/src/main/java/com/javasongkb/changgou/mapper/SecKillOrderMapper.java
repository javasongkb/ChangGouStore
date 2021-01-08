package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.SecKillOrder;

public interface SecKillOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SecKillOrder record);

    int insertSelective(SecKillOrder record);

    SecKillOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SecKillOrder record);

    int updateByPrimaryKey(SecKillOrder record);
}