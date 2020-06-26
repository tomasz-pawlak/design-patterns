package Car;

public abstract class Car {

    private double pojemnosc;
    private String petrol;
    private int year;
    SteeringWheelPosition steeringWheelPosition;

    protected Car(double pojemnosc, String petrol, int year, SteeringWheelPosition steeringWheelPosition) {
        this.pojemnosc = pojemnosc;
        this.petrol = petrol;
        this.year = year;
        this.steeringWheelPosition = steeringWheelPosition;
    }

    public double getPojemnosc() {
        return pojemnosc;
    }

    public String getPetrol() {
        return petrol;
    }

    public int getYear() {
        return year;
    }

    public SteeringWheelPosition getSteeringWheelPosition() {
        return steeringWheelPosition;
    }
}
