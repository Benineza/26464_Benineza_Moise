package _26464.q5;

import java.time.LocalDate;

public class Course extends Department {
    private String courseName;
    private String courseCode;
    private int credits;
    
    public Course(int id, LocalDate createdDate, LocalDate updatedDate,
                 String institutionName, String code, String address,
                 String departmentName, String departmentHead,
                 String courseName, String courseCode, int credits) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead);
        
        if (credits <= 0) throw new IllegalArgumentException("Credits must be greater than 0");
        
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }
    
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }
    public int getCredits() { return credits; }
    
    public String getCourseInfo() {
        return getDepartmentInfo() + ", Course: " + courseName + ", Code: " + courseCode + ", Credits: " + credits;
    }
}