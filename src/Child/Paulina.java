package Child;

import MotherRequest.MotherRequest;

public class Paulina extends Child {
    private static final String NAME = "Paulina";

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (motherRequest.getShelf().equals(Shelf.LOW)){
            System.out.println(NAME + " zdejmuje z niskiej polki");
        }else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
