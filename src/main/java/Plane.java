public class Plane {
    private int capacity;
    private Double weight;
    private PlaneType type;

    public Plane(int capacity, Double weight, PlaneType planeType) {
        this.capacity= capacity;
        this.weight = weight;
        this.type = planeType;

    }


    public int getCapacity() {
        return capacity;
    }

    public Double getWeight() {
        return weight;
    }

    public PlaneType getType(){
        return type;
    }
}
