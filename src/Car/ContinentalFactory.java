package Car;

public class ContinentalFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;

    @Override
    public Car buildVolvo(VolvoModel volvoModel) {
        switch (volvoModel){
            case V40:
                return new Volvo(2.0,"LPG",1999,position);
            case S60:
                return new Volvo(1.8,"Diesel",2014,position);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public Car buildFord(FordModel fordModel) {
        switch (fordModel){
            case MONDEO:
                return new Ford(3.5,"98",2019,position);
            case ESCORT:
                return new Ford(2.0,"diesel",2010,position);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }

    }
}
