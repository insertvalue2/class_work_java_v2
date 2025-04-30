package _swing;

import javax.swing.*;

/**
 * JLabel 이용해서 이미지를 다울 수 있다.
 * JLabel.add(); 메서드를 이용해서 이미지를 겹칠 수 있다.
 * 좌표 기준으로 배치관리자를 셋팅 하려면 null 값을 셋팅 해야 한다.
 */
public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;

    public MyFrame() {

        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("JLabel 이용한 이미지 사용 연습");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundIcon = new ImageIcon("images/backgroundMap.png");
        ImageIcon playerIcon = new ImageIcon("images/player2.png");

        // JLabel
        backgroundMap = new JLabel(backgroundIcon);
        // JLabel
        player = new JLabel(playerIcon);

        backgroundMap.setSize(1000, 1000);
        backgroundMap.setLocation(0, 0);

        player.setSize(100, 100);
        player.setLocation(200, 200);

    }

    private void setInitLayout() {
        // 좌표 기반으로 셋팅이 됨( 주의점 - 컴포넌트에 크기 지정, 컴포넌트에 x,y 지정 )
        setLayout(null);
        // 루트 패널에 붙이기
        add(player);
        add(backgroundMap);
        // 맨 밑에서 보여라 명령어를 주자.
        setVisible(true);
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        new MyFrame();
    }

}


