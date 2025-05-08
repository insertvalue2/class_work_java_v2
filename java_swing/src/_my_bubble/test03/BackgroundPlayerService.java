package _my_bubble.test03;


import bubble.test03.Player;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 현재 메인 쓰레드는 너무 바쁜 상태이다.
 * 백그라운드에서 계속 Player 에 움직을 관찰한 예정
 */
public class BackgroundPlayerService implements Runnable {

    @Override
    public void run() {

    }
}
