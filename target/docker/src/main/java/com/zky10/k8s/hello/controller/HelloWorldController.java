package com.zky10.k8s.hello.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cc
 * @Date: 2023/1/9 15:58
 * @Description:
 */
@RequestMapping("/d")
@RestController
@Slf4j
public class HelloWorldController {


    @RequestMapping(value = "/h", method = {RequestMethod.GET, RequestMethod.POST})
    public String helloWorld() {
        log.warn("k8s接收到请求： helloWorld");
        InetAddress inet=null;
        try {
            inet = InetAddress.getLocalHost();

        }catch (UnknownHostException ue){
            ue.printStackTrace();
        }
        return "k8s-Hello name,ip:"+inet.getHostAddress()+",address:"+inet.getAddress()+",hostname:"+inet.getHostName();
    }

}
