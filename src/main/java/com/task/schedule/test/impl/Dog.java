package com.task.schedule.test.impl;

import com.task.schedule.test.dao.Animal;
import com.task.schedule.test.dao.Count;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by t420 on 2017/5/4.
 */
public class Dog implements Animal{
    @Override
    public void Animal() {
        System.out.println("dog");
    }
    public void before() {
        System.out.println("before--");
    }
    public void after(){
        System.out.println("after--");
    }
    public void around(){
        System.out.println("around--");
    }
    public void returns(){
        System.out.println("return--");
    }
}
