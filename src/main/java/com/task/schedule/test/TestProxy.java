package com.task.schedule.test;

import com.task.schedule.test.proxy.CglibProxy;
import com.task.schedule.test.proxy.CountProxy;
import com.task.schedule.test.proxy.JdkProxy;
import com.task.schedule.test.dao.Count;
import com.task.schedule.test.impl.CountImpl;

/**
 * Created by t420 on 2017/5/3.
 */
public class TestProxy {
    public static void main(String[] args) {
      /* *//* --静态代理--*//*
        CountProxy cop = new CountProxy(new CountImpl());
        cop.updateCount();

       *//* --jdk代理*//*
        JdkProxy jp = new JdkProxy();
        Count count = (Count) jp.bind(new CountImpl());
        count.updateCount();
       *//* cglib动态代理*//*
        CglibProxy cp = new CglibProxy();
        CountImpl ci = (CountImpl) cp.getInstance(new CountImpl());
        ci.updateCount();*/

        int[] a={23,34,212,32445,21,2,4,4,36,76,121};
        int length=a.length;
        int p;
        System.gc();
        p=1;
        System.out.print(p);
    }

}
