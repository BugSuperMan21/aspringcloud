package com.lqm.controller;


import com.lqm.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class Handler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
      //直接返回一个REST
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student  findById(@PathVariable("id") Integer id){
        return  restTemplate.getForEntity("http://localhost:8010/student/findById/{id}",Student.class,id).getBody();
    }

    @GetMapping("/findById2/{id}")
    public Student  findById2(@PathVariable("id") Integer id){
        return  restTemplate.getForObject("http://localhost:8010/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/addStudent")
    public Object addStudent(@RequestBody Student student)
    {
        return restTemplate.postForEntity("http://localhost:8010/student/addStudent",student,null).getBody();
    }
    @PostMapping("/c")
    public void addStudent2(@RequestBody Student student)
    {
        restTemplate.postForObject("http://localhost:8010/student/addStudent",student,Student.class);

    }

    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody Student student){
         restTemplate.put("http://localhost:8010/student/updateStudent",student);
    }

    @DeleteMapping("/deleteById/{id}")
    public  void deleteById(@PathVariable("id") Integer id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }


}
