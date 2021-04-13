package com.company;

public class Borec implements Jump {
    public void jump(){
        System.out.println("Розминка!");
    }
    public static void main(String[] args) {

        Borec player4 = new Borec();
        player4.jump();
    }
}
