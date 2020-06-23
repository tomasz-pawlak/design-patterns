package House;

public class BigHouse implements HouseBuilder {

    private House house;

    public BigHouse() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("big");
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("big");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("big");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("big");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("big");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("big");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("big;");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
