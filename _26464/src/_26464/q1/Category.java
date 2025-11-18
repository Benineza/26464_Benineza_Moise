package _26464.q1;

import java.time.LocalDate;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;
    
    public Category(int id, LocalDate createdDate, LocalDate updatedDate, 
                   String warehouseName, String location, String contactNumber,
                   String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);
        if (categoryCode == null || categoryCode.length() < 3 || !categoryCode.matches("[a-zA-Z0-9]+"))
            throw new IllegalArgumentException("Category code must be alphanumeric and at least 3 characters");
            
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }
    
    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
    
    public String getCategoryInfo() {
        return getWarehouseInfo() + ", Category: " + categoryName + ", Code: " + categoryCode;
    }
}