package _my_bubble;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;

    // 플레이어의 속도 상태
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;

    // 플레이어의 움직인 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    public Player() {
        initData();
        setInitLayout();
    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");
        // 플레이어 초기 상태 설정
        x = 55;
        y = 535;

        left = false;
        right = false;
        up = false;
        down = false;
    }

    private void setInitLayout() {


        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);
    }


    @Override
    public void left() {
        System.out.println("player left() 메서드 호출 됨");
        setIcon(playerL);
        x = x - 10;
        setLocation(x, y);
    }

    @Override
    public void right() {
        right = true; // 움직임 상태값 변경
        setIcon(playerR);
        // 익명 클래스 - thread.start() ---> run() 메서안에 구문 동작된다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right) {
                    x = x + SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }

    @Override
    public void up() {
        System.out.println("player up() 메서드 호출 됨");
    }

    @Override
    public void down() {

    }
}
