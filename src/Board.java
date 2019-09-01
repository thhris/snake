import java.awt.*;
import java.util.ArrayList;

public class Board {

    private static Board board;

  private Tile[][] tiles;

  private Board() {
      initialiseTiles();
      paintTiles();
  }

  // Initialises the tiles in the array
  public void initialiseTiles() {
      tiles = new Tile[21][21];
      for (int i = 0; i <= 20; i++) {
          for (int j = 0; j <= 20; j++) {
              tiles[i][j] = new Tile();
          }
      }
  }

  // Paints the tiles
  public void paintTiles(){
      for (int i = 0; i <= 20; i++) {
          for (int j = 0; j <= 20; j++) {
              if (i == 0 || j ==0 || i == 20 || j == 20) {//make a gray border around the grid
                  tiles[i][j].setColour(Color.GRAY);
              } else {
                  tiles[i][j].setColour(Color.BLACK);
              }
          }
      }
  }

  public Tile[][] getTiles(){
      return tiles;
  }

  public static Board getInstance(){
      if(board == null)
          board = new Board();

      return board;
  }

  public void clearBoard() {

  }

  public void updateBoard() {

  }
}