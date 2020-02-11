package com.lqm.repository;

import com.lqm.bean.Student;

import java.util.Collection;

public interface StudentRepository {
    public Collection<Student> findALL();//查询全部学生
    public Student findById(Integer id);//查询某个学生
    public void addStudent(Student student);
    public void updateStudent(Student student);
    public void deleteById(Integer id);


}
