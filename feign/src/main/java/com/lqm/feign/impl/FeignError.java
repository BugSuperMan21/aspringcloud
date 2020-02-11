package com.lqm.feign.impl;

import com.lqm.bean.Student;
import com.lqm.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component//注入到ioc容器中
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
