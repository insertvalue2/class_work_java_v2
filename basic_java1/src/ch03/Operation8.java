package ch03;

/**
 * 빠른 평가란?
 * 논리 연산에서 첫 번째 조건이 결과를 결정 할 경우
 * 두 번째 조건을 평가하지 않는 것
 */
public class Operation8 {

    public static void main(String[] args) {

        int number = 5;
        int index = 0;

        // 논리 합 (||) 에서 빠른 평가가 되는 식을 만들어 보자.
        // 빠른 평가란?
        // 논리 연산에서 첫 번째 조건이 결과를 결정하는 경우, 두 번째 조건을 평가 하지 않는다. !!
        // 논리 합 ---> 첫 번째 조건이 true 라면 두번째, 세번째 확인 안함

        ///                      T
        //                    15 > 10
        boolean result = (( number += 10 ) > 10) || ((index += 2) < 10);
        System.out.println("result : " + result);

        // 우리는 대입 연산자를 사용했을 경우 ---> 변수 접근해서 값을 변경 한다.
        System.out.println("number : " + number);
        System.out.println("index : " + index);
        

    } // end of main
} // end of class
