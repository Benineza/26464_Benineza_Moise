package _26464.q2;

import java.time.LocalDate;

public class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;
    
    public Flight(int id, LocalDate createdDate, LocalDate updatedDate,
                 String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail);
        
        if (flightNumber == null || flightNumber.isEmpty() || departure == null || departure.isEmpty() || 
            destination == null || destination.isEmpty())
            throw new IllegalArgumentException("Flight number, departure, and destination cannot be empty");
        if (baseFare <= 0) throw new IllegalArgumentException("Base fare must be greater than 0");
        
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.baseFare = baseFare;
    }
    
    public String getFlightNumber() { return flightNumber; }
    public String getDeparture() { return departure; }
    public String getDestination() { return destination; }
    public double getBaseFare() { return baseFare; }
    
    public String getFlightInfo() {
        return getAirlineInfo() + ", Flight: " + flightNumber + ", Departure: " + departure + 
               ", Destination: " + destination + ", Base Fare: $" + baseFare;
    }
}