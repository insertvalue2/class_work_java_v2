package ch02;

/**
 * 증감, 감소 연산자 ++, -- (변수에 접근해서 그 값을 오직 1을 증가, 감소 시킨다)
 */
public class Operator2 {

    public static void main(String[] args) {

        int a = 1;
        a++; // 오직 1을 증가 시킨다.
        System.out.println("a : " + a);

        int b = 1;
        b--; // 오직 1을 감소 시킨다.
        System.out.println("b : " + b);

        int c = 100;
        // 감소 연사자를 앞에 사용하면 (전위 감소 연산자)
        // 감소 연사자를 뒤에 사용하면 (후위 감소 연산자)
        // ; 콜론 기눈 문장에 끝 기준으로 연산하는 시점이 달라 질 수 있다.
        System.out.println(c--);
        System.out.println(c); // 실제 변수에 값이 변경이 되었을까?

    } // end of main

} // end of class
