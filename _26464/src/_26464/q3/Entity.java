package _26464.q3;

import java.time.LocalDate;

public class Entity {
    private int id;
    private LocalDate createdDate;
    private LocalDate updatedDate;
    
    public Entity(int id, LocalDate createdDate, LocalDate updatedDate) throws TaxDataException {
        if (id <= 0) throw new TaxDataException("ID must be greater than 0");
        
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }
    
    public int getId() { return id; }
    public LocalDate getCreatedDate() { return createdDate; }
    public LocalDate getUpdatedDate() { return updatedDate; }
    
    public String getEntityInfo() {
        return "ID: " + id + ", Created: " + createdDate + ", Updated: " + updatedDate;
    }
}