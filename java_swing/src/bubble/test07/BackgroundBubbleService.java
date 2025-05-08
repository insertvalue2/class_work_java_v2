package bubble.test07;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * BackgroundPlayService 는 스레드가 계속 돌고 있는 상태이다.
 * BackgroundBubbleService 는 스레드가 너무 많이 발생이 되어서
 * 게임에 많은 영향을 미칠 수 있다. 즉, 너무 느려질 가능성이 많다.
 */
public class BackgroundBubbleService  {

    private BufferedImage image;
    private Bubble bubble;

    public BackgroundBubbleService(Bubble bubble) {
        try {
            this.bubble = bubble;
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 왼쪽 벽 확인
    public boolean leftWall() {
        Color leftColor = new Color(image.getRGB(bubble.getX() + 10 , bubble.getY() + 25));
        // 빨간색 --> R G B (255, 0, 0 ) ---> 왼쪽 벽 판단 됨
        if(leftColor.getRed() == 255 && leftColor.getBlue() == 0 && leftColor.getGreen() == 0) {
            // 왼쪽 벽에 붙음
            return  true;
        }
        return  false;
    }

    // 오른쪽 벽 확인
    public boolean rightWall() {
        Color rightColor = new Color(image.getRGB(bubble.getX() + 60, bubble.getY() + 25));
        // 빨간색 --> R G B (255, 0, 0 ) ---> 오른쪽 벽 판단 됨
        if(rightColor.getRed() == 255 && rightColor.getBlue() == 0 && rightColor.getGreen() == 0) {
            // 왼쪽 벽에 붙음
            return  true;
        }
        return  false;
    }

    // 천장 확인
    public boolean topWall() {
        Color topColor = new Color(image.getRGB(bubble.getX() + 35, bubble.getY()));
        // 빨간색 --> R G B (255, 0, 0 ) ---> 천장이라고 판단 됨
        if(topColor.getRed() == 255 && topColor.getBlue() == 0 && topColor.getGreen() == 0) {
            // 천장에  붙음
            return true;
        }
        return  false;
    }

}
