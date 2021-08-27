import java.util.ArrayList;

public class Flight extends Pilot {

    private String flightNum;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private ArrayList<String>passengers;
    private ArrayList<Integer>cabinCrewMembers;



    public Flight(String name, String rank, String pilotLicenseNum, String flightNum, String destination, String departureAirport, String departureTime) {
        super(name, rank, pilotLicenseNum);
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>(5);



    }
}









