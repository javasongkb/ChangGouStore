package com.javasongkb.changgou.pojo;

import lombok.Data;

import java.util.List;

/**
 * ClassName:PageResult
 * Package:com.javasongkb.changgou.pojo
 * Description:
 *  分页结果类
 * @date:2021/1/5 15:23
 * @outhor:宋凯标
 */
@Data
public class PageResult<T> {
    private Long total; //总记录数
    private List<T> rows; //记录
}
