package _26464.q6;

import java.time.LocalDate;

public class Deduction extends SalaryStructure {
    private double loanDeduction;
    
    public Deduction(int id, LocalDate createdDate, LocalDate updatedDate,
                    String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                    int month, int year, LocalDate startDate, LocalDate endDate,
                    double basicPay, double transportAllowance, double housingAllowance,
                    double loanDeduction) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance);
        
        if (loanDeduction < 0) throw new IllegalArgumentException("Loan deduction cannot be negative");
            
        this.loanDeduction = loanDeduction;
    }
    
    public double getLoanDeduction() { return loanDeduction; }
    
    public String getDeductionInfo() {
        return getSalaryStructureInfo() + ", Loan Deduction: $" + loanDeduction;
    }
}