package _26464.q1;

import java.time.LocalDate;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;
    
    public Warehouse(int id, LocalDate createdDate, LocalDate updatedDate, 
                    String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) 
            throw new IllegalArgumentException("Phone must be 10 digits");
            
        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }
    
    public String getWarehouseName() { return warehouseName; }
    public String getLocation() { return location; }
    public String getContactNumber() { return contactNumber; }
    
    public String getWarehouseInfo() {
        return getEntityInfo() + ", Warehouse: " + warehouseName + ", Location: " + location + ", Contact: " + contactNumber;
    }
}