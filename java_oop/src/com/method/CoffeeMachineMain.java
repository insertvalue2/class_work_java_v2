package com.method;

public class CoffeeMachineMain {

    public static void main(String[] args) {

        // 커피머신 객체 생성 -> 인스턴스화 --> 인스턴스 (객체)
        CoffeeMachine machine1  = new CoffeeMachine();

        // 재료 채우기 동작을 시켜 보자 (물, 원두)
        machine1.refillWater(200);
        machine1.refillCoffee(30);
        System.out.println("-----------------");

        // 커피 만들기 테스트
        System.out.println("커피 주문!");
        String result = machine1.makeCoffee();
        System.out.println(result);
        // 또 커피 주문
        System.out.println("또 커피 주문!");
        System.out.println(machine1.makeCoffee());

        // 또 커피 주문 (재료 부족 테스트)
        System.out.println("마지막 커피 주문");
        System.out.println(machine1.makeCoffee());

        // 생성자 사용하는 문법
        CoffeeMachine m2 = new CoffeeMachine(200, 30);
        m2.makeCoffee();

    } // end of main

}
