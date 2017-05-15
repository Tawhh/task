package com.task.schedule.test.impl;

import java.io.Serializable;

/**
 * Created by t420 on 2017/5/4.
 */
public class Student implements Serializable {

    public static final long serialVersionUID = 1L;
    private String name;
    private String age;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
