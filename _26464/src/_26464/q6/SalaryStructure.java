package _26464.q6;

import java.time.LocalDate;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;
    
    public SalaryStructure(int id, LocalDate createdDate, LocalDate updatedDate,
                          String orgName, String orgCode, String rssbNumber, String contactEmail,
                          String deptName, String deptCode, String managerName,
                          String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                          int month, int year, LocalDate startDate, LocalDate endDate,
                          double basicPay, double transportAllowance, double housingAllowance) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate);
        
        if (basicPay < 0 || transportAllowance < 0 || housingAllowance < 0)
            throw new IllegalArgumentException("Salary components cannot be negative");
            
        this.basicPay = basicPay;
        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
    }
    
    public double getBasicPay() { return basicPay; }
    public double getTransportAllowance() { return transportAllowance; }
    public double getHousingAllowance() { return housingAllowance; }
    
    public String getSalaryStructureInfo() {
        return getPayrollPeriodInfo() + ", Basic Pay: $" + basicPay + 
               ", Transport: $" + transportAllowance + ", Housing: $" + housingAllowance;
    }
}