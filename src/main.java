import decorator.*;

//Minusy - bazuje na dziedziczeniu(tylko 1 w javie), mozliwość nadpisywania róznych metod moze stworzyc bałagan
//Przykłady w javie to inputStream
public class main {
    public static void main(String[] args) {

        generateMap();
    }

    private static void generateMap() {
        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();

        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new ForestDecorator(new Plain());

        Terrain terrain4 = new SwampDecorator(new ForestDecorator(new Hill()));
        Terrain terrain5 = new RoadDecorator(new ForestDecorator(new SwampDecorator(new Plain())));

        System.out.println("SwampDeco cost "+terrain2.fuelCost());
        System.out.println(terrain4.fuelCost());
        System.out.println(terrain5.fuelCost());
    }
}

