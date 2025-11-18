package _26464.q3;

import java.time.LocalDate;

public class Payment extends TaxAssessment {
    private LocalDate paymentDate;
    private double paymentAmount;
    
    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                  String authorityName, String region, String email,
                  String categoryName, double rate, String code,
                  String tin, String taxpayerName, String address,
                  String employerName, String employerTIN, String contact,
                  String employeeName, double salary, String employeeEmployerTIN,
                  String declarationMonth, double totalIncome,
                  LocalDate assessmentDate, double assessedTax,
                  LocalDate paymentDate, double paymentAmount) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact, employeeName, salary, employeeEmployerTIN, declarationMonth, totalIncome, assessmentDate, assessedTax);
        
        if (paymentAmount <= 0) throw new TaxDataException("Payment amount must be greater than 0");
        
        this.paymentDate = paymentDate;
        this.paymentAmount = paymentAmount;
    }
    
    public LocalDate getPaymentDate() { return paymentDate; }
    public double getPaymentAmount() { return paymentAmount; }
    
    public String getPaymentInfo() {
        return getTaxAssessmentInfo() + ", Payment Date: " + paymentDate + ", Payment Amount: $" + paymentAmount;
    }
}