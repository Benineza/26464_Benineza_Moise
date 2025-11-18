package _26464.q5;

import java.time.LocalDate;

public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age;
    
    public Student(int id, LocalDate createdDate, LocalDate updatedDate,
                  String institutionName, String code, String address,
                  String departmentName, String departmentHead,
                  String courseName, String courseCode, int credits,
                  String instructorName, String email, String phone,
                  String studentName, String studentID, int age) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone);
        
        if (age <= 0) throw new IllegalArgumentException("Age must be greater than 0");
        
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }
    
    public String getStudentName() { return studentName; }
    public String getStudentID() { return studentID; }
    public int getAge() { return age; }
    
    public String getStudentInfo() {
        return getInstructorInfo() + ", Student: " + studentName + ", ID: " + studentID + ", Age: " + age;
    }
}