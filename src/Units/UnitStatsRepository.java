package Units;

public class UnitStatsRepository {
    private UnitStatsRepository(){}

    private static UnitStats gruntStats = new UnitStats("Grunt",200,0,10,3,1);
    private static UnitStats shamanStats = new UnitStats("Shaman",120,200,5,2,3);
    private static UnitStats witchDoctor = new UnitStats("Witch Doctor",130,220,1,1,2);

    public static UnitStats getGruntStats(){
        return gruntStats;
    }

    public  static UnitStats getShamanStats(){
        return shamanStats;
    }

    public static UnitStats getWitchDoctor(){
        return witchDoctor;
    }

}
