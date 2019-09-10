import java.util.Iterator;

// LinkedList implementation of SnakePart
public class Snake implements SnakeList {

    private SnakePart head;
    private SnakePart body;
    // private int size; todo: replace length() with adder?

    public Snake(Coordinate start) {
        head = body = new Head(start);
        addBody();
        addBody();
    }

    @Override
    public void addBody() {
        body = new Body(body);
    }

    // returns length of snake
    @Override
    public int size() {
        int count = 0;
        SnakePart temp = body;

        do {
            temp = temp.getNext();
            count++;
        } while (temp.getNext() != null);

        return count;
    }

    // returns the head of the snake
    @Override
    public Head getHead() {
        return (Head) head;
    }

    // returns back of snake, which is linked to head
    @Override
    public SnakePart getSnake() {
        return body;
    }

    // returns body at specified index
    // starting from back
    @Override
    public Body getBody(int index) {
        // TODO: implement
        return new Body(null);
    }

    public Iterator iterator() {
        // TODO: plan to implement?
        return null; // todo
    }
}