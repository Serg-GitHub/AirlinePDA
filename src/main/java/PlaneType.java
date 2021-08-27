public enum PlaneType {

    BOEING767("Boeing 767", 250, 10.000);


    private final String model;
    private final int capacity;
    private final Double totalWeight;


    PlaneType(String model, int capacity, Double totalWeight ){
        this.model = model;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }
}


