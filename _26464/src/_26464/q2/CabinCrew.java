package _26464.q2;

import java.time.LocalDate;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift;
    
    public CabinCrew(int id, LocalDate createdDate, LocalDate updatedDate,
                    String airportName, String code, String location,
                    String airlineName, String airlineCode, String contactEmail,
                    String flightNumber, String departure, String destination, double baseFare,
                    String pilotName, String licenseNumber, int experienceYears,
                    String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode,
              contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
        
        if (role == null || role.isEmpty()) throw new IllegalArgumentException("Role cannot be empty");
        if (!shift.equals("Day") && !shift.equals("Night")) 
            throw new IllegalArgumentException("Shift must be 'Day' or 'Night'");
        
        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }
    
    public String getCrewName() { return crewName; }
    public String getRole() { return role; }
    public String getShift() { return shift; }
    
    public String getCabinCrewInfo() {
        return getPilotInfo() + ", Crew: " + crewName + ", Role: " + role + ", Shift: " + shift;
    }
}