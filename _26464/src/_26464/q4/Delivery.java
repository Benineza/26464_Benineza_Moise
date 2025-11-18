package _26464.q4;

import java.time.LocalDate;

public class Delivery extends PurchaseOrder {
    private LocalDate deliveryDate;
    private String deliveredBy;
    
    public Delivery(int id, LocalDate createdDate, LocalDate updatedDate,
                   String orgName, String address, String contactEmail,
                   String deptName, String deptCode,
                   String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, LocalDate orderDate, double totalAmount,
                   LocalDate deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact, productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        
        if (deliveryDate == null) throw new IllegalArgumentException("Delivery date cannot be null");
        if (deliveredBy == null || deliveredBy.isEmpty()) throw new IllegalArgumentException("Delivered by cannot be empty");
        
        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
    }
    
    public LocalDate getDeliveryDate() { return deliveryDate; }
    public String getDeliveredBy() { return deliveredBy; }
    
    public String getDeliveryInfo() {
        return getPurchaseOrderInfo() + ", Delivery Date: " + deliveryDate + ", Delivered By: " + deliveredBy;
    }
}