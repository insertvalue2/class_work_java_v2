package ch02;

public class Operator1 {

    public static void main(String[] args) {

        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum =  a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        //        (int) / (int) --> 실수
        //double div = a / b;
        //           실수 / 실수
        // 나눗을 계산할 때는 실수 형 변환 해서 처리해야 조금 더 정확하다.
        // double div = 5.0 / 2.0;
        // 두 개중에 하나라도 실수면 연산에 결과는 실수로 처리 됩니다.
        double div = a / (double)b;
        System.out.println("a / b = " + div);

        // 나머지
        double mod = a % (double)b;
        System.out.println("a % b = " + a % b);

        System.out.println("------------------------");
        // 연습 문제
        // 1. (12 + 3) / 3 값을 화면에 출력해 보세요
        System.out.println((12 + 3) / (double)3);

        // 2. (25 % 2) 값을 화면에 출력해 보세요
        // 어떤 수를 2로 나누었을 때 나머지 0 이면 짝수로 판별 가능하다. 1이면 홀수로 판별 가능 하다.
        System.out.println(25 % 2); // 1 --> 홀수로 판별 수 있다.
        System.out.println(26 % 2); // 0 --> 짝수로 판별 수 있다.





    } // end of main
} // end of clas
