package com.javasongkb.changgou.service;

import com.github.pagehelper.Page;
import com.javasongkb.changgou.model.Brand;
import com.javasongkb.changgou.pojo.Result;

import java.util.List;

/**
 * ClassName:BrandService
 * Package:com.javasongkb.changgou.service
 * Description:
 *
 * @date:2021/1/7 13:36
 * @outhor:宋凯标
 */
public interface BrandService {
    Page<Brand> findAll(String input);

    Result queryBrand(String input);

    Result addBrand(String input);

    Result updateBrand(String input);

    Result deleteBrand(String input);

    Result queryBrandByCategory(String input);
}
