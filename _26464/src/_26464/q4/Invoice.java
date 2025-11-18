package _26464.q4;

import java.time.LocalDate;

public class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount;
    
    public Invoice(int id, LocalDate createdDate, LocalDate updatedDate,
                  String orgName, String address, String contactEmail,
                  String deptName, String deptCode,
                  String supplierName, String supplierTIN, String contact,
                  String productName, double unitPrice, int quantity,
                  String poNumber, LocalDate orderDate, double totalAmount,
                  LocalDate deliveryDate, String deliveredBy,
                  String inspectionName, String status, String remarks,
                  String invoiceNo, double invoiceAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectionName, status, remarks);
        
        if (invoiceAmount <= 0) throw new IllegalArgumentException("Invoice amount must be greater than 0");
        
        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
    }
    
    public String getInvoiceNo() { return invoiceNo; }
    public double getInvoiceAmount() { return invoiceAmount; }
    
    public String getInvoiceInfo() {
        return getInspectionInfo() + ", Invoice No: " + invoiceNo + ", Invoice Amount: $" + invoiceAmount;
    }
}