package ch03;

public class IfTest3 {

    // 메인함수(코드의 진입점)
    public static void main(String[] args) {

        int studentAge = 30;

        // if else if else 조건식 순서도 중요하다.

        // 만약 학생이 7살 이하라면 -> "유치원생"
        // 만약 학생이 13 살 이하라면 -> "초등학생"
        // 만약 학생이 16 살 이하이라면 -> "중학생"
        // 만약 학생이 19 살 이하이라면 -> "고등학생"

//        ! 수행이 될 수 도 있고 안될 수도 있다.
//        if (studentAge <= 7) {
//            System.out.println("유치원생");
//        } else if (studentAge <= 13) {
//            System.out.println("초등학생");
//        } else if (studentAge <= 16) {
//            System.out.println("중학생");
//        } else if (studentAge <= 19) {
//            System.out.println("고등학생");
//        }

        if (studentAge <= 7) {
            System.out.println("유치원생");
        } else if (studentAge <= 13) {
            System.out.println("초등학생");
        } else if (studentAge <= 16) {
            System.out.println("중학생");
        } else if (studentAge <= 19) {
            System.out.println("고등학생");
        } else {
            // 위 조건들이 하나도 포함이 안된다면 else 구문이 수행이 된다.
            System.out.println("성인인가요?");
        }

    } // end of main
} // end of class
