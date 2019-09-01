import javax.swing.*;
import java.awt.*;

public class View extends JPanel {
    public boolean pause;
    public static long score;
    private Color[][] grid;
    public static int level;
    private Tile[][] tiles;

    public void init(){
        tiles = Board.getInstance().getTiles();
    }

    @Override
    public void paintComponent(Graphics g) {
        // Paint the grid
        g.fillRect(0, 0, 28 * 21, 28 * 21);
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20; j++) {
                g.setColor(tiles[i][j].getColour());
                g.fillRect(28 * i, 28 * j, 25, 25);
            }
        }

        g.setColor(Color.WHITE);
        g.drawString("Score: " + score, 500, 40);// Display the score
        g.drawString("Level: " + level, 500, 60);// Display the level
    }
}