import java.awt.*;

public class Body extends SnakePart {

    private SnakePart link;

    // Create starting position for this body of snake
    public Body(SnakePart next) {
        setNextLink(next);
        setColour(Color.BLUE);
        setPosition(link.getPosition().getX() + 1, link.getPosition().getY());
    }

    // sets this body to be linked to next body/head
    public void setNextLink(SnakePart next){
        link = next;
    }
}