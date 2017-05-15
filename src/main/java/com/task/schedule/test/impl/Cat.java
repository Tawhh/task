package com.task.schedule.test.impl;

import com.task.schedule.test.dao.Animal;
import org.aspectj.lang.annotation.After;

/**
 * Created by t420 on 2017/5/4.
 */
public class Cat implements Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Animal() {
        System.out.println("you are a "+this.name);
    }
}
