package exercise;

public class Exercise2 {

    public static void main(String[] args) {

        // 1. 데이터 10, 100, 100을 변수 선언과 동시에 초기화하고 화면에 출력
        // 변수 선언과 동시에 초기화
        int data1 = 10;
        int data2 = 100;
        int data3 = 100;
        System.out.println("Data 1 : " + data1);
        System.out.println("Data 2 : " + data2);
        System.out.println("Data 3 : " + data3);

        // 2. int ageBox 상자에 20을 담기
        int ageBox = 20;

        // 2.1 ageBox 상자의 값을 30으로 변경하고 기존에 담겨 있던 데이터를 다른 곳으로 옮기기
        int oldAge = ageBox;
        ageBox = 30; // 변수는 변할 수 있는 수 이다.

        // 3. int a = 1; int b = 3; 선언하고 a와 b에 담겨 있는 값을 서로 스위칭
        // 힌트 -  임시 변수를 사용하여 값을 교환
        int a = 1;
        int b = 3;
        int temp = a;
        a = b;
        b = temp;

    } // end of main

} // end of class
