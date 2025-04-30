package ch03;

public class IfTest {

    // 메인함수(코드의 진입점)
    public static void main(String[] args) {

        // 조거문(제어문) if
        // 주어진 조건에 따라서 실행이 다르게 이루어 지도록 구현할 수 있다.
        // 만약 ... 이라면
        boolean flag = false;

        if (flag) {
            // 수행 구문;
            System.out.println("조건 식이 true 이면 실행 됩니다.");
        }

        System.out.println("코드가 여기까지 내려 옵니다.");

        // 단독 if 구문은 -> 수행 구문 실행이 될 수도 있고 안될 수 도 있다.

    } // end of main
} // end of class
