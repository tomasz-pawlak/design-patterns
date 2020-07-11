import workshop.CoffeeMaker;
import workshop.Robot;
import workshop.WorkshopApp;
import workshop.command.*;

//dosc popularny, uzywany glownie do enkapsulacji, odizolowac dzialanie od strefy klienta. przykład to Runnable.
// Wada: każda w innej klasie metoda - bałagan w projekcie
public class main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        workshopApp.addToList(new RobotTurnonCommand(robot));
        workshopApp.addToList(new RobotCutCommand(robot));
        workshopApp.addToList(new RobotTurnoffCommand(robot));

        workshopApp.addToList(new CoffeeMakerStart(coffeeMaker));
        workshopApp.addToList(new CoffeeMakerStop(coffeeMaker));

        workshopApp.run();

    }


}

