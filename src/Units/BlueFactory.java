package Units;

public class BlueFactory extends Factory {
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {

        switch (type){
            case RIFLEMAN:
                return new Rifleman(25,0,30);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(100,10,50);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type){
            case HELICOPTER:
                return new Helicopter(250,50,33);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
