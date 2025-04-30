package variable;

public class Var3 {

    // 코드의 진입점
    public static void main(String[] args) {

        // 변수를 선언하고 값을 넣는 방법과 사용하는 방법을 확인했다.
        // int <-- 예약어 (자바 개발자들이 미리 선점해 둔 단어들)
        int a;

        // 1.
        // 변수 ageBox , 변수 telBox 를 선언해 주세요.
        int ageBox; // 변수에 선언
        int telBox; // 변수에 선언

        // 2.
        // ageBox 에다가 값 50을 초기화(값을 넣다) 해보세요
        ageBox = 50;

        // 3.
        // 콘솔에 ageBox 값을 출력 하시오.
        System.out.println(ageBox);

        // 정리
        // 변수는 변할 수 있는 수이고 값을 저장할 수 있는 메모리 공간이다.

        // 도전 문제 ageBox 라는 변수에 값을 100 으로 변경하시오.
        ageBox = 100;

        // 값을 다시 출력하고 변경이 되었는지 확인해보자.
        System.out.println(ageBox);

        // 출력할 값이 없기 때문에 오류를 발생 시킨다.
        // System.out.println(telBox);

    } // end of main

} // end of class
