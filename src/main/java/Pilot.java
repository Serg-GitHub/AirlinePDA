import java.util.concurrent.atomic.AtomicReference;

public class Pilot {
    private final String name;
    private final String rank;
    private final String pilotLicenseNumber;


    public Pilot(String name, String rank, String pilotLicenseNumber) {
        this.name = name;
        this.rank = rank;
        this.pilotLicenseNumber = pilotLicenseNumber;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getPilotLicenseNumber() {
        return pilotLicenseNumber;
    }

    public String pilotCanFlyPlane(Flight flight){
        Plane plane = flight.getPlane();
        AtomicReference<String> output = new AtomicReference<>(String.format("Good morning everyone! Wishing you all a very pleasant flight from %s to %s today", flight.getDepartureAirport(), flight.getDestination()));
        return output.get();
    }

}
