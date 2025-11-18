package _26464.q5;

import java.time.LocalDate;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;
    
    public Instructor(int id, LocalDate createdDate, LocalDate updatedDate,
                     String institutionName, String code, String address,
                     String departmentName, String departmentHead,
                     String courseName, String courseCode, int credits,
                     String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits);
        
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new IllegalArgumentException("Invalid email format");
        if (phone == null || !phone.matches("\\d{10}"))
            throw new IllegalArgumentException("Phone must be 10 digits");
            
        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }
    
    public String getInstructorName() { return instructorName; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    
    public String getInstructorInfo() {
        return getCourseInfo() + ", Instructor: " + instructorName + ", Email: " + email + ", Phone: " + phone;
    }
}