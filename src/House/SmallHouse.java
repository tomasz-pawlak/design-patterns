package House;

public class SmallHouse implements HouseBuilder {

    private House house;

    public SmallHouse() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("small");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("small");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("small");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("small");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("small");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("small");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("small;");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
