import java.awt.*;
import java.util.Vector;

public class Head extends SnakePart {

  //Create starting position for head of snake
  public Head(Coordinate startPosition) {
    position = startPosition;
    setColour(Color.RED);

  }

  public char direction;

  public void setColour(Color col) {
    colour = col;
  }

}