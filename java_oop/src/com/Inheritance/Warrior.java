package com.Inheritance;

public class Warrior extends Hero {

    // new Warrior();
    public Warrior(String name, int hp) {
        // 부모 사용자 정의 생성자가 있다면 super() 키워드를 사용해서
        // 가장 먼저 부모 생성자를 호출해야 한다.
        super(name, hp);
    }

    // 부모의 메서드를 재정의 한다면 ---> 메서드 오버라이드

    // 어노테이션 주석 + 힌트  
    @Override
    void attack() {
        System.out.println("전사가 공격을 합니다");
        super.attack();
    }

    void comboAttack() {
        System.out.println("전사가 콤보 공격을 합니다.");
    }
}
