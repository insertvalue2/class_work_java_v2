package com._static;

public class NumberPrinter {

    /**
     *  static 변수는, static 메서드는 객체 생성 없이 클래스 이름으로 바로 접근 가능 하다.
     *  왜? heap 메모리에 들어가기 위해서는 new 키워드와 생성자를 호출한 뒤
     *  동작할 수 있지만 method area 영역은 프로그램을 실행 시키면
     *  바로 메모리를 할당 받아 실행되는 영역이기 때문이다.
     */

    private int id;
    // 멤버 변수 (NumberPrinter 소속된 변수)
    // public int waitNumber;

    // waitNumber <-- 멤버 변수가 아니라 class area 영역에 포함된다.
    public static int waitNumber; // static 변수 선언(클래스 변수)

    public NumberPrinter(int id) {
        this.id = id;
        this.waitNumber = 1;
    }

    // 번호표를 출력합니다.
    public void printWaitNumber() {
        System.out.println(id + " 기기에 대기 순번은 : " + waitNumber);
        waitNumber++;
    }

}
