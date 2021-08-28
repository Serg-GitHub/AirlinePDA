public enum PlaneType {

    BOEING767("Boeing 767", 250, 10.000);


    private final String type;
    private final int capacity;
    private final Double totalWeight;


    PlaneType(String type, int capacity, Double totalWeight ){
        this.type = type;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }
}


