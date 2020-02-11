package com.lqm.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//直接修饰POJO or beans， getter所有的变量，setter所有不为final的变量。
@AllArgsConstructor//生成全部参数构造
@NoArgsConstructor//生成空参构造
public class Student {
    private Integer id;
    private  String name;
    private  Integer age;

}