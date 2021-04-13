package com.company;

public abstract class Plant {
    protected String name;
    protected String habitat;
    protected int age;
    public Plant(String name){
        this.name=name;
    };
    public Plant(String name, String habitat){
        this.name=name;
        this.habitat=habitat;
    }
    public Plant(String name, String habitat, int age){
        this.name=name;
        this.habitat=habitat;
        this.age=age;
    }
    public abstract void plantSounds();
}

