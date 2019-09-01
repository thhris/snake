import java.awt.*;

public abstract class SnakePart extends GameObject {

    public Color colour;

    public Coordinate position;

    public Coordinate position() {
        Coordinate coords = new Coordinate(10, 10);
        return coords;
    }

    public SnakePart() {
    }

}