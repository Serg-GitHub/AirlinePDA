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
}
