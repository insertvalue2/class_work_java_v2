package _swing;

import javax.swing.*;
import java.awt.*;

public class MyImageFrame extends JFrame {

    private MyImagePanel myImagePanel;

    public MyImageFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("이미지 넣어 보는 연습");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        myImagePanel = new MyImagePanel();
    }

    private void setInitLayout() {
        add(myImagePanel);
    }

    // 정적 내부 클래스
    static class MyImagePanel extends JPanel {
        // 내부 클래스의 멤버 변수 선언
        private Image image;

        // 내부 클래스 생성자
        public MyImagePanel() {
            // ImageIcon 데이터 타입을 -> .getImage() 메서드를 호출해서 형 변환 --> Image
            // ImageIcon(파일명) <--- 기준은 루트폴더 java_useful 아래를 확인 한다.
            image = new ImageIcon("image2_rm.png").getImage();
        }

        // 자동으로 호출 되게끔 순서가 정해져 있다.
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            // 이미지를 올려보자.
            g.drawImage(image, 100, 100, 100, 100, null);
        }

    } // end of static inner class


    // 테스트 코드
    public static void main(String[] args) {
        new MyImageFrame();
    }

}
