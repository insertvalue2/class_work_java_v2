package com.Inheritance;

public class MainTest1 {

    public static void main(String[] args) {

        // Cal 클래스와 ChildCal 관계는 부모 자식 관계에 놓여 있다.
        ChildCal childCal1 = new ChildCal();
        int sum1 = childCal1.sum(10, 10);
        System.out.println("sum1 : " + sum1);

        int minus1 = childCal1.minus(100, 10);
        System.out.println("minus1 : " + minus1);

        // 곱하는 기능
        // 부모 클래스의 메서드를 자식 클래스에서 재정의를 한다면
        // 메서드 오버라이드라고 한다.
        int multi = childCal1.multiply(10, 0);
        System.out.println("multi : " + multi);


        // 상속관계에 있어서 부모 클래스가 먼저 존재해야
        // 자식 클래스가 존재할 수 있다.

    } // end of main

} // end of class
