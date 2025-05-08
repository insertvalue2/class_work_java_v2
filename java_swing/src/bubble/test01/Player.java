package bubble.test01;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;

    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");
    }

    private void setInitLayout() {
        x = 55;
        y = 535;
        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);
    }


    @Override
    public void left() {
        System.out.println("player left() 메서드 호출 됨");
    }

    @Override
    public void right() {
        System.out.println("player right() 메서드 호출 됨");
    }

    @Override
    public void up() {
        System.out.println("player up() 메서드 호출 됨");
    }

    @Override
    public void down() {

    }
}
