public abstract class Player {

    private final Color pieceColor;// Color of the player's game piece
    private int gameStatus;// Tracks the player's status


    /**
     * Constructor for a human player
     * @param p chosen color for the player
     */
    public Player(Color p){
        this.pieceColor = p;
        this.gameStatus = 0;
    }

    /**
     * Method for carrying out a player's move. Differs between each player type
     */
    public abstract void makeMove(GameBoard gameBoard);

    /**
     * @return player's game piece color
     */
    public String getColor(){
        if(pieceColor == Color.BLACK){
            return "B";
        }
        return "W";
    }

    /**
     * @return game status of the player
     */
    public String getGameStatus(){
        String status = "";
        switch (gameStatus){
            case 0:
                status = "STILL PLAYING";
                break;
            case 1:
                status = "VICTORY";
                break;
            case 2:
                status = "LOSS";
                break;
        }
        return status;
    }

    /**
     * Method for setting the game status of the player
     * @param id specifies what the game status should be
     * @throws Exception in case an invalid game status id is entered
     */
    public void setGameStatus(int id) throws Exception{
        if(id == 0 || id == 1 || id == 2){
            gameStatus = id;
        }else{
            throw new Exception("Invalid Game Status Entered (0 = Still Playing, 1 = Win, 2 = Lose)");
        }
    }
}