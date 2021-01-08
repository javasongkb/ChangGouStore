package com.javasongkb.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName:EurekaServerSpringApplication
 * Package:com.javasongkb.changgou
 * Description:
 *
 * @date:2021/1/5 15:13
 * @outhor:宋凯标
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerSpringApplication.class,args);
    }
}
