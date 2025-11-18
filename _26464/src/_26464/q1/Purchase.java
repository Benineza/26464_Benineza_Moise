package _26464.q1;

import java.time.LocalDate;

public class Purchase extends StockItem {
    private LocalDate purchaseDate;
    private int purchasedQuantity;
    private String purchaseSupplierName;
    
    public Purchase(int id, LocalDate createdDate, LocalDate updatedDate,
                   String warehouseName, String location, String contactNumber,
                   String categoryName, String categoryCode,
                   String supplierName, String supplierEmail, String supplierPhone,
                   String productName, double unitPrice, int stockLimit,
                   int quantityAvailable, int reorderLevel,
                   LocalDate purchaseDate, int purchasedQuantity, String purchaseSupplierName) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit, quantityAvailable, reorderLevel);
        
        if (purchaseDate == null) throw new IllegalArgumentException("Purchase date cannot be null");
        if (purchasedQuantity <= 0) throw new IllegalArgumentException("Purchased quantity must be greater than 0");
        
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.purchaseSupplierName = purchaseSupplierName;
    }
    
    public LocalDate getPurchaseDate() { return purchaseDate; }
    public int getPurchasedQuantity() { return purchasedQuantity; }
    public String getPurchaseSupplierName() { return purchaseSupplierName; }
    
    public String getPurchaseInfo() {
        return getStockItemInfo() + ", Purchase Date: " + purchaseDate + ", Purchased Qty: " + purchasedQuantity + ", Supplier: " + purchaseSupplierName;
    }
}