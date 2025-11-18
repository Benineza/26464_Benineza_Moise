package _26464.q2;

import java.time.LocalDate;

public class Payment extends Booking {
    private LocalDate paymentDate;
    private String paymentMethod;
    private double amountPaid;
    
    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                  String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  LocalDate bookingDate, String seatNumber, String travelClass,
                  LocalDate paymentDate, String paymentMethod, double amountPaid) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode,
              contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber,
              experienceYears, crewName, role, shift, passengerName, age, gender, contact,
              bookingDate, seatNumber, travelClass);
        
        if (amountPaid <= 0) throw new IllegalArgumentException("Amount paid must be greater than 0");
        if (paymentMethod == null || paymentMethod.isEmpty()) 
            throw new IllegalArgumentException("Payment method cannot be empty");
        
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }
    
    public LocalDate getPaymentDate() { return paymentDate; }
    public String getPaymentMethod() { return paymentMethod; }
    public double getAmountPaid() { return amountPaid; }
    
    public String getPaymentInfo() {
        return getBookingInfo() + ", Payment Date: " + paymentDate + ", Method: " + paymentMethod + 
               ", Amount: $" + amountPaid;
    }
}