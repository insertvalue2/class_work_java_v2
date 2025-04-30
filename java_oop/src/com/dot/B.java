package com.dot;

public class B {

    C c;

    // 생성자
    public B() {
        System.out.println("B 생성자 호출 됨");
        c = new C();
    }

}
