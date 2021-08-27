public enum PlaneType {

    BOEING767("Boeing 767", "50", "2500");


    private final String model;
    private final String capacity;
    private final String totalWeight;


    PlaneType(String model, String capacity, String totalWeight ){
        this.model = model;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getModel() {
        return model;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getTotalWeight() {
        return totalWeight;
    }
}


