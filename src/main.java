import Car.Car;
import Car.CommonwealthFactory;
import Car.ContinentalFactory;
import Car.Factory;
import Car.VolvoModel;
import Car.FordModel;

public class main {

    public static void main(String[] args) {

        Factory commonFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car volvo = commonFactory.buildVolvo(VolvoModel.S60);
        System.out.println(volvo.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.ESCORT);
        System.out.println(ford.getSteeringWheelPosition());
    }
}
