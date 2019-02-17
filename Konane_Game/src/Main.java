public class Main {

    public static void main(String[]args)
    {
        GameBoard board = new GameBoard();
        System.out.println(board);
        Player p = new Human("Albert", Color.BLACK);
        p.makeMove(board);
        System.out.println();
        System.out.println(board);
        System.out.println(Color.BLACK);

    }
}
