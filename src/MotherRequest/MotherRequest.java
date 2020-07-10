package MotherRequest;

import Child.Shelf;

public class MotherRequest {
    Shelf shelf;


    public Shelf getShelf() {
        return shelf;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public MotherRequest(Shelf shelf) {
        this.shelf = shelf;
    }
}
