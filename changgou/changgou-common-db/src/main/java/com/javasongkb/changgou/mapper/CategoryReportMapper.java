package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.CategoryReport;
import com.javasongkb.changgou.model.CategoryReportKey;

public interface CategoryReportMapper {
    int deleteByPrimaryKey(CategoryReportKey key);

    int insert(CategoryReport record);

    int insertSelective(CategoryReport record);

    CategoryReport selectByPrimaryKey(CategoryReportKey key);

    int updateByPrimaryKeySelective(CategoryReport record);

    int updateByPrimaryKey(CategoryReport record);
}