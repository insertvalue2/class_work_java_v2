package ch04;

public class BreakTest1 {

    public static void main(String[] args) {

        // 10회 반복하는 녀석
        int i;
        for(i = 1; i < 11; i++) {
            // i 값이 7에 소수라면 멈추라
            // 만약 i 값이 7 이라면 반복문을 멈추어라!
            System.out.println("i : " + i);
            if (i % 7 == 0) {
                break;
            }
        } // end of for
        // 반복문이 멈추고 난 후 i 값을 출력해 보자.
        System.out.println("i 값 확인 : " + i);

    } // end of main

} // end of class
