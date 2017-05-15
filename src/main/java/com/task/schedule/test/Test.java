package com.task.schedule.test;

import com.task.schedule.test.dao.Animal;
import com.task.schedule.test.impl.CountImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.*;

/**
 * Created by t420 on 2017/4/28.
 */
public class Test {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
      /*  AnimalFactory af=new AnimalFactory();
        Animal dog=af.getAnimal("dog");
        dog.Animal();*/


       /* int i = 12;
        int q = 10;
        System.out.print(q - q * q + q);*/
       /* for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    System.out.print(" ");
                }
                System.out.print(i + "*" + j + "=" + i * j);
            }
            System.out.println();

        }*/

       /* ApplicationContext ctx=new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
        Animal per=(Animal)ctx.getBean("Cat");
        per.Animal();*/


       /*冒泡排序*/
       /* int[] numbers = {2, 1, 10, 3, 6, 5, 23, 11, 34, 22, 26};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1])  //交换两数位置
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            for (int s : numbers) {
                System.out.print(s+" ");
            }
            System.out.println();
        }
        for (int s : numbers) System.out.print(s+" ");
*/
        int a[] = {49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        int temp = 0;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            temp = a[i];
            for (; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];                       //将大于temp的值整体后移一个单位
            }
            a[j + 1] = temp;
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
