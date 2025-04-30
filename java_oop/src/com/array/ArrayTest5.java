package com.array;

import java.util.Random;

public class ArrayTest5 {

    public static void main(String[] args) {
        // 1. 문자열 배열 선언 및 초기화(값을 넣을 예정)
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        System.out.println(fruits.length);
        // 랜덤한 숫자를 하나 뽑아서 해당하는 번호에 과일 출력하자.
        Random random = new Random();
        // 0, 1, 2, 3
        int choice = random.nextInt(4); // 0 ~ 3 까지 랜덤 숫자 출력
        System.out.println("오늘에 과일은 :  " + fruits[choice]);
    } // end of main
}
