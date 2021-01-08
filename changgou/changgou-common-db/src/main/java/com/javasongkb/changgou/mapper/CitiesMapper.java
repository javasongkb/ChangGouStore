package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.Cities;

public interface CitiesMapper {
    int deleteByPrimaryKey(String cityid);

    int insert(Cities record);

    int insertSelective(Cities record);

    Cities selectByPrimaryKey(String cityid);

    int updateByPrimaryKeySelective(Cities record);

    int updateByPrimaryKey(Cities record);
}