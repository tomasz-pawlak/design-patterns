package visitor;

import activity.Animal;
import activity.Person;
import activity.Shipment;

public interface TransportVisitor {

    void visit(Animal animal);

    void visit(Person person);

    void visit(Shipment shipment);

}
