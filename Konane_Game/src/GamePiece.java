/**
 * Game piece is a class used to represent the game pieces on the board for konane
 * Each game piece has a color and a unique id used for identification
 *
 * @author Albert Garcia
 * @version 1.0
 */
public class GamePiece {

    private static int next_id = 0;
    private int id;
    private int row;
    private int col;
    private Color color;

    /**
     * Game piece constructor, initializes a new game piece
     * @param r row on the board
     * @param c column on the board
     * @param col black or white piece
     */
    public GamePiece(int r, int c, Color col)
    {
        this.id = next_id;
        next_id++;
        this.row = r;
        this.col = c;
        this.color = col;
    }

    /**
     * Method for updating the coordinates of the game piece
     * @param r row coordinate
     * @param c column coordinate
     */
    public void update_coordinates(int r, int c)
    {
        this.row = r;
        this.col = c;
    }

    /**
     * Method returns the id of the game piece
     * @return game piece id
     */
    public int get_id()
    {
        return this.id;
    }

    /**
     * Method returns game piece row position
     * @return game piece row position
     */
    public int get_row()
    {
        return this.row;
    }

    /**
     * Method returns the column position of the game piece
     * @return game piece column position
     */
    public int get_column()
    {
        return this.col;
    }

    /**
     * Method returns color of game piece as a string
     * @return game piece color
     */
    public String get_color()
    {
        String clr = "";
        if (color == Color.BLACK)
            clr = "black";
        else if(color == Color.WHITE)
            clr = "white";
        return clr;
    }

    /**
     * Returns the coordinates of this piece in the form of a string
     * @return the row and column of the game piece
     */
    public String get_coordinates()
    {
        return "<" + this.row + "," + this.col + ">";
    }
}
