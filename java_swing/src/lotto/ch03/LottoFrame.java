package lotto.ch03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LottoFrame extends JFrame implements ActionListener {

    private static final String INITIAL_MESSAGE = "로또 번호를 클릭하세요";
    private static final String FONT_NAME = "고딕";
    private static final int FONT_SIZE = 20;

    private JButton button;
    private LottoRandomNumber lottoRandomNumber;
    private boolean isInitialState = true; // 초기 상태 플래그
    private int[] currentNumbers;

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
        currentNumbers = new int[LottoRandomNumber.LOTTO_NUMBER_COUNT];
    }

    private void setInitLayout() {
        setLayout(new BorderLayout()); // 기본값이다.
        add(button, BorderLayout.NORTH);
        setVisible(true);
    }

    private void addEventListener() {
        button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        isInitialState = false; // 상태값 변경
        currentNumbers = lottoRandomNumber.createNumber();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font(FONT_NAME, Font.BOLD, FONT_SIZE));

        if (isInitialState) {
            g.drawString(INITIAL_MESSAGE, 230, 200);
        } else {
            for (int i = 0; i < currentNumbers.length; i++) {
                g.drawString(currentNumbers[i] + "", 100 + (i * 50), 300);
            }
        }
    }

    // 테스트 코드 작성
    public static void main(String[] args) {
        new LottoFrame();
    }
}
