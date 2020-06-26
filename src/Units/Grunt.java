package Units;

public class Grunt {
    private double x;
    private double y;
    private int hpLeft;
    private UnitStats stats;

    public Grunt(double x, double y) {
        stats = UnitStatsRepository.getGruntStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
