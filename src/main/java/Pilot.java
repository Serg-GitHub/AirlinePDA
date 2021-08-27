import sun.util.locale.provider.SPILocaleProviderAdapter;

public class Pilot {
    private final String name;
    private final String rank;
    private final String pilotLicenseNum;


    public Pilot(String name, String rank, String pilotLicenseNum) {
        this.name = name;
        this.rank = rank;
        this.pilotLicenseNum = pilotLicenseNum;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String getPilotLicenseNum() {
        return pilotLicenseNum;
    }
}
