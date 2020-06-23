package House;

public class House {
    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String garage;
    private String doors;

    private House(HouseBuilder houseBuilder){
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.rooms = houseBuilder.rooms;
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.garage = houseBuilder.garage;
        this.doors = houseBuilder.doors;
    }

    public String getWalls() {
        return walls;
    }

    public String getFloors() {
        return floors;
    }

    public String getRooms() {
        return rooms;
    }

    public String getRoof() {
        return roof;
    }

    public String getWindows() {
        return windows;
    }

    public String getGarage() {
        return garage;
    }

    public String getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", garage='" + garage + '\'' +
                ", doors='" + doors + '\'' +
                '}';
    }

    public static class HouseBuilder{
        private String walls;
        private String floors;
        private String rooms;
        private String roof;
        private String windows;
        private String garage;
        private String doors;

        public HouseBuilder buildWalls(String walls){
            this.walls = walls;
            return this;
        }

        public HouseBuilder buildFloors(String floors){
            this.floors = floors;
            return this;
        }

        public HouseBuilder buildRooms(String rooms){
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder buildRoofs(String roof){
            this.roof = roof;
            return this;
        }

        public HouseBuilder buildWindows(String windows){
            this.windows = windows;
            return this;
        }

        public HouseBuilder buildGarage(String garage){
            this.garage = garage;
            return this;
        }

        public HouseBuilder buildDoors(String doors){
            this.doors = doors;
            return this;
        }

        public House build(){
            return new House(this);
        }

    }
}
