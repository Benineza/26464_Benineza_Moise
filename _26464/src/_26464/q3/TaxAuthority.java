package _26464.q3;

import java.time.LocalDate;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;
    
    public TaxAuthority(int id, LocalDate createdDate, LocalDate updatedDate,
                       String authorityName, String region, String email) throws TaxDataException {
        super(id, createdDate, updatedDate);
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$"))
            throw new TaxDataException("Invalid email format");
            
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }
    
    public String getAuthorityName() { return authorityName; }
    public String getRegion() { return region; }
    public String getEmail() { return email; }
    
    public String getTaxAuthorityInfo() {
        return getEntityInfo() + ", Authority: " + authorityName + ", Region: " + region + ", Email: " + email;
    }
}