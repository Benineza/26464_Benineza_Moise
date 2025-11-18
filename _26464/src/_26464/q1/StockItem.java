package _26464.q1;

import java.time.LocalDate;

public class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;
    
    public StockItem(int id, LocalDate createdDate, LocalDate updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone,
                    String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
              categoryName, categoryCode, supplierName, supplierEmail, supplierPhone,
              productName, unitPrice, stockLimit);
        
        if (quantityAvailable < 0 || reorderLevel < 0)
            throw new IllegalArgumentException("Quantity and reorder level cannot be negative");
        
        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }
    
    public int getQuantityAvailable() { return quantityAvailable; }
    public int getReorderLevel() { return reorderLevel; }
    
    public String getStockItemInfo() {
        return getProductInfo() + ", Available Qty: " + quantityAvailable + ", Reorder Level: " + reorderLevel;
    }
}