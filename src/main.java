//Wykorzystywany w celu zapamietania stanu obiektu, wydzielenia stanu do osobnej kalsy i oddanie tej kontroli.
//Np forumlarz - ktos wykał pierwszą stronę formularza, pomylił się na piątej i chce wrócić, bez straty.
//W sprinhu webflow. Enkapsulacja najważniejsza w tym wszystkim

import smart_app.SmartApp;
import smart_app.SmartAppCaretaker;

public class main {
    public static void main(String[] args) {
        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.changeVersion(2.0);

        smartAppCaretaker.getMemento(0);

    }


}

