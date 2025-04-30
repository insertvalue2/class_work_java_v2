package com._static;

import com.dot.C;

// 신용카드
public class Card2 {

    // static 변수: 모든 Card 객체가 공유하며, 고유 번호를 생성하기 위해 사용할 수 있다.
    private static int cardCounter = 0;

    // 인스턴스 변수
    private final int cardId;
    private final String cardName;

    public Card2(String cardName) {
        this.cardName = cardName;
        this.cardId = ++cardCounter;
    }

    // static 메서드
    public static int getTotalCards() {
        // static 메서드 안에서 인스턴스 변수를 사용할 수 없다.
        // 왜? 인스턴스 변수는 객체가 생성된 이후에 사용될 수 있기 때문이다.
        // System.out.println("cardName : " + cardName);
        // static 변수
        return cardCounter;
    }

    // 인스턴스 메서드 만들어 보자.
    public void showInfo() {
        System.out.println(cardCounter);
        System.out.println(cardName + " 에 고유 번호는  " + cardId + "입니다.");
    }


    // 메인 함수
    public static void main(String[] args) {
        // static 변수는 객체 생성전에 사용가능
        // static 메서드는 객체 생성전에 사용 가능
        // 사용하는 방법 (클래스의 이름으로 접근 가능하다)
        System.out.println(Card2.cardCounter);
        // 인스턴스 메서드 일까 static 메서드 이다.
        // 그래서 객체 생성전에 호출해 볼 수 있다.
        System.out.println(Card2.getTotalCards());


        // 코드 테스트는 여기서 해주세요
        // Card2 c1  = new Card2("우리카드1");
        // System.out.println(c1.cardId);

    }

}
