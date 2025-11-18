package _26464.q6;

import java.time.LocalDate;

public class Allowance extends Deduction {
    private double overtimeHours;
    private double overtimeRate;
    private double bonus;
    
    public Allowance(int id, LocalDate createdDate, LocalDate updatedDate,
                    String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                    int month, int year, LocalDate startDate, LocalDate endDate,
                    double basicPay, double transportAllowance, double housingAllowance,
                    double loanDeduction,
                    double overtimeHours, double overtimeRate, double bonus) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, loanDeduction);
        
        if (overtimeHours < 0 || overtimeRate < 0 || bonus < 0)
            throw new IllegalArgumentException("Allowance components cannot be negative");
            
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
        this.bonus = bonus;
    }
    
    public double getOvertimeHours() { return overtimeHours; }
    public double getOvertimeRate() { return overtimeRate; }
    public double getBonus() { return bonus; }
    
    public String getAllowanceInfo() {
        return getDeductionInfo() + ", Overtime Hours: " + overtimeHours + 
               ", Overtime Rate: $" + overtimeRate + ", Bonus: $" + bonus;
    }
}