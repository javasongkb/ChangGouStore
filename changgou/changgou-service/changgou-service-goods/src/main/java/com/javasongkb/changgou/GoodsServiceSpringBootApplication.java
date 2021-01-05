package com.javasongkb.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:GoodsServiceSpringBootApplication
 * Package:com.javasongkb.changgou
 * Description:
 *
 * @date:2021/1/5 17:50
 * @outhor:宋凯标
 */
@SpringBootApplication
public class GoodsServiceSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsServiceSpringBootApplication.class,args);
        System.out.println("商品服务启动成功");
    }
}
