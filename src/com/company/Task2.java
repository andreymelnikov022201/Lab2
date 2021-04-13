package com.company;

import java.util.Comparator;

public class Task2 {
    int age;
    String name;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public Task2(String name, int age){
        this.name=name;
        this.age=age;
    }
    public static Comparator<Task2> AgeComparator = new Comparator<Task2>() {

        @Override
        public int compare(Task2 t1, Task2 t2) {
            return t1.getAge() - t2.getAge();
        }
    };
    @Override
    public String toString() {
        return name  + age;
    }
}
