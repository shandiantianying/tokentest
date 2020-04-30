package com.sdty.tokentest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @PostMapping("/info")
    public String info() {
        return "info";
    }
}