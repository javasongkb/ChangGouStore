package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.Preferential;

public interface PreferentialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Preferential record);

    int insertSelective(Preferential record);

    Preferential selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Preferential record);

    int updateByPrimaryKey(Preferential record);
}