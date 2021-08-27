public class Passenger extends Person {
    private int numOfBags;


    public Passenger(String name, int age, int numOfBags) {
        super(name, age);
        this.numOfBags = numOfBags;
    }

    public int getNumOfBags() {
        return numOfBags;
    }
}
