package com.books;

// 수입 하다 가져 오다.
import com.startcraft_v01.Zealot;

public class ZealotTest {

    public static void main(String[] args) {

        Zealot[] zealots = new Zealot[5];

        // 반복문 사용하지 말고 질럿 3마리 0, 1, 3 인덱스에 넣어 주세요
        zealots[0] = new Zealot("질럿0");
        zealots[1] = new Zealot("질럿1");
        zealots[3] = new Zealot("질럿3");
        // [주소값][주소값][null][주소값][null]

        // 0 번째 인덱스에 주소값을 넣어눈 질럿에 기능 showInfo()를 호출 하시오
        // zealots[0] - z1.showInf();
        // zealots[0].showInfo();
        zealots[0].showInfo();

        // 반복문을 활용해서 배열안에 있는 질럿들에 showInfo()를 호출 하시오
        // [주소값][주소값][null][주소값][null]
        for (int i = 0; i < zealots.length; i++) {
            // 방어적 코드 작성
            if(zealots[i] != null) {
                zealots[i].showInfo();
            }
        }

    } // end of main

}
