public class Passenger {
    private final String name;
    private final int age;
    private int numberOfBags;


    public Passenger(String name, int age, int numberOfBags) {
        this.name = name;
        this.age = age;
        this.numberOfBags = numberOfBags;
    }

    public int getNumberOfBags(){
        return numberOfBags;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
