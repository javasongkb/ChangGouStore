package com.javasongkb.changgou.mapper;

import com.javasongkb.changgou.model.CategoryBrandKey;

public interface CategoryBrandMapper {
    int deleteByPrimaryKey(CategoryBrandKey key);

    int insert(CategoryBrandKey record);

    int insertSelective(CategoryBrandKey record);
}