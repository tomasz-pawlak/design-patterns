import Child.*;
import MotherRequest.MotherRequest;

//Niezbyt popularny, pozbycie sie zbyt duzej ilosci if'ow. Dobre praktyki programistyczne. Przekazywanie jakiegos zadania wyżej.
public class main {
    public static void main(String[] args) {
        MotherRequest motherRequest = new MotherRequest(Shelf.MEDIUM);

        Child paulina = new Paulina();
        Child tomek = new Tomek();
        Child bartek = new Bartek();

        paulina.setTallerChild(tomek);
        tomek.setTallerChild(bartek);

        paulina.processRequest(motherRequest);
    }


}

