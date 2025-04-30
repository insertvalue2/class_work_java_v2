package com.dot;

public class MainTest {

    public static void main(String[] args) {
        System.out.println(" . 연산자의 여행!!! ");
        A a1 = new A();

        // a1.b.c // C 객체가 생성 안된 상태라서 null 에러 일어남
        a1.b.c.callFinal();

    }
}
