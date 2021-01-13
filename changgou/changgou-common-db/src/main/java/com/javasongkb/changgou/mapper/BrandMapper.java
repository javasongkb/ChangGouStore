package com.javasongkb.changgou.mapper;

import com.github.pagehelper.Page;
import com.javasongkb.changgou.model.Brand;

import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    List<Brand> findAll();

    List<Brand> selectBrand(Brand brand);

    Page<Brand> selectBrandByCategory(Integer id);
}