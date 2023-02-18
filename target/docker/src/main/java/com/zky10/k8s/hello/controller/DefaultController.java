package com.zky10.k8s.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DefaultController {

    @RequestMapping("/")
    public String sayhello(){
        return "ok";
    }

}
