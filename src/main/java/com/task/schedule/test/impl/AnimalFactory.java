package com.task.schedule.test.impl;

import com.task.schedule.test.dao.Animal;

/**
 * Created by t420 on 2017/5/4.
 */
public class AnimalFactory {
    public Animal getAnimal(String animalType) {
        if (null == animalType) {
            return null;

        }
        if (animalType.equalsIgnoreCase("dog")) {
            return new Dog();

        }
        if (animalType.equalsIgnoreCase("cat")) {
            return new Cat();

        }
        if (animalType.equalsIgnoreCase("tiger")) {
            return new Tiger();

        }
        return null;
    }
}
