package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.Spec;

public interface SpecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Spec record);

    int insertSelective(Spec record);

    Spec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Spec record);

    int updateByPrimaryKey(Spec record);
}