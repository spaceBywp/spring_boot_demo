package com.wpspace;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/classPath")
public class demo {
    @RequestMapping("/methodPath")
    public String method() {
        return "mapping url is /classPath/methodPath";
    }
}