package _26464.q4;

import java.time.LocalDate;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;
    
    public Organization(int id, LocalDate createdDate, LocalDate updatedDate,
                       String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new IllegalArgumentException("Invalid email format");
            
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }
    
    public String getOrgName() { return orgName; }
    public String getAddress() { return address; }
    public String getContactEmail() { return contactEmail; }
    
    public String getOrganizationInfo() {
        return getEntityInfo() + ", Organization: " + orgName + ", Address: " + address + ", Email: " + contactEmail;
    }
}