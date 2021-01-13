package com.javasongkb.changgou.controller;

import com.github.pagehelper.Page;
import com.javasongkb.changgou.model.Brand;
import com.javasongkb.changgou.pojo.PageResult;
import com.javasongkb.changgou.pojo.Result;
import com.javasongkb.changgou.pojo.StatusCode;
import com.javasongkb.changgou.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName:BrandController
 * Package:com.javasongkb.changgou.controller
 * Description:
 *  品牌管理
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
    public Result findAll(@RequestBody String input){
        //分页查询
        Page<Brand> brandList = brandService.findAll(input);
        PageResult pageResult = new PageResult();
        pageResult.setTotal(brandList.getTotal());//总记录数：内部实现其实就是执行了一次select count获得
        pageResult.setRows(brandList.getResult());//分页后查询出的记录
        return new Result(true, StatusCode.OK,"查询成功",pageResult);
    }

    @RequestMapping("/queryBrand")
    public Result queryBrand(@RequestBody String input){
        return brandService.queryBrand(input);
    }

    @RequestMapping("/addBrand")
    public Result addBrand(@RequestBody String input){
        return brandService.addBrand(input);
    }

    @RequestMapping("/updateBrand")
    public Result updateBrand(@RequestBody String input){
        return brandService.updateBrand(input);
    }

    @RequestMapping("/deleteBrand")
    public Result deleteBrand(@RequestBody String input){
        return brandService.deleteBrand(input);
    }
    @RequestMapping("/queryBrandByCategory")
    public Result queryBrandByCategory(@RequestBody String input){
        return brandService.queryBrandByCategory(input);
    }
}
