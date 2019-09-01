import java.util.Vector;

public class CoreMechanics {

  public static Board board;

  public Snake snake;

  public void initialiseGame() {
    board = Board.getInstance();
    board.initialiseTiles();
    board.updateBoard();
  }

  public void sendBoard(){

  }

  public void randomiseSnakeStart() {
  }

  public void randomisePointGeneration() {
  }

  public void gameOver() {
  }

  public static Board getBoard() {
    return board;
  }

  public void pauseGame() {
  }

  public void drawBoard() {
  }

}