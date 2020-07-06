import Units.*;


public class main {

    //Pyłek używany jest aby odciążyć pamięć, przy tworzeniu dużej ilości obiektów
    //wyodrębnienie części wspólnej dla tych miliona obiektów do 1 pojedynczego obiektu i wspoldzieleniue miedzy innymi
    //czy wogole warto? wiecej pracy niz pozytku
    public static void main(String[] args) {
        ChessPiece blackKing = new BlackKing("king","g","1");
        ChessPiece whiteTowe = new WhiteTower("tower","a","1");

        ChessPiece whiteQueen = new WhiteQueen("Queen","k","6");
        ChessPiece blackHorse = new BlackHorse("horse","j","k");


        System.out.println(blackKing.getColor()==blackHorse.getColor());
        System.out.println(whiteTowe.getColor()==whiteQueen.getColor());

    }
}
