package com.wpspace;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/classPath")
public class demo {
    @RequestMapping(value = "/methodPath")
    public String method() {
        return "mapping url is /classPath/methodPath";
    }
}