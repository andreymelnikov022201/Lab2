package com.company;

public class Student {
    int age;
    String name;

    public Student(String name){
        this.name=name;
    }
    public String getName(){return name;}
    public int setAge(int age) throws Exception{
        if (age<17)
            throw new Exception("Invalid age");
        this.age=age;
        return age;
    }
}
