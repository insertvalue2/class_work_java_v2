package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyEventFrame extends JFrame implements KeyListener {
    private final int FRAME_SIZE = 500;
    private JTextArea textArea;

    public MyKeyEventFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setSize(FRAME_SIZE, FRAME_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); // 프레임 사이즈 조절 불가

        textArea = new JTextArea();
    }
    private void setInitLayout() {
        setLayout(new BorderLayout());
        add(textArea);
        setVisible(true);
    }
    private void addEventListener() {
        textArea.addKeyListener(this); // 다형성
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("KeyCode : " + e.getKeyCode());
        if(e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("화살표 위 이벤트 발생");
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("화살표 아래 이벤트 발생");
        } else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("화살표 왼쪽 이벤트 발생");
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("화살표 오른쪽 이벤트 발생");
        }
    }

    // 메인 함수 테스트 코드 작성
    public static void main(String[] args) {
        new MyKeyEventFrame();
    }
    
}
