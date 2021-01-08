package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.Provinces;

public interface ProvincesMapper {
    int deleteByPrimaryKey(String provinceid);

    int insert(Provinces record);

    int insertSelective(Provinces record);

    Provinces selectByPrimaryKey(String provinceid);

    int updateByPrimaryKeySelective(Provinces record);

    int updateByPrimaryKey(Provinces record);
}