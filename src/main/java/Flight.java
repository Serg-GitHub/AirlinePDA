public class Flight extends Pilot{

    private Pilot pilot;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureTime;
    private String departureAirport;

    public Flight(Plane plane, String flightNumber, String destination, String departureTime, String departureAirport){
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.departureAirport = departureAirport;

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
}