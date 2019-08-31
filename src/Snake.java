import javax.swing.*;
import java.awt.*;

public class Snake extends JPanel {
    public boolean pause;
    public static long score;
    private Color[][] grid;
    public static int level;

    public void init() {
        grid = new Color[12][22];//make the grid black
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 21; j++) {
                if (i == 0 || i == 11 || j == 20) {//make a gray border around the grid
                    grid[i][j] = Color.GRAY;
                } else {
                    grid[i][j] = Color.BLACK;
                }
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        // Paint the grid
        g.fillRect(0, 0, 28 * 12, 28 * 21);
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 21; j++) {
                g.setColor(grid[i][j]);
                g.fillRect(28 * i, 28 * j, 25, 25);
            }
        }

        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 220, 23);// Display the score
        g.drawString("Level: " + level, 220, 40);// Display the level
    }

}