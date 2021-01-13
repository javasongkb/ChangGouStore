package com.javasongkb.changgou.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.javasongkb.changgou.mapper.BrandMapper;
import com.javasongkb.changgou.model.Brand;
import com.javasongkb.changgou.pojo.PageResult;
import com.javasongkb.changgou.pojo.Result;
import com.javasongkb.changgou.pojo.StatusCode;
import com.javasongkb.changgou.service.BrandService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger = LoggerFactory.getLogger(BrandServiceImpl.class);

    @Autowired
    private BrandMapper brandMapper;
    @Override
    public Page<Brand> findAll(String input) {
        int page = JSONObject.parseObject(input).getInteger("page");
        int size = JSONObject.parseObject(input).getInteger("size");
        PageHelper.startPage(page,size);
        return (Page<Brand>)brandMapper.findAll();
    }

    @Override
    public Result queryBrand(String input) {
        try {
            Brand brand = JSONObject.parseObject(input,Brand.class);
            List<Brand> brandList = brandMapper.selectBrand(brand);
            return new Result(true,StatusCode.OK,"查询成功",brandList);
        } catch (Exception e) {
            logger.error("查询品牌失败：--------"+e.toString());
            return new Result(false,StatusCode.ERROR,"查询品牌失败","");
        }
    }

    @Override
    public Result addBrand(String input) {
        try {
            Brand brand = JSONObject.parseObject(input,Brand.class);
            int flag = brandMapper.insert(brand);
            if(flag > 0){
                return new Result(true,StatusCode.OK,"添加品牌成功","");
            }else {
                return new Result(false,StatusCode.DATABASE_ERROR,"添加品牌失败","");
            }
        } catch (Exception e) {
            logger.error("添加品牌失败：--------"+e.toString());
            return new Result(false,StatusCode.ERROR,"添加品牌失败","");
        }
    }

    @Override
    public Result updateBrand(String input) {
        try {
            Integer id = JSONObject.parseObject(input).getInteger("id");
            if(id == null){
                return new Result(false,StatusCode.ERROR,"修改品牌失败,id不能为空","");
            }
            Brand brand = JSONObject.parseObject(input,Brand.class);
            int flag = brandMapper.updateByPrimaryKeySelective(brand);
            if(flag > 0){
                return new Result(true,StatusCode.OK,"修改品牌成功","");
            }else {
                return new Result(false,StatusCode.DATABASE_ERROR,"修改品牌失败","");
            }
        } catch (Exception e) {
            logger.error("修改品牌失败：--------"+e.toString());
            return new Result(false,StatusCode.ERROR,"修改品牌失败","");
        }
    }

    @Override
    public Result deleteBrand(String input) {
        try {
            Integer id = JSONObject.parseObject(input).getInteger("id");
            if(id == null){
                return new Result(false,StatusCode.ERROR,"删除品牌失败,id不能为空","");
            }
            int flag = brandMapper.deleteByPrimaryKey(id);
            if(flag > 0){
                return new Result(true,StatusCode.OK,"删除品牌成功","");
            }else {
                return new Result(false,StatusCode.DATABASE_ERROR,"删除品牌失败","");
            }
        } catch (Exception e) {
            logger.error("删除品牌失败：--------"+e.toString());
            return new Result(false,StatusCode.ERROR,"删除品牌失败","");
        }
    }

    @Override
    public Result queryBrandByCategory(String input) {
        /**
         * 根据商品分类查询品牌
         */
        int page = JSONObject.parseObject(input).getInteger("page");
        int size = JSONObject.parseObject(input).getInteger("size");
        PageHelper.startPage(page,size);

        Integer categoryId = JSONObject.parseObject(input).getInteger("categoryId");
        if(categoryId == null){
            return new Result(false,StatusCode.ERROR,"查询失败,商品分类id不能为空", "");
        }
        Page<Brand> brandList = brandMapper.selectBrandByCategory(categoryId);
        PageResult pageResult = new PageResult();
        pageResult.setTotal(brandList.getTotal());//总记录数：内部实现其实就是执行了一次select count获得
        pageResult.setRows(brandList.getResult());//分页后查询出的记录
        return new Result(true, StatusCode.OK,"查询成功",pageResult);
    }
}
