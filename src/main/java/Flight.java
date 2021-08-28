import java.util.ArrayList;

public class Flight extends Pilot{

    private Pilot pilot;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureTime;
    private String departureAirport;
    private ArrayList<Passenger>passengers;

    public Flight(Plane plane, String flightNumber, String destination, String departureTime, String departureAirport, Pilot pilot){
        super ("Sergio", "Captain", "CCE50");
        this.plane = plane;
        this.pilot = pilot;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.departureAirport = departureAirport;
        this.passengers = new ArrayList<>();

    }

    public Pilot getPilot(){
        return pilot;
    }

    public Plane getPlane(){
        return plane;
    }
    public String getFlightNumber(){
        return flightNumber;
    }

    public String getDestination(){
        return destination;
    }

    public String getDepartureTime(){
        return departureTime;
    }

    public String getDepartureAirport(){
        return departureAirport;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getNumberOfPassengers(){
        return passengers.size();
    }

    public void addPassenger(Passenger passenger){
        if(plane.getCapacity() <250 ){
            passengers.add(passenger);
    }
    }

}