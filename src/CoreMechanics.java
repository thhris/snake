import java.util.Random;

public class CoreMechanics {

    private static Board board;
    private static final Coordinate START_COORDS = new Coordinate(10, 10);

    public Snake snake;

    public void initialiseGame() {
        board = Board.getInstance();

        snake = new Snake(START_COORDS);
        snake.putSnakeOnTile();

        randomisePointGeneration();
    }

    public void sendBoard() {

    }

    public void initialiseSnakeStart() {

    }

    public void randomisePointGeneration() {
        Point point = new Point();
        point.setPosition(randomPosition());
        board.placeObjectOnTile(point);
    }

    public Coordinate randomPosition(){
        Random r = new Random();
        int x = 1 + r.nextInt(19);
        int y = 1 + r.nextInt(19);
        return new Coordinate(x, y);
    }

    public void gameOver() {
    }

    public void pauseGame() {
    }

    public void drawBoard() {
    }

}