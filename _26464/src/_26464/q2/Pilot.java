package _26464.q2;

import java.time.LocalDate;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;
    
    public Pilot(int id, LocalDate createdDate, LocalDate updatedDate,
                String airportName, String code, String location,
                String airlineName, String airlineCode, String contactEmail,
                String flightNumber, String departure, String destination, double baseFare,
                String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, 
              contactEmail, flightNumber, departure, destination, baseFare);
        
        if (licenseNumber == null || licenseNumber.isEmpty())
            throw new IllegalArgumentException("License number cannot be empty");
        if (experienceYears < 2) throw new IllegalArgumentException("Experience must be at least 2 years");
        
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }
    
    public String getPilotName() { return pilotName; }
    public String getLicenseNumber() { return licenseNumber; }
    public int getExperienceYears() { return experienceYears; }
    
    public String getPilotInfo() {
        return getFlightInfo() + ", Pilot: " + pilotName + ", License: " + licenseNumber + 
               ", Experience: " + experienceYears + " years";
    }
}