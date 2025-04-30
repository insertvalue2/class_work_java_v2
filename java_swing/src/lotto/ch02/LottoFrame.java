package lotto.ch02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoFrame extends JFrame implements ActionListener {

    private int testNumber = 45;

    private JButton button;
    private LottoRandomNumber lottoRandomNumber;
    private int[] result = new int[6];

    public LottoFrame() {
        initData();
        setInitLayout();
        addEventListener();
    }

    private void initData() {
        setTitle("Lotto Game");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Game Start");
        lottoRandomNumber = new LottoRandomNumber();
    }
    private void setInitLayout() {
        add(button, BorderLayout.NORTH);

        setVisible(true);
    }
    private void addEventListener() {
        button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("그림을 그려라");
        result = lottoRandomNumber.createNumber();
        // 그림을 다시 그려라
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font f = new Font("궁서체", Font.BOLD, 20);
        g.setFont(f);

        g.drawString(result[0] + " ", 100, 300);
        g.drawString(result[1] + " ", 150, 300);
        g.drawString(result[2] + " ", 200, 300);
        g.drawString(result[3] + " ", 250, 300);
        g.drawString(result[4] + " ", 300, 300);
        g.drawString(result[5] + " ", 350, 300);

    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        new LottoFrame();
    }
}
