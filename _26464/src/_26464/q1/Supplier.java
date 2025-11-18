package _26464.q1;

import java.time.LocalDate;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;
    
    public Supplier(int id, LocalDate createdDate, LocalDate updatedDate,
                   String warehouseName, String location, String contactNumber,
                   String categoryName, String categoryCode,
                   String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, categoryName, categoryCode);
        
        if (supplierEmail == null || !supplierEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new IllegalArgumentException("Invalid email format");
        if (supplierPhone == null || !supplierPhone.matches("\\d{10}"))
            throw new IllegalArgumentException("Supplier phone must be 10 digits");
            
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }
    
    public String getSupplierName() { return supplierName; }
    public String getSupplierEmail() { return supplierEmail; }
    public String getSupplierPhone() { return supplierPhone; }
    
    public String getSupplierInfo() {
        return getCategoryInfo() + ", Supplier: " + supplierName + ", Email: " + supplierEmail + ", Phone: " + supplierPhone;
    }
}