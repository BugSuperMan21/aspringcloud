package com.lqm.repository.impl;

import com.lqm.bean.Student;
import com.lqm.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static Map<Integer,Student> studentMap;

    static{
        studentMap=new HashMap<>();
        studentMap.put(1,new Student(1,"张三",18));
        studentMap.put(3,new Student(3,"王五",20));
        studentMap.put(2,new Student(2,"李四",19));
    }

    @Override
    public Collection<Student> findALL() {

        return studentMap.values();
    }

    @Override
    public Student findById(Integer id) {
        return studentMap.get(id);
    }

    @Override
    public void addStudent(Student student) {
        studentMap.put(student.getId(),student);

    }

    @Override
    public void updateStudent(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(Integer id) {
        studentMap.remove(id);
    }
}
