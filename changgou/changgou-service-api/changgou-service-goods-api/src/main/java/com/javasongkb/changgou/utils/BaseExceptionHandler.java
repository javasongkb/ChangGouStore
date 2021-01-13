package com.javasongkb.changgou.utils;

import com.javasongkb.changgou.pojo.Result;
import com.javasongkb.changgou.pojo.StatusCode;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:BaseExceptionHandler
 * Package:com.javasongkb.changgou.utils
 * Description:
 *  公共异常处理类
 * @date:2021/1/13 15:23
 * @outhor:宋凯标
 */

/**
 * @ControllerAdvice ： 全局增强Controller注解 （SpringMVC注解）
 * 1.全局异常处理
 * 2.全局数据绑定（可定义全局变量）
 * 3.全局数据预处理
 */
@ControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class) // 全局捕捉到的异常就会进入此方法
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return new Result(false, StatusCode.ERROR,"操作失败","");
    }

    @ModelAttribute //将变量绑定到model中，全局都可以获得该值,也可指定其它类
    public void myData(Model model) {
        model.addAttribute("project","changgou");
    }
}
