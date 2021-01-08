package com.javasongkb.changgou.service.impl;

import com.javasongkb.changgou.mapper.BrandMapper;
import com.javasongkb.changgou.model.Brand;
import com.javasongkb.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:BrandServiceImpl
 * Package:com.javasongkb.changgou.service.impl
 * Description:
 *
 * @date:2021/1/7 13:39
 * @outhor:宋凯标
 */
@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;
    @Override
    public List<Brand> findAll() {
        return brandMapper.findAll();
    }
}
