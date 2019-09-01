import java.util.LinkedList;

public class Snake {

    private Head head;
    private Body body;
    public LinkedList<Body> bodies;

    public Snake() {
        Coordinate coor = new Coordinate(10, 10);
        head = new Head(coor);
        body = new Body(head);
        bodies.add(body);
    }

    public char directionOfHead() {
        return 0;
    }

    public boolean isAlive() {
        if (hasCollided() == true) {
            return false;
        } else
            return true;
    }

    public boolean hasCollided() {
        for (Body body : bodies) {
            if (head.position == body.position) {
                return true;
            }
        }
        return false;
    }

    public void addBody() {
        bodies.add(body);
    }

    public int lengthOfBody() {
        return bodies.size();
    }
}