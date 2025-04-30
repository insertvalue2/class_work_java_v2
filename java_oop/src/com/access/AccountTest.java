package com.access;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(10_000);
        account.withdraw(6_000);
        account.showInfo();

        // 접근 제어지사 문법, 왜 사용하는가??

        // 신입 개발자가 실수로 메서드를 통해서 코드를 작성한게 아니라
        // 바로 멤버 변수에 접근해서 수정하는 코드를 작성해 버렸다.
        // account.balance = 10_000; // 입금 명령어! 작성했다 본인 생각!!!
        account.showInfo();
        // 실수 할 수 가능성이 있다. !!
        // balance 변수를 외부에서 안보이 접근 차단해 보자.
        // private 를 선언해서 외부에서 접근 차단

        // 외부에서는 오직 출금 기능, 입금 기능 메서드로만 사용이 가능해 진다.

        // >>>  현재 잔액 <<<  <--- 출력하고 싶어.
        int outerBalancer = account.getBalance();
        System.out.println(">>>> 현재 잔액 : " + outerBalancer + " <<<< ");
        // 자바에서 멤버 변수 값을 초기화 하지 않으면 String null 로 초기화 된다.
        System.out.println(account.getName());

        // setter 메서드의 사용
        account.setBalance(-11110);
        //account.balance = 0;
        account.showInfo();
    }

}
