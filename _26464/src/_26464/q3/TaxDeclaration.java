package _26464.q3;

import java.time.LocalDate;

public class TaxDeclaration extends Employee {
    private String declarationMonth;
    private double totalIncome;
    
    public TaxDeclaration(int id, LocalDate createdDate, LocalDate updatedDate,
                         String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTIN, String contact,
                         String employeeName, double salary, String employeeEmployerTIN,
                         String declarationMonth, double totalIncome) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeEmployerTIN);
        
        if (totalIncome < 0) throw new TaxDataException("Total income cannot be negative");
        
        this.declarationMonth = declarationMonth;
        this.totalIncome = totalIncome;
    }
    
    public String getDeclarationMonth() { return declarationMonth; }
    public double getTotalIncome() { return totalIncome; }
    
    public String getTaxDeclarationInfo() {
        return getEmployeeInfo() + ", Declaration Month: " + declarationMonth + ", Total Income: $" + totalIncome;
    }
}