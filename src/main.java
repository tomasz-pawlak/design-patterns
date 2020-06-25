import Units.*;

public class main {


    //Bardzo czesto uzywany metod fabrykuja czesciej niz fabryka abstrakcyjna(framwerki robia wszystko). Enkapsuluja classy.
    // Uzywamy abstrakcji czyli fabryki
    public static void main(String[] args) {

        Factory blueFactory = new BlueFactory();
        Factory redFactory = new RedFactory();

        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit redAir = redFactory.createAirUnit(UnitType.HELICOPTER);

        MechanizedUnit blueTank = blueFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = blueFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit blueAir = blueFactory.createAirUnit(UnitType.HELICOPTER);
    }


}
