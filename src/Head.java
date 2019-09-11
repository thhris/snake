import java.awt.*;

public class Head extends SnakePart {

    private char direction;

    //Create starting position for head of snake
    public Head(Coordinate startPosition) {
        super(null);
        setPosition(startPosition);
        setColour(Color.RED);
    }

    public char getDirection() {
        return direction;
    }
}