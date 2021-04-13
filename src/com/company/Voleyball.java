package com.company;

public class Voleyball implements Jump {
    public void jump(){
        System.out.println("Пригай заради перемоги!");
    }
    public static void main(String[] args) {

        Voleyball player1 = new Voleyball();
        player1.jump();
    }
}
