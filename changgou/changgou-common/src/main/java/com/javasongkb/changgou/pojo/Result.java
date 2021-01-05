package com.javasongkb.changgou.pojo;

import lombok.Data;

/**
 * ClassName:Result
 * Package:com.javasongkb.changgou.pojo
 * Description:
 *  返回结果实体类
 * @date:2021/1/5 15:17
 * @outhor:宋凯标
 */
@Data
public class Result<T> {
    private boolean flag; //是否成功
    private Integer code; //返回码
    private String message; //返回消息
    private T data; //返回数据
}
