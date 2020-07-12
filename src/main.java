//Wykorzystywany w celu zapamietania stanu obiektu, wydzielenia stanu do osobnej kalsy i oddanie tej kontroli.
//Np forumlarz - ktos wykał pierwszą stronę formularza, pomylił się na piątej i chce wrócić, bez straty.
//W sprinhu webflow. Enkapsulacja najważniejsza w tym wszystkim

import operatingSystem.OperatingSystem;
import operatingSystem.OperatingSystemCaretaker;

public class main {
    public static void main(String[] args) {


        OperatingSystemCaretaker caretaker = new OperatingSystemCaretaker();
        OperatingSystem operatingSystem = new OperatingSystem();

        operatingSystem.createBackup();
        operatingSystem.createBackup();

        caretaker.addMemento(operatingSystem.save());

        operatingSystem.createBackup();

        caretaker.getMemento();

    }


}

