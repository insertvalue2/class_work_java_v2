package com.mytest;

import com.access.Bank;

public class MainTest1 {

    public static void main(String[] args) {
        Bank bank2 = new Bank();
        // 이 Bank 는 패키지 access 에 존재하는 녀석이다.
        // 현재 우리 패키지는 mytest 에 존재하고 있다.
        // bank2.balance = 10; // balance 변수는 접근 제어 지시자가 default 이기 때문에 접근 안됨
        bank2.name = "홍길동"; // public 어디에서나 접근 가능하다.
    }
}
