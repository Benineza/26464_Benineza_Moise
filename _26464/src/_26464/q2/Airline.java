package _26464.q2;

import java.time.LocalDate;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;
    
    public Airline(int id, LocalDate createdDate, LocalDate updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        
        if (airlineCode == null || airlineCode.length() < 2 || airlineCode.length() > 4)
            throw new IllegalArgumentException("Airline code must be 2-4 letters");
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new IllegalArgumentException("Invalid email format");
            
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }
    
    public String getAirlineName() { return airlineName; }
    public String getAirlineCode() { return airlineCode; }
    public String getContactEmail() { return contactEmail; }
    
    public String getAirlineInfo() {
        return getAirportInfo() + ", Airline: " + airlineName + ", Code: " + airlineCode + ", Email: " + contactEmail;
    }
}