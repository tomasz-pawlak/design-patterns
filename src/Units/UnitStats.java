package Units;

public class UnitStats {
    private String name;
    private int hp;
    private int mana;
    private int armour;
    private int attackSpeed;
    private int numberOfSkills;

    public UnitStats(String name, int hp, int mana, int armour, int attackSpeed, int numberOfSkills) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.armour = armour;
        this.attackSpeed = attackSpeed;
        this.numberOfSkills = numberOfSkills;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getArmour() {
        return armour;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public int getNumberOfSkills() {
        return numberOfSkills;
    }
}
