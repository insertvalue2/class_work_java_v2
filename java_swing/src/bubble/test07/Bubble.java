package bubble.test07;

import javax.swing.*;

public class Bubble extends JLabel implements Moveable {

    private int x;
    private int y;

    // 물방울 움직임 상태
    private boolean left;
    private boolean right;
    private boolean up;

    private boolean isLeft; // true, false

    private ImageIcon bubble; // 기본 물방울
    private ImageIcon bomb; // 물방울이 터진 상태

    private Player player;
    private BackgroundBubbleService backgroundBubbleService;


    // 생성자를 통해서 Player 객체의 주소값을 주입 받기 -> 생성자 의존 주입
    public Bubble(Player player) {
        this.player = player;
        this.backgroundBubbleService = new BackgroundBubbleService(this);

        initData();
        setInitLayout();
        // 버블은 스레드가 하나면 된다.
        bubbleStartThread();
    }

    private void bubbleStartThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                if(player.getPlayerWay() == PlayerWay.LEFT) {
                    left();
                } else {
                    right();
                }
            }
        }).start();
    }


    private void initData() {
        bubble = new ImageIcon("img/bubble.png");
        bomb = new ImageIcon("img/bomb.png");

        left = false;
        right = false;
        up = false;
    }

    private void setInitLayout() {
        x = player.getX();
        y = player.getY();
        // TODO 수정 예정
        setIcon(bubble);
        // setIcon(bomb);

        setSize(50, 50);
        setLocation(x, y);
    }


    // getter
    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

    public boolean isUp() {
        return up;
    }

    public ImageIcon getBubble() {
        return bubble;
    }

    public Player getPlayer() {
        return player;
    }

    // setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public void setBubble(ImageIcon bubble) {
        this.bubble = bubble;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    @Override
    public void left() {
        left = true;
        for(int i = 0; i < 400; i++) {
            x--;
            setLocation(x, y);
            if(backgroundBubbleService.leftWall() == true) {
                // 왼쪽 벽이다.
                break;
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        up();
    }

    @Override
    public void right() {
        right = true;
        for(int i = 0; i < 400; i++) {
            x++;
            setLocation(x, y);
            // 좌표 오른쪽으로 1 움직였는데 오른쪽 벽인이 아닌지 매번 확인
            if(backgroundBubbleService.rightWall() == true) {
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        up();
    }

    @Override
    public void up() {
        up = true;
        while (true) {
            y--;
            setLocation(x, y);
            if(backgroundBubbleService.topWall() == true) {
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        // TODO 추후 수정 예정
        // 3초뒤에 이미지를 변경해 보세요
        try {
            Thread.sleep(3000);
            setIcon(bomb);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(500);
            setIcon(null);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
