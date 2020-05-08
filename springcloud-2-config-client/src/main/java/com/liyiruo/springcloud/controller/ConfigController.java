package com.liyiruo.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ConfigController {

    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String config() {
        String content = "应用名称为：" + applicationName + ";端口号为：" + port;
        log.info("content:{}", content);
        return content;
    }
}
