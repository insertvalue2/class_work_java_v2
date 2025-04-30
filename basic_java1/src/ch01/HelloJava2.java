package ch01;

// 모든 자바파일에 코드는 클래스라는 녀석 안에서 작성한다.
public class HelloJava2 {

    // 코드의 진입점 main 함수
    public static void main(String[] args) {
        // ...println() 은 출력 후에 자동으로 콘솔에서 줄바꿈 합니다.
        System.out.println("hello java1");
        System.out.println("hello java2");
        System.out.println("hello java3");
        System.out.println("hello java4");

        System.out.println("-----------------------");
        // printf는 포맷팅된 출력을 위해 사용되며, 자동으로 줄 바꿈하지 않습니다.
        // printf에 줄바꿈을 원한다면 \n 을 추가해야 합니다.
        //         printf
        System.out.printf("text1");
        System.out.printf("/"); // 슬래시
        System.out.printf("text2\n");
        System.out.printf("안녕\n");

        // 이스케이프 시퀀스 \n 으로 줄 바꿈 추가
        // \(백슬래시)는 시퀀스라고 부르는 특수 문자 중에 하나이다.
        // 백슬래시 뒤에 나오는 문자가 특별한 의미를 가지게 된다.

        System.out.printf("Hello\tWorld");
    } // end of main

    // 탭 간격 자동 정렬 단축키 ctrl + alt + l
} // end of main
