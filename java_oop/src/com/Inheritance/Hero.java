package com.Inheritance;

public class Hero {

    String name;
    int hp;

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void attack() {
        System.out.println("기본 공격을 합니다");
    }

}
