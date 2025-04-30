package ch07;

/**
 * 함수 호출과 스택 메모리
 */
public class FunctionMainTest2 {

    // 메인 함수
    public static void main(String[] args) {
        int num1;
        int num2;
        mul(10, 2);
    } // end of main

    // 곱셈 함수
    static int mul(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

}
