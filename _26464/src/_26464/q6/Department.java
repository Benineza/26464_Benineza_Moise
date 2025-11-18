package _26464.q6;

import java.time.LocalDate;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;
    
    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                     String orgName, String orgCode, String rssbNumber, String contactEmail,
                     String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        
        if (deptCode == null || deptCode.length() < 3)
            throw new IllegalArgumentException("Department code must be at least 3 characters");
        if (deptName == null || deptName.isEmpty() || managerName == null || managerName.isEmpty())
            throw new IllegalArgumentException("Department name and manager name cannot be empty");
            
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }
    
    public String getDeptName() { return deptName; }
    public String getDeptCode() { return deptCode; }
    public String getManagerName() { return managerName; }
    
    public String getDepartmentInfo() {
        return getOrganizationInfo() + ", Department: " + deptName + ", Code: " + deptCode + ", Manager: " + managerName;
    }
}