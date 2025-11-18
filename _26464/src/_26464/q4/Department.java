package _26464.q4;

import java.time.LocalDate;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    
    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                     String orgName, String address, String contactEmail,
                     String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        
        if (deptCode == null || deptCode.length() < 3 || !deptCode.matches("[a-zA-Z0-9]+"))
            throw new IllegalArgumentException("Department code must be alphanumeric and at least 3 characters");
            
        this.deptName = deptName;
        this.deptCode = deptCode;
    }
    
    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
    
    public String getDepartmentInfo() {
        return getOrganizationInfo() + ", Department: " + deptName + ", Code: " + deptCode;
    }
}