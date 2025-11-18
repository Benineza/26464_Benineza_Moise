package _26464.q2;

import java.time.LocalDate;

public class Booking extends Passenger {
    private LocalDate bookingDate;
    private String seatNumber;
    private String travelClass;
    
    public Booking(int id, LocalDate createdDate, LocalDate updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  LocalDate bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode,
              contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber,
              experienceYears, crewName, role, shift, passengerName, age, gender, contact);
        
        if (!travelClass.equals("Economy") && !travelClass.equals("Business") && !travelClass.equals("First"))
            throw new IllegalArgumentException("Travel class must be Economy, Business, or First");
        
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }
    
    public LocalDate getBookingDate() { return bookingDate; }
    public String getSeatNumber() { return seatNumber; }
    public String getTravelClass() { return travelClass; }
    
    public String getBookingInfo() {
        return getPassengerInfo() + ", Booking Date: " + bookingDate + ", Seat: " + seatNumber + 
               ", Class: " + travelClass;
    }
}