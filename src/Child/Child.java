package Child;

import MotherRequest.MotherRequest;

public abstract class Child {
    private Child tallerChild;

    public void processRequest(MotherRequest motherRequest){

    }

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }
}
