package TowerDefense;

import javax.swing.*;

/**
 * Created by nikita on 1/11/2017.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Game().start();
            }
        });
    }
}
