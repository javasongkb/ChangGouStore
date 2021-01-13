package com.javasongkb.changgou.mapper;

import com.github.pagehelper.Page;
import com.javasongkb.changgou.model.Brand;
import com.javasongkb.changgou.model.Spec;

public interface SpecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Spec record);

    int insertSelective(Spec record);

    Spec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Spec record);

    int updateByPrimaryKey(Spec record);

    Page<Spec> selectSpecByCategoryId(Integer id);
}