package Car;

public class CommonwealthFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.LEFT;

    @Override
    public Car buildVolvo(VolvoModel volvoModel) {
        switch (volvoModel){
            case S60:
                return new Volvo(2.4,"LPG",2020, position);
            case V40:
                return new Volvo(1.8,"Disel",1999,position);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public Car buildFord(FordModel fordModel) {
        switch (fordModel){
            case ESCORT:
                return new Ford(2.2,"95",2015,position);
            case MONDEO:
                return new Ford(1.2,"Diesel",2016,position);
            default:
                throw new UnsupportedOperationException("Nieznany mdoel");
        }
    }
}
