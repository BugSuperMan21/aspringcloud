package com.lqm.controller;

import com.lqm.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
    @RequestMapping("/ribbon")
    public class RibbonHandler {
        @Autowired
        private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll( ) {
        return restTemplate.getForObject("http://provider/student/findAll", Collection.class);
        //因为在locahost:8080已经在注册中心完成注册，所以可以用服务提供者的名字provider代替
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/student/index",String.class);
    }



}
