package _26464.q1;

import java.time.LocalDate;

public class StockReport extends Inventory {
    private LocalDate reportDate;
    private String remarks;
    
    public StockReport(int id, LocalDate createdDate, LocalDate updatedDate,
                      String warehouseName, String location, String contactNumber,
                      String categoryName, String categoryCode,
                      String supplierName, String supplierEmail, String supplierPhone,
                      String productName, double unitPrice, int stockLimit,
                      int quantityAvailable, int reorderLevel,
                      LocalDate purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                      LocalDate saleDate, int soldQuantity, String customerName,
                      int totalItems, double stockValue,
                      LocalDate reportDate, String remarks) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel,
              purchaseDate, purchasedQuantity, purchaseSupplierName, saleDate, soldQuantity, customerName,
              totalItems, stockValue);
        
        this.reportDate = reportDate;
        this.remarks = remarks;
    }
    
    public void generateReport() {
        System.out.println("=== STOCK MANAGEMENT REPORT ===");
        System.out.println("Student ID: 26464");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Warehouse: " + getWarehouseName());
        System.out.println("Product: " + getProductName());
        System.out.println("Available Quantity: " + getQuantityAvailable());
        System.out.println("Total Stock Value: $" + getStockValue());
        System.out.println("Total Items: " + getTotalItems());
        System.out.println("Sold Quantity: " + getSoldQuantity());
        System.out.println("Remarks: " + remarks);
        System.out.println("===============================");
    }
    
    public String getStockReportInfo() {
        return getInventoryInfo() + ", Report Date: " + reportDate + ", Remarks: " + remarks;
    }
}