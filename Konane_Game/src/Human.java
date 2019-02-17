import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Human extends Player{

    //Human player identified by name
    private String name;

    /**
     * Constructor for the human player
     * @param name is the name of the player
     * @param p the player's game piece color
     */
    public Human(String name, Color p){
        super(p);
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void makeMove(GameBoard board){
        if(board.getTurnCount() == 1){
            // Runs routine for removing pieces
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nPlease choose a piece to remove from the following:\n8,8 or 1,1 or 5,5 or 4,4");
            try {
                String move = reader.readLine();
                int r = Integer.parseInt(move.substring(0,1))-1;
                int c = Integer.parseInt(move.substring(2,3))-1;
                board.removePiece(r,c);
            }catch(Exception e){
                System.out.println(e);
                makeMove(board);
            }
        }else if(board.getTurnCount() == 2){
            // Look at the last piece removed

        }
    }
}
