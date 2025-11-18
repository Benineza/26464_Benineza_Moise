package _26464.q1;

import java.time.LocalDate;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int stockLimit;
    
    public Product(int id, LocalDate createdDate, LocalDate updatedDate,
                  String warehouseName, String location, String contactNumber,
                  String categoryName, String categoryCode,
                  String supplierName, String supplierEmail, String supplierPhone,
                  String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber, 
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone);
        
        if (unitPrice <= 0) throw new IllegalArgumentException("Unit price must be greater than 0");
        if (stockLimit < 0) throw new IllegalArgumentException("Stock limit cannot be negative");
        
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }
    
    public String getProductName() { return productName; }
    public double getUnitPrice() { return unitPrice; }
    public int getStockLimit() { return stockLimit; }
    
    public String getProductInfo() {
        return getSupplierInfo() + ", Product: " + productName + ", Unit Price: $" + unitPrice + ", Stock Limit: " + stockLimit;
    }
}