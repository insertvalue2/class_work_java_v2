package com._abstract;

/**
 * 추상 클래스를 활용하는 이유
 * 단 하나라도 추상 메서드가 있으면 추상 클래스가 되어야 한다.
 */
public class Tiger extends Animal {

    @Override
    public void hunt() {
        System.out.println("호랑이가 앞발로 사냥을 합니다");
    }

    @Override
    public void move() {
        System.out.println("살금 살금 조용히 이동합니다");
    }
}
