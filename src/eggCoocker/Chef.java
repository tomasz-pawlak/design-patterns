package eggCoocker;

public class Chef {

    public String name;
    private EggCooker eggCooker;

    public Chef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }

    public void cook(){
        this.eggCooker.cookEgg();
    }
}
