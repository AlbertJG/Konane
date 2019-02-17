/**
 * Gameboard is a class that represents the board used for playing Konane
 * Stored as a 2-D Array and its size is set to be 8 x 8
 */
public class GameBoard {

    private GamePiece[][]gameboard = new GamePiece[8][8];
    private int turnCount = 1;// Game starts at turn 1
    private Move lastMove;// Records the most recent change made to the board

    /**
     * Gameboard constructor, initializes a new gameboard
     */
    public GameBoard(){
        // Fills the gameboard with game pieces
        Color currentColor = Color.BLACK;
        for(int r = 0; r < 8; r++){
            for(int c = 0; c < 8; c++){
                gameboard[r][c] = new GamePiece(r,c,currentColor);
                currentColor = switchColor(currentColor);
            }
            currentColor = switchColor(currentColor);
        }
    }

    /**
     * Helper method to alternate colors when filling the gameboard
     * @param c color of game piece
     * @return color opposite of the given
     */
    private Color switchColor(Color c){
        if(c == Color.BLACK){
            return Color.WHITE;
        }
        return Color.BLACK;
    }

    @Override
    public String toString(){
        StringBuilder board = new StringBuilder("    1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 |");
        for(int r = 0; r < 8; r++){
            board.append("\n").append(r + 1).append(" | ");
            for(int c = 0; c < 8; c++){
                if(gameboard[r][c] == null){
                    board.append("  | ");
                }else {
                    board.append(gameboard[r][c].get_color()).append(" | ");
                }
            }
        }
        return board.toString();
    }

    public void removePiece(int r, int c){
        gameboard[r][c] = null;
        // Set the last move made

    }

    /**
     * Method returns the current turn count of the game
     * @return turnCount
     */
    public int getTurnCount(){
        return this.turnCount;
    }

}
