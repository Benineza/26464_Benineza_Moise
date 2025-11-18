package _26464.q4;

import java.time.LocalDate;

public class ProcurementReport extends Invoice {
    private LocalDate reportDate;
    private String summary;
    
    public ProcurementReport(int id, LocalDate createdDate, LocalDate updatedDate,
                            String orgName, String address, String contactEmail,
                            String deptName, String deptCode,
                            String supplierName, String supplierTIN, String contact,
                            String productName, double unitPrice, int quantity,
                            String poNumber, LocalDate orderDate, double totalAmount,
                            LocalDate deliveryDate, String deliveredBy,
                            String inspectionName, String status, String remarks,
                            String invoiceNo, double invoiceAmount,
                            LocalDate reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectionName, status, remarks, invoiceNo, invoiceAmount);
        
        this.reportDate = reportDate;
        this.summary = summary;
    }
    
    public void calculateTotal() {
        double total = getInvoiceAmount();
        
        System.out.println("=== PROCUREMENT REPORT ===");
        System.out.println("Student ID: 26464");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Organization: " + getOrgName());
        System.out.println("Department: " + getDeptName());
        System.out.println("Supplier: " + getSupplierName());
        System.out.println("Product: " + getProductName());
        System.out.println("Invoice Amount: $" + getInvoiceAmount());
        System.out.println("Total Purchase Amount: $" + total);
        System.out.println("Summary: " + summary);
        System.out.println("==========================");
    }
    
    public String getProcurementReportInfo() {
        return getInvoiceInfo() + ", Report Date: " + reportDate + ", Summary: " + summary;
    }
}