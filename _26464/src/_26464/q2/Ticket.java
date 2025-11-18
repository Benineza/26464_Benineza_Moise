package _26464.q2;

import java.time.LocalDate;

public class Ticket extends Payment {
    private String ticketNumber;
    private LocalDate issueDate;
    
    public Ticket(int id, LocalDate createdDate, LocalDate updatedDate,
                 String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears,
                 String crewName, String role, String shift,
                 String passengerName, int age, String gender, String contact,
                 LocalDate bookingDate, String seatNumber, String travelClass,
                 LocalDate paymentDate, String paymentMethod, double amountPaid,
                 String ticketNumber, LocalDate issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode,
              contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber,
              experienceYears, crewName, role, shift, passengerName, age, gender, contact,
              bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid);
        
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }
    
    public void calculateFare() {
        double baseFare = getBaseFare();
        double taxes = baseFare * 0.15;
        double discounts = baseFare * 0.05;
        double finalFare = baseFare + taxes - discounts;
        
        System.out.println("=== FLIGHT TICKET FARE CALCULATION ===");
        System.out.println("Student ID: 26464");
        System.out.println("Ticket Number: " + ticketNumber);
        System.out.println("Base Fare: $" + baseFare);
        System.out.println("Taxes (15%): $" + taxes);
        System.out.println("Discounts (5%): $" + discounts);
        System.out.println("Final Fare: $" + finalFare);
        System.out.println("Travel Class: " + getTravelClass());
        System.out.println("===============================");
    }
    
    public String getTicketInfo() {
        return getPaymentInfo() + ", Ticket: " + ticketNumber + ", Issue Date: " + issueDate;
    }
}