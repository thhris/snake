import java.awt.*;

public class Head extends SnakePart {

    public char direction;

    //Create starting position for head of snake
    public Head(Coordinate startPosition) {
        super(null);
        setPosition(startPosition);
        setColour(Color.RED);
    }

}