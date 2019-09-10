import java.awt.*;

public class Board {

    private static Board board;

    private Tile[][] tiles;

    // Singleton implementation
    private Board() {
        initialTileIndex();
        initialTilePaint();
    }

    public static Board getInstance(){
        if(board == null)
            board = new Board();

        return board;
    }

    public void initialTileIndex() {
        tiles = new Tile[21][21];
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 20; j++) {
                tiles[i][j] = new Tile();
                tiles[i][j].setPosition(i, j);
            }
        }
    }

    public void initialTilePaint(){
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

    public Tile getTile(int x, int y){
        return tiles[x][y];
    }

    public Tile getTile(Coordinate position){
        return tiles[position.getX()][position.getY()];
    }

    public void clearBoard() {
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                tiles[i][j].removeObject();
            }
        }
    }

    public void updateBoard() {
        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                tiles[i][j].setColour(tiles[i][j].getObject().getColour());
            }
        }
    }

    public void placeObjectOnTile(GameObject object){
        Tile tile = getTile(object.getPosition());
        tile.setObject(object);
    }

    public void placeSnake(SnakePart part){
        SnakePart temp = part;
        placeObjectOnTile(temp);
        while(temp.getNext() != null){
            temp = temp.getNext();
            placeObjectOnTile(temp);
        }
    }
}