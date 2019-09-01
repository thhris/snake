import javax.swing.*;
import java.awt.*;

public class Main extends View {

    public static void main(String[] args) {

        //Create frame
        JFrame frame = new JFrame("Snake");
        frame.setSize(700, 625);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel for buttons
        JPanel buttonBar = new JPanel();
        buttonBar.requestFocus(false);
        frame.add(buttonBar, BorderLayout.EAST);
        buttonBar.setLayout(new BoxLayout(buttonBar, BoxLayout.Y_AXIS));

        JLabel s = new JLabel("BUTTONS:");
        buttonBar.add(s);

        //Buttons
        JButton pauseBut = new JButton("PAUSE");
        buttonBar.add(pauseBut);
        pauseBut.setBackground(new Color(59, 89, 182));
        pauseBut.setBounds(50, 50, 250, 100);
        pauseBut.setFocusPainted(false);
        pauseBut.setForeground(Color.WHITE);

        JButton resumeBut = new JButton("RESUME");
        buttonBar.add(resumeBut);
        resumeBut.setBackground(new Color(59, 89, 182));
        resumeBut.setFocusPainted(false);
        resumeBut.setForeground(Color.WHITE);
        resumeBut.setVisible(false);//make resume invisible

        JButton resetBut = new JButton("NEW GAME");
        buttonBar.add(resetBut);
        resetBut.setBackground(new Color(59, 89, 182));
        resetBut.setFocusPainted(false);
        resetBut.setForeground(Color.WHITE);

        final View game = new View();
        frame.add(game);
        game.init();

        //Button controls
        //PAUSE
        pauseBut.addActionListener(e -> {

            game.pause = true;
            pauseBut.setVisible(false);
            resumeBut.setVisible(true);
        });

        //RESUME
        resumeBut.addActionListener(e -> {
            game.pause = false;
            pauseBut.setVisible(true);
            resumeBut.setVisible(false);
        });

        //RESET
        resetBut.addActionListener(e -> {
            game.pause = false;
            pauseBut.setVisible(true);
            resumeBut.setVisible(false);
            game.init();
        });
    }
}