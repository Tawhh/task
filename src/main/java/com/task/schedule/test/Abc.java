package com.task.schedule.test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by t420 on 2017/5/9.
 */
@Aspect
public class Abc {
    @Pointcut("execution(* com.task.schedule.test.impl..*(..))")
    public void aspect(){}
    @Before("aspect()")
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
