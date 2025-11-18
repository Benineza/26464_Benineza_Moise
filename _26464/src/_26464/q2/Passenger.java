package _26464.q2;

import java.time.LocalDate;

public class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;
    
    public Passenger(int id, LocalDate createdDate, LocalDate updatedDate,
                    String airportName, String code, String location,
                    String airlineName, String airlineCode, String contactEmail,
                    String flightNumber, String departure, String destination, double baseFare,
                    String pilotName, String licenseNumber, int experienceYears,
                    String crewName, String role, String shift,
                    String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode,
              contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, 
              experienceYears, crewName, role, shift);
        
        if (age <= 0) throw new IllegalArgumentException("Age must be greater than 0");
        if (gender == null || (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female") && 
            !gender.equalsIgnoreCase("Other")))
            throw new IllegalArgumentException("Gender must be Male, Female, or Other");
        
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }
    
    public String getPassengerName() { return passengerName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContact() { return contact; }
    
    public String getPassengerInfo() {
        return getCabinCrewInfo() + ", Passenger: " + passengerName + ", Age: " + age + 
               ", Gender: " + gender + ", Contact: " + contact;
    }
}