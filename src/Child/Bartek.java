package Child;
import MotherRequest.MotherRequest;

public class Bartek extends Child {
    private static final String NAME = "Bartek";

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.HIGH)){
            System.out.println(NAME +" zdjal z najwyzesj półki");
        }else {
            System.out.println("Skladnik zostaje na gorze , bartek jest za niski");
        }
    }
}
