package com.iceflow.controller;

import com.iceflow.common.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个类是一个最简单的 Controller。
 *
 * Controller 可以先理解成：
 * “专门接收前端 / 浏览器请求，然后返回结果的类”
 *
 * 以后你写的注册、登录、下单、查订单，
 * 基本都会先从 Controller 开始接请求。
 */
@RestController
public class HealthController {
    @GetMapping("/ping")
    public ApiResponse<String> ping() {
        /**
         * 这个方法返回一个字符串。
         *
         * 因为这个类上有 @RestController，
         * 所以 Spring Boot 不会把它当成页面名，而是会直接把字符串写到 HTTP 响应里。
         *
         * 也就是说，浏览器会直接看到：
         * iceflow running
         */
//        return "iceflow running";
        /**
         * ApiResponse.success("iceflow running")
         *
         * 会创建一个统一成功响应对象，内容相当于：
         * code = 200
         * message = "success"
         * data = "iceflow running"
         */
        return ApiResponse.success("iceflow running");
    }
}
