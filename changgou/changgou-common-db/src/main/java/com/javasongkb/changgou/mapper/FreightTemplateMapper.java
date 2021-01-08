package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.FreightTemplate;

public interface FreightTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FreightTemplate record);

    int insertSelective(FreightTemplate record);

    FreightTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FreightTemplate record);

    int updateByPrimaryKey(FreightTemplate record);
}