package Units;

public class WitchDoctor {

    private double x;
    private double y;
    private int hpLeft;
    private UnitStats stats;

    public WitchDoctor(double x, double y) {
        stats = UnitStatsRepository.getWitchDoctor();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
