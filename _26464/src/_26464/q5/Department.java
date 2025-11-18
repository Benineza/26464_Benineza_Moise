package _26464.q5;

import java.time.LocalDate;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;
    
    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                     String institutionName, String code, String address,
                     String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);
        
        if (departmentName == null || departmentName.isEmpty() || departmentHead == null || departmentHead.isEmpty())
            throw new IllegalArgumentException("Department name and head cannot be empty");
            
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }
    
    public String getDepartmentName() { return departmentName; }
    public String getDepartmentHead() { return departmentHead; }
    
    public String getDepartmentInfo() {
        return getInstitutionInfo() + ", Department: " + departmentName + ", Head: " + departmentHead;
    }
}