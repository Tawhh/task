package com.task.schedule.test;

/**
 * Created by t420 on 2017/5/4.
 */
public class Singleton {
    /*饿汉式单例*/
   /* private static Singleton sing = new Singleton();

    private static Singleton getInstance() {
        return sing;
    }

    public Singleton() {
        System.out.print("xxx");
    }*/

   /*延迟加载的单例模式*/
   /* private static Singleton sing;

    private Singleton() {
    }

    private static Singleton getInstance() {
        if (null == sing) {
            sing = new Singleton();
        }
        return sing;
    }*/

    /*内部类单例模式*/
    private Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton sing = new Singleton();
    }
    private static Singleton getInstance(){
        return SingletonHolder.sing;
    }

}
