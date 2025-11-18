package _26464.q3;

import java.time.LocalDate;

public class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;
    
    public TaxRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeEmployerTIN,
                    String declarationMonth, double totalIncome,
                    LocalDate assessmentDate, double assessedTax,
                    LocalDate paymentDate, double paymentAmount,
                    String receiptNo, double totalTax) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeEmployerTIN, declarationMonth, totalIncome, assessmentDate, assessedTax, paymentDate, paymentAmount);
        
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }
    
    public void computeTax() {
        double salary = getSalary();
        double rate = getRate();
        double credits = 1000; // Example tax credits
        double calculatedTax = (salary * rate) - credits;
        
        if (calculatedTax < 0) calculatedTax = 0;
        
        System.out.println("=== TAX CALCULATION ===");
        System.out.println("Student ID: 26464");
        System.out.println("Receipt No: " + receiptNo);
        System.out.println("Salary: $" + salary);
        System.out.println("Tax Rate: " + (rate * 100) + "%");
        System.out.println("Tax Credits: $" + credits);
        System.out.println("Calculated Tax: $" + calculatedTax);
        System.out.println("Total Tax: $" + totalTax);
        System.out.println("=======================");
    }
    
    public String getTaxRecordInfo() {
        return getPaymentInfo() + ", Receipt No: " + receiptNo + ", Total Tax: $" + totalTax;
    }
}