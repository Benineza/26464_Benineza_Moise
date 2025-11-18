package _26464.q5;

import java.time.LocalDate;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;
    
    public Institution(int id, LocalDate createdDate, LocalDate updatedDate,
                      String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        if (code == null || code.length() < 3)
            throw new IllegalArgumentException("Code must be at least 3 characters");
            
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }
    
    public String getInstitutionName() { return institutionName; }
    public String getCode() { return code; }
    public String getAddress() { return address; }
    
    public String getInstitutionInfo() {
        return getEntityInfo() + ", Institution: " + institutionName + ", Code: " + code + ", Address: " + address;
    }
}