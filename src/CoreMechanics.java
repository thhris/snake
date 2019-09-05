public class CoreMechanics {

  private static Board board;
  private static final Coordinate START_COORDS = new Coordinate(10, 10);

  public Snake snake;

  public void initialiseGame() {
    board = Board.getInstance();
    board.initialiseTiles();

    snake = new Snake(START_COORDS);
    snake.putSnakeOnTile();


  }

  public void sendBoard(){

  }

  public void initialiseSnakeStart() {

  }

  public void randomisePointGeneration() {
  }

  public void gameOver() {
  }

  public void pauseGame() {
  }

  public void drawBoard() {
  }

}