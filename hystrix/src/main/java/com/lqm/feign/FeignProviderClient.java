package com.lqm.feign;

import com.lqm.bean.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

//声明式接口，只用添加注解，不用写实现类
/*@FeignClient(value = "provider",flback = FeignError.classal)//访问的微服务*/
@FeignClient(value = "provider")//访问的微服务
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}
//成功访问接口下面的方法，失败熔断机制访问fallback的方法