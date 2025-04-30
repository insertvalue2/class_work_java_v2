package com.swing;

import javax.swing.*;
import java.awt.*;

// GUI 화면을 만들어 보자. - 자바 표준 라이브러
// 화면을 구성할 때 배치 관리자(layout)
// button 라벨, 텍스트 - 컴포넌트
public class FlowLayoutEx extends JFrame {


    private JButton button1;
    private JButton button2;
    private JButton button3;

    // 생성자
    public FlowLayoutEx() {
        super.setTitle("배치관리자연습 - FlowLayout");
        super.setSize(500, 500);
        super.setVisible(true); // 화면에 보이게 한다. false , true
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 생성자 안에서 다른 메서드를 호출 할 수 있다.
        initData();
        setInitLayout();

    }

    public void initData() {
        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("버튼");
    }

    public void setInitLayout() {
        // 배치관리자 중 .... FlowLayout, BorderLayout, .... null (좌표기반)
        // FlowLayout --> 컴포넌트들을(버튼) 수평, 수직으로 배치하는 객체입니다.
        super.setLayout(new FlowLayout());
        // add 컴포넌트를 패널에 붙이다
        super.add(button1);
        super.add(button2);
        super.add(button3);
    }

    // 코드 테스트
    public static void main(String[] args) {
        FlowLayoutEx flowLayoutEx = new FlowLayoutEx();

    } // end of main

}
