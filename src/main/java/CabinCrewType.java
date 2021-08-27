public enum CabinCrewType {
        CAPTAIN("Sergio", "Captain"),
        COPILOT("Simon", "Co Pilot"),
        FIRSTOFFICER("Jakub", "First Officer"),
        FLIGHTATTENDANT("Sky", "Flight Attendant"),
        PURSER("Sara", "Purser");

        private final String name;
        private final String rank;

        CabinCrewType(String name, String rank ){
            this.name = name;
            this.rank = rank;
        }

        public String getName(){
            return this.name;
        }

        public String getRank(){
            return this.rank;
        }





}
