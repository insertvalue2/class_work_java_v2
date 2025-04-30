package ch07;

// 코드를 실행 시켜보는 측
public class FunctionMainTest1 {


    // main 함수
    public static void main(String[] args) {

        // 여기에서 함수를 호출해서 사용할 수 있어
        int sub1Result1 = sub1(100, 50); // 함수 호출은 모양 맞추기 이다.
        System.out.println("sub1Result1: " + sub1Result1);
        int sub1Result2  =  sub1(5, 1);
        System.out.println("sub1Result2: " + sub1Result2);
//        함수를 호출할 때 모양을 잘 맞추어야 한다.
//        sub1(0.5, 1);
//        sub1(true, 1);
//        sub1("반가워", 1);

        // add1 함수를 호출 하시오 (모양 맞추기)
        int sum1  = add1(10, 20, 30);
        System.out.println("sum1 : " + sum1);
    } // end of main

    // 함수 선언 - 두 수를 받아서 뺄셈하는 함수를 설계해 보자.
    static int sub1(int n1, int n2) {
        int result = n1 - n2;
        return  result;
    }

    static int add1(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result; // 실행의 제어권을 반납 한다.
    }



} // end of class
