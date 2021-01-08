package com.javasongkb.changgou.controller;

import com.javasongkb.changgou.model.Brand;
import com.javasongkb.changgou.pojo.Result;
import com.javasongkb.changgou.pojo.StatusCode;
import com.javasongkb.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * ClassName:BrandController
 * Package:com.javasongkb.changgou.controller
 * Description:
 *
 * @date:2021/1/6 16:25
 * @outhor:宋凯标
 */
@RestController
@MapperScan("com.javasongkb.changgou.mapper")
@RequestMapping("/changgou/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping("/findAll")
    public Result findAll(){
        List<Brand> brandList = brandService.findAll();
        return new Result(true, StatusCode.OK,"查询成功",brandList);
    }
}
