package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {
    // 변수, 생성자, 메서드, 내부 클래스

    // 패널
    // private JPanel panel;  <-- 이 패널도 클래스이기 때문에 내가 정의한 클래스에 상속을 받을 수 있음
    private MyDrawPanel drawPanel;


    public MyPaintFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("내부클래서 JPanel 상속 처리");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        drawPanel = new MyDrawPanel();

    }

    private void setInitLayout() {
        super.add(drawPanel);
    }

    // 우리가 정의할 정적 내부 클래스
    static class MyDrawPanel extends JPanel {

        // paint 철자 확인 !
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(50, 50, 100, 50);
            g.drawLine(200, 100, 200, 350);
            g.drawLine(300, 300, 350, 500);
            g.drawString("***", 500, 500);
            g.drawString("⭐⭐⭐⭐***", 530, 530);
        }

    } // end of inner class


    // 메인 함수
    public static void main(String[] args) {
        new MyPaintFrame();
    }
}
