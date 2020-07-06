package Units;

public class ColorRespository {

    private ColorRespository(){

    };

    static Color white = new Color(0,0,0);
    static Color black = new Color(255,255,255);

    static public Color getWhite() {
        return white;
    }

    public static Color getBlack() {
        return black;
    }
}
