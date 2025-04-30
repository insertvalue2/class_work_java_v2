package com.oop1;

public class Bus {

    private int busNumber;
    private int count;
    private int money;

    // 생성자
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // 승객을 태운다.
    public void take(int money) {
        this.money += money;
        count++;
    }

    // 상태 창
    public void showInfo() {
        System.out.println("버스 번호 : " + busNumber);
        System.out.println("승객 수  : " + count);
        System.out.println("버스 수익금 : " + money);
    }

}
