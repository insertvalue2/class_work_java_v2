package exercise;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        // 2단계
        // 괄호 - 조건식
        //  4 < 10 --> true
        //  boolean flag = true
        //  true
//        while (true) {
//            System.out.println(".....");
//            if(5 < 10) {
//                break;
//            }
//        }


        // 프래그래밍에서는 C R U D 개념이 있다.
        // 생성, 조회, 수정, 삭제
        // 실행에 흐름을 만들어 보는 연습 1단계

        // 준비물 ..
        Scanner scanner = new Scanner(System.in);

        // 1단계
        while (true) {
            // 도구를 준비, 값을 활용하기 위해 변수가 필요 해.
            System.out.println("메뉴를 선택하시오");
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");
            int choice = scanner.nextInt(); // 키보드에서 정수값을 받을 수 있는 명령어
            // 1 , 2, 3, 4, 0 따라서 실행에 흐름 만들어야 된다.
            if (choice == 1) {
                System.out.println("1. 등록 누름");
            } else if (choice == 2) {
                System.out.println("2. 조회 누름");
            } else if (choice == 3) {
                System.out.println("3. 수정 누름");
            } else if (choice == 4) {
                System.out.println("4. 삭제 누름");
            } else if (choice == 0) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요");
            }
            // end while ~
        }
    } // end of main
} // end of class
