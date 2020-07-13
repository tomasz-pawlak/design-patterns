package visitor;

import activity.Animal;
import activity.Person;
import activity.Shipment;

public class NameTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Rodzaj zwierza to: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("Imie i nazwisko to: " + person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println("Prefix paczki to: "+ shipment.getPrefix() + " numer paczki to: " + shipment.getSerialNumber());
    }
}
