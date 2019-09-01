import java.awt.*;

public class Body extends SnakePart {

    public Body(Head head) {
        position = head.position;
        setColour(Color.BLUE);
    }

    public void setColour(Color col) {
        colour = col;
    }

}