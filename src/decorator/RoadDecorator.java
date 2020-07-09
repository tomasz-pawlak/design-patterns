package decorator;

public class RoadDecorator extends TerrainDecorator {

    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost() -20;
    }
}
