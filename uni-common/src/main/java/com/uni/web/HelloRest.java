package com.uni.web;

import com.uni.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
    @Autowired
    private Config config;

    @GetMapping("/eureka/version")
    public String version() {
        return config.getServerVersion();
    }
}
