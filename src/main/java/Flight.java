public class Flight {

    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureTime){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
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
}