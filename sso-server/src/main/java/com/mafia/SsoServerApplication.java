package com.mafia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 单点登录认证服务启动类
 * @Author admin
 * @Date 2018/11/5 11:25
 * @Version 1.0
 */
@SpringBootApplication
public class SsoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsoServerApplication.class, args);
    }
}
