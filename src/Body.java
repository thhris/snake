import java.awt.*;
import java.util.Vector;

public class Body extends SnakePart {

    public Body(Head head) {
        position = head.position;
        setColour(Color.BLACK);
    }

    public void setColour(Color col) {
        colour = col;
    }

}