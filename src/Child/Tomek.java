package Child;

import MotherRequest.MotherRequest;

public class Tomek extends Child {
    private static final String NAME = "Tomek";

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.MEDIUM)){
            System.out.println(NAME + "zdejmuje z polki");
        }else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
