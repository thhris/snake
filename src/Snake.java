import java.util.LinkedList;

public class Snake {

    private Head head;
    private LinkedList<Body> bodies;

    public Snake(Coordinate start) {
        head = new Head(start);
        bodies = new LinkedList<>();
        bodies.add(new Body(head));
        bodies.add(new Body(head));
    }


    public char directionOfHead() {
        return 0;
    }


    public boolean isAlive() {
        return !hasCollided();
    }

    // collision detection
    public boolean hasCollided() {
        for (Body body : bodies) {
            if (head.getPosition() == body.getPosition()) {
                return true;
            }
        }
        return false;
    }

    // creates new body and appends it to snake
    public void addBody() {
        bodies.add(new Body(head));
    }

    // returns length of body
    public int lengthOfBody() {
        return bodies.size();
    }

    // returns the head of the snake
    public Head getHead(){
        return head;
    }

    // returns all the bodies of the snake in a linkedlist
    public LinkedList<Body> getBodies(){
        return bodies;
    }

    // returns a body at the specified index
    public Body getBody(int index){
        return bodies.get(index);
    }

    // puts snake on the tiles
    public void putSnakeOnTile(){
        int xHead = getHead().getPosition().getX();
        int yHead = getHead().getPosition().getY();

        Board.getInstance().getTiles()[xHead][yHead].setObject(getHead());

        int xBody = getBody(0).getPosition().getX();
        int yBody = getBody(0).getPosition().getY();

        Board.getInstance().getTile(xBody,yBody).setObject(getBody(0));
    }
}