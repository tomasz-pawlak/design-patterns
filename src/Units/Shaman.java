package Units;

public class Shaman {

    private double x;
    private double y;
    private int hpLeft;
    private UnitStats stats;

    public Shaman(double x, double y) {
        stats = UnitStatsRepository.getShamanStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
