package ch03;

import java.util.Scanner;

public class IfTest4 {

    public static void main(String[] args) {

        // 키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);

        System.out.println("성적을 입력하세요: ");
        int score = sc.nextInt(); // 키보드 정수값을 받을 수 있는 명령문
        System.out.println("score : " + score);

        // 조건문을 완성 하세요
        // 90점 이상 -> A 학점 입니다.
        // 80점 이상 -> B 학점 입니다.
        // 70점 이상 -> C 학점 입니다.
        // 60점 이상 -> D 학점 입니다.
        // 59점 이하 -> F 학점 입니다.
        if (score >= 90) {
            System.out.println("A 학점 입니다");
        } else if (score >= 80) {
            System.out.println("B 학점 입니다");
        } else if (score >= 70) {
            System.out.println("C 학점 입니다");
        } else if (score >= 60) {
            System.out.println("D 학점 입니다");
        } else {
            System.out.println("F 학점 입니다");
        }

    } // end of main

} // end of class
