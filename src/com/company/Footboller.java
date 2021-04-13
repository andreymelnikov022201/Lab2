package com.company;

public class Footboller implements Jump {
    public void jump(){
        System.out.println("Пригай щоб відбити м'яч!");
    }
    public static void main(String[] args) {

        Footboller player2 = new Footboller();
        player2.jump();
    }
}
