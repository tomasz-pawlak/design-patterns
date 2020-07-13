//behawioralny, jedny z gang of 4. Zastosowanie - akcje na klasach ktore nie maja ze soba wiele wspolnego.
//klasy czesto rozboduwowane, rozwijane to sie nie sprawdzi, wtedy trza aktualizowac interface Visitor

import activity.Animal;
import activity.Person;
import activity.Shipment;
import activity.Transportable;
import visitor.NameTransportVisitor;
import visitor.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();

        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        for (Transportable transportable: transportableList
             ) {
            transportable.accept(nameTransportVisitor);
        }

        System.out.println("------------------");

        for (Transportable transportable: transportableList
             ) {
            transportable.accept(priceTransportVisitor);
        }

    }


}

