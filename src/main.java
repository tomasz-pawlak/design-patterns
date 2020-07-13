//behawioralny, jedny z gang of 4. Zastosowanie - akcje na klasach ktore nie maja ze soba wiele wspolnego.
//klasy czesto rozboduwowane, rozwijane to sie nie sprawdzi, wtedy trza aktualizowac interface Visitor

import activity.Squash;
import activity.Treadmill;
import visitor.VisitorImpl;

public class main {
    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(20);
        Squash squash = new Squash(50);

        VisitorImpl visitor = new VisitorImpl();

        visitor.visit(squash);
        visitor.visit(treadmill);


    }


}

