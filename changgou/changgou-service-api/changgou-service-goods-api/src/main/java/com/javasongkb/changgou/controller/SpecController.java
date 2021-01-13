package com.javasongkb.changgou.controller;

import com.javasongkb.changgou.pojo.Result;
import com.javasongkb.changgou.service.SpecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:SpecController
 * Package:com.javasongkb.changgou.controller
 * Description:
 *
 * @date:2021/1/13 16:38
 * @outhor:宋凯标
 */
@RestController
@RequestMapping("/changgou/spec")
public class SpecController {

    @Autowired
    private SpecService specService;

    @RequestMapping("/querySpecByCategory")
    public Result querySpecByCategory(@RequestBody String input){
        return specService.querySpecByCategory(input);
    }
}
