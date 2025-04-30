package com.swing;

import javax.swing.*;

public class BorderLayout extends JFrame {

    public BorderLayout() {
        super.setTitle("layout 테스트");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // 테스트
    public static void main(String[] args) {
        new BorderLayout();
    }

}
