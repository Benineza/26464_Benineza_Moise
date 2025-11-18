package _26464.q4;

import java.time.LocalDate;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;
    private String contact;
    
    public Supplier(int id, LocalDate createdDate, LocalDate updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);
        
        if (supplierTIN == null || !supplierTIN.matches("\\d{9}"))
            throw new IllegalArgumentException("Supplier TIN must be 9 digits");
        if (contact == null || !contact.matches("\\d{10}"))
            throw new IllegalArgumentException("Contact must be 10 digits");
            
        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }
    
    public String getSupplierName() { return supplierName; }
    public String getSupplierTIN() { return supplierTIN; }
    public String getContact() { return contact; }
    
    public String getSupplierInfo() {
        return getDepartmentInfo() + ", Supplier: " + supplierName + ", TIN: " + supplierTIN + ", Contact: " + contact;
    }
}