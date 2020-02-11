package com.lqm.controller;

import com.lqm.bean.Student;
import com.lqm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentControlelr {

    @Autowired//注入依赖
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student>  findAll(){
        return  studentRepository.findALL();
    }

    @GetMapping("/findById/{id}")
    public Student  findById(@PathVariable("id") Integer id){
        return  studentRepository.findById(id);
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        studentRepository.addStudent(student);
    }

    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody Student student){

        studentRepository.updateStudent(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        studentRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口号为："+this.port;
    }

}
