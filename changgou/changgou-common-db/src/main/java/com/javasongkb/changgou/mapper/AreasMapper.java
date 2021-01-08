package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.Areas;

public interface AreasMapper {
    int deleteByPrimaryKey(String areaid);

    int insert(Areas record);

    int insertSelective(Areas record);

    Areas selectByPrimaryKey(String areaid);

    int updateByPrimaryKeySelective(Areas record);

    int updateByPrimaryKey(Areas record);
}