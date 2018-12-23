public class Main {

    public static void main(String[]args)
    {
        GamePiece piece = new GamePiece(2,2,Color.BLACK);

        System.out.println(piece.get_coordinates());
        System.out.println(piece.get_color());
    }
}
