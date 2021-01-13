package com.javasongkb.changgou.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.javasongkb.changgou.mapper.SpecMapper;
import com.javasongkb.changgou.model.Brand;
import com.javasongkb.changgou.model.Spec;
import com.javasongkb.changgou.pojo.PageResult;
import com.javasongkb.changgou.pojo.Result;
import com.javasongkb.changgou.pojo.StatusCode;
import com.javasongkb.changgou.service.SpecService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:SpecServiceImpl
 * Package:com.javasongkb.changgou.service.impl
 * Description:
 *
 * @date:2021/1/13 16:41
 * @outhor:宋凯标
 */
@Service
public class SpecServiceImpl implements SpecService {

    private Logger logger = LoggerFactory.getLogger(SpecServiceImpl.class);

    @Autowired
    private SpecMapper specMapper;

    @Override
    public Result querySpecByCategory(String input) {
        /**
         * 根据商品分类查询规格
         */
        int page = JSONObject.parseObject(input).getInteger("page");
        int size = JSONObject.parseObject(input).getInteger("size");
        PageHelper.startPage(page,size);

        Integer categoryId = JSONObject.parseObject(input).getInteger("categoryId");
        if(categoryId == null){
            return new Result(false, StatusCode.ERROR,"查询失败,商品分类id不能为空", "");
        }
        Page<Spec> specList = specMapper.selectSpecByCategoryId(categoryId);
        PageResult pageResult = new PageResult();
        pageResult.setTotal(specList.getTotal());//总记录数：内部实现其实就是执行了一次select count获得
        pageResult.setRows(specList.getResult());//分页后查询出的记录
        return new Result(true, StatusCode.OK,"查询成功",pageResult);
    }
}
