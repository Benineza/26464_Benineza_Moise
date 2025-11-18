package _26464.q2;

import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== FLIGHT BOOKING SYSTEM ===");
        System.out.println("Student ID: 26464");
        
        try {
            System.out.println("\nEnter Flight Booking Details:");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Airport Name: ");
            String airportName = scanner.nextLine();
            
            System.out.print("Enter Airport Code (3 uppercase letters): ");
            String airportCode = scanner.nextLine();
            
            System.out.print("Enter Airport Location: ");
            String airportLocation = scanner.nextLine();
            
            System.out.print("Enter Airline Name: ");
            String airlineName = scanner.nextLine();
            
            System.out.print("Enter Airline Code (2-4 letters): ");
            String airlineCode = scanner.nextLine();
            
            System.out.print("Enter Airline Contact Email: ");
            String airlineEmail = scanner.nextLine();
            
            System.out.print("Enter Flight Number: ");
            String flightNumber = scanner.nextLine();
            
            System.out.print("Enter Departure City: ");
            String departure = scanner.nextLine();
            
            System.out.print("Enter Destination City: ");
            String destination = scanner.nextLine();
            
            System.out.print("Enter Base Fare: ");
            double baseFare = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Pilot Name: ");
            String pilotName = scanner.nextLine();
            
            System.out.print("Enter License Number: ");
            String licenseNumber = scanner.nextLine();
            
            System.out.print("Enter Experience Years: ");
            int experienceYears = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Crew Name: ");
            String crewName = scanner.nextLine();
            
            System.out.print("Enter Crew Role: ");
            String crewRole = scanner.nextLine();
            
            System.out.print("Enter Shift (Day/Night): ");
            String shift = scanner.nextLine();
            
            System.out.print("Enter Passenger Name: ");
            String passengerName = scanner.nextLine();
            
            System.out.print("Enter Passenger Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Passenger Gender (Male/Female/Other): ");
            String gender = scanner.nextLine();
            
            System.out.print("Enter Passenger Contact: ");
            String contact = scanner.nextLine();
            
            System.out.print("Enter Booking Date (YYYY-MM-DD): ");
            String bookingDateStr = scanner.nextLine();
            LocalDate bookingDate = LocalDate.parse(bookingDateStr);
            
            System.out.print("Enter Seat Number: ");
            String seatNumber = scanner.nextLine();
            
            System.out.print("Enter Travel Class (Economy/Business/First): ");
            String travelClass = scanner.nextLine();
            
            System.out.print("Enter Payment Date (YYYY-MM-DD): ");
            String paymentDateStr = scanner.nextLine();
            LocalDate paymentDate = LocalDate.parse(paymentDateStr);
            
            System.out.print("Enter Payment Method: ");
            String paymentMethod = scanner.nextLine();
            
            System.out.print("Enter Amount Paid: ");
            double amountPaid = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Ticket Number: ");
            String ticketNumber = scanner.nextLine();
            
            Ticket ticket = new Ticket(
                id, 
                LocalDate.now(), 
                LocalDate.now(),
                airportName, 
                airportCode, 
                airportLocation,
                airlineName, 
                airlineCode, 
                airlineEmail,
                flightNumber, 
                departure, 
                destination, 
                baseFare,
                pilotName, 
                licenseNumber, 
                experienceYears,
                crewName, 
                crewRole, 
                shift,
                passengerName, 
                age, 
                gender, 
                contact,
                bookingDate, 
                seatNumber, 
                travelClass,
                paymentDate, 
                paymentMethod, 
                amountPaid,
                ticketNumber, 
                LocalDate.now()
            );
            
            System.out.println("\n--- ALL INSERTED DATA ---");
            System.out.println(ticket.getTicketInfo());
            
            System.out.println("\n--- FARE CALCULATION ---");
            ticket.calculateFare();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}