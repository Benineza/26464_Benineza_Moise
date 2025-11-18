package _26464.q3;

import java.time.LocalDate;

public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeEmployerTIN;
    
    public Employee(int id, LocalDate createdDate, LocalDate updatedDate,
                   String authorityName, String region, String email,
                   String categoryName, double rate, String code,
                   String tin, String taxpayerName, String address,
                   String employerName, String employerTIN, String contact,
                   String employeeName, double salary, String employeeEmployerTIN) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact);
        
        if (salary <= 0) throw new TaxDataException("Salary must be greater than 0");
        if (employeeEmployerTIN == null || !employeeEmployerTIN.matches("\\d{9}")) 
            throw new TaxDataException("Employee employer TIN must be 9 digits");
        
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeEmployerTIN = employeeEmployerTIN;
    }
    
    public String getEmployeeName() { return employeeName; }
    public double getSalary() { return salary; }
    public String getEmployeeEmployerTIN() { return employeeEmployerTIN; }
    
    public String getEmployeeInfo() {
        return getEmployerInfo() + ", Employee: " + employeeName + ", Salary: $" + salary + ", Employee Employer TIN: " + employeeEmployerTIN;
    }
}