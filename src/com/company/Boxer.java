package com.company;

public class Boxer implements Jump {
    public void jump(){
        System.out.println("Пригай !");
    }
    public static void main(String[] args) {

        Boxer player3 = new Boxer();
        player3.jump();
    }
}
