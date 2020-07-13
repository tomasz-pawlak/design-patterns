package visitor;

import activity.Animal;
import activity.Person;
import activity.Shipment;

public class PriceTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("Cena przewozu zwierza to: "+animal.getWeight() * 0.2);
    }

    @Override
    public void visit(Person person) {
        int price = 6;

        if (person.isRegularCustomer()){
            price = price/2;
        }

        System.out.println("Cena przewozu osoby tp: " +price);
    }

    @Override
    public void visit(Shipment shipment) {
        int price = 2;

        if (shipment.isLarge()){
            price = price *3;
        }

        System.out.println("Cena przewozu paczki to: "+price);
    }
}
