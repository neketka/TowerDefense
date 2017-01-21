package TowerDefense;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

/**
 * Created by nikita on 1/11/2017.
 */
public class Game extends JFrame {
    private boolean running;
    private int fps;
    public Game() {
        super("Tower Defense");
        this.running = false;
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    public void start() {
        this.setVisible(true);
        this.fps = 0;
        this.running = true;
        while (running) {
            float t1 = System.nanoTime();
            renderFrame();
            float t2 = System.nanoTime();
            fps = (int)(1000000000 / (t2 - t1));
        }
    }

    public void runMotion() {
    }

    public void renderFrame() {
        BufferedImage buffer = new BufferedImage(800, 600, BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D g2d = buffer.createGraphics();

    }
}
