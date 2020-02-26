package com.yksys.isystem.service.fileupload;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @program: yk-isystem
 * @description:
 * @author: YuKai Fan
 * @create: 2020-02-15 15:55
 **/
@SpringBootApplication
@EnableEurekaClient
@ComponentScan
@MapperScan(basePackages = {"com.yksys.isystem.service.admin.mapper"})
public class ServiceFileUploadApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceFileUploadApplication.class, args);
    }
}