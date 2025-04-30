package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPanelEx1 extends JFrame {

    private JButton button1;
    private JButton button2;

    private JButton button3;
    private JButton button4;


    // 컴포넌트들을 그룹화 시킬 수 있다. 즉, 각각에 배치관리자를 추가로 설정해서 관리할 수도 있다.
    private JPanel panel1;
    private JPanel panel2;

    public MyPanelEx1() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("패널연습해보기");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        panel1 = new JPanel();
        panel2 = new JPanel();

        button1 = new JButton("button1");
        button2 = new JButton("button2");

        button3 = new JButton("button3");
        button4 = new JButton("button4");
    }

    private void setInitLayout() {
        setLayout(new GridLayout(2, 1));

        // R G B
        // 0  0  0  -->    흰색
        // 255 255 255 --> 검은색
        panel1.setBackground(Color.RED);
        add(panel1);

        panel2.setBackground(Color.BLACK);
        add(panel2);


        // 패널1에 버튼1을 붙여보자.
        // panel1 에 아직 배치 관리자를 설정 안했음...(기본 배치관리자가 셋팅이 된다)
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        panel1.add(button1);
        panel1.add(button2);

        /// //////////////////////
        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 30));
        panel2.add(button3);
        panel2.add(button4);

    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        new MyPanelEx1();
    } // end of main

}
