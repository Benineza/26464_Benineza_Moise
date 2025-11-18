package _26464.q1;

import java.time.LocalDate;

public class Sale extends Purchase {
    private LocalDate saleDate;
    private int soldQuantity;
    private String customerName;
    
    public Sale(int id, LocalDate createdDate, LocalDate updatedDate,
               String warehouseName, String location, String contactNumber,
               String categoryName, String categoryCode,
               String supplierName, String supplierEmail, String supplierPhone,
               String productName, double unitPrice, int stockLimit,
               int quantityAvailable, int reorderLevel,
               LocalDate purchaseDate, int purchasedQuantity, String purchaseSupplierName,
               LocalDate saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, purchaseSupplierName);
        
        if (saleDate == null) throw new IllegalArgumentException("Sale date cannot be null");
        if (soldQuantity <= 0) throw new IllegalArgumentException("Sold quantity must be greater than 0");
        
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }
    
    public LocalDate getSaleDate() { return saleDate; }
    public int getSoldQuantity() { return soldQuantity; }
    public String getCustomerName() { return customerName; }
    
    public String getSaleInfo() {
        return getPurchaseInfo() + ", Sale Date: " + saleDate + ", Sold Qty: " + soldQuantity + ", Customer: " + customerName;
    }
}