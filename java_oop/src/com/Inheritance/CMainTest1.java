package com.Inheritance;

public class CMainTest1 {

    // 코드의 진입점
    public static void main(String[] args) {

        // A , B,  C
        // A 와 C 관계는 상속관계
        C c = new C();
        c.name = "C 클래입니다";
        c.height = 100;
        c.weight = 20;
        c.age = 10;

        c.level = 1;
        c.nickName = "자식 C 클래스";


    } // end of main

} // end of class
