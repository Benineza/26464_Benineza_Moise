package _26464.q6;

import java.time.LocalDate;

public class Employee extends Department {
    private String employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rssbRegistered;
    
    public Employee(int id, LocalDate createdDate, LocalDate updatedDate,
                   String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        
        if (employeeID == null || Integer.parseInt(employeeID) < 1000)
            throw new IllegalArgumentException("Employee ID must be at least 1000");
        if (baseSalary <= 0) throw new IllegalArgumentException("Base salary must be greater than 0");
            
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rssbRegistered = rssbRegistered;
    }
    
    public String getEmployeeID() { return employeeID; }
    public String getFullName() { return fullName; }
    public String getPosition() { return position; }
    public double getBaseSalary() { return baseSalary; }
    public boolean isRssbRegistered() { return rssbRegistered; }
    
    public String getEmployeeInfo() {
        return getDepartmentInfo() + ", Employee: " + fullName + ", ID: " + employeeID + 
               ", Position: " + position + ", Base Salary: $" + baseSalary + ", RSSB Registered: " + rssbRegistered;
    }
}