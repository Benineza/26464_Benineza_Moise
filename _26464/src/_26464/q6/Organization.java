package _26464.q6;

import java.time.LocalDate;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;
    
    public Organization(int id, LocalDate createdDate, LocalDate updatedDate,
                       String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}"))
            throw new IllegalArgumentException("RSSB number must be 8 digits");
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new IllegalArgumentException("Invalid email format");
        if (orgCode == null || orgCode.length() < 3)
            throw new IllegalArgumentException("Organization code must be at least 3 characters");
            
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }
    
    public String getOrgName() { return orgName; }
    public String getOrgCode() { return orgCode; }
    public String getRssbNumber() { return rssbNumber; }
    public String getContactEmail() { return contactEmail; }
    
    public String getOrganizationInfo() {
        return getEntityInfo() + ", Organization: " + orgName + ", Code: " + orgCode + 
               ", RSSB: " + rssbNumber + ", Email: " + contactEmail;
    }
}