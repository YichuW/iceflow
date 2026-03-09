package com.iceflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这是整个 Spring Boot 项目的启动入口类。
 *
 * 你可以先把它理解成：
 * “Java 程序的 main 函数 + Spring Boot 的总开关”
 *
 * 以后你运行项目，基本就是运行这个类。
 */

@SpringBootApplication
public class IceflowApplication {
    /**
     * main 方法是 Java 程序的标准入口。
     *
     * SpringApplication.run(...) 这行代码的作用是：
     * 1. 启动 Spring Boot 应用
     * 2. 创建 Spring 容器
     * 3. 扫描并注册你后面写的 Controller / Service / Config 等组件
     * 4. 启动内置的 Web 服务器（默认是 Tomcat）
     */
    public static void main(String[] args) {
        SpringApplication.run(IceflowApplication.class, args);
    }
}
