package com.javasongkb.changgou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ClassName:GoodsServiceSpringBootApplication
 * Package:com.javasongkb.changgou
 * Description:
 *
 * @date:2021/1/7 14:15
 * @outhor:宋凯标
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.javasongkb.changgou.mapper")
public class GoodsServiceSpringBootApplication {
    public static void main(String[] args){
        SpringApplication.run(GoodsServiceSpringBootApplication.class,args);
        System.out.println("商品服务启动成功");
    }
}
