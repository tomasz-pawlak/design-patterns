package House;

public interface HouseBuilder {

    void buildWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildWindows();
    void buildGarage();
    void buildDoors();

    House getHouse();
}
