package _26464.q6;

import java.time.LocalDate;

public class Payroll extends Allowance {
    private double grossSalary;
    private double totalDeductions;
    private double netSalary;
    
    public Payroll(int id, LocalDate createdDate, LocalDate updatedDate,
                  String orgName, String orgCode, String rssbNumber, String contactEmail,
                  String deptName, String deptCode, String managerName,
                  String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                  int month, int year, LocalDate startDate, LocalDate endDate,
                  double basicPay, double transportAllowance, double housingAllowance,
                  double loanDeduction,
                  double overtimeHours, double overtimeRate, double bonus) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, loanDeduction, overtimeHours, overtimeRate, bonus);
        
        // Calculate everything automatically
        this.grossSalary = calculateGrossSalary();
        this.totalDeductions = calculateTotalDeductions();
        this.netSalary = this.grossSalary - this.totalDeductions;
    }
    
    private double calculateGrossSalary() {
        return getBasicPay() + getTransportAllowance() + getHousingAllowance() + 
               (getOvertimeHours() * getOvertimeRate()) + getBonus();
    }
    
    private double calculateTotalDeductions() {
        double rssbContribution = getBasicPay() * 0.05; // 5% of basic pay
        double payeTax = calculatePAYE(grossSalary);
        return rssbContribution + payeTax + getLoanDeduction();
    }
    
    private double calculatePAYE(double grossSalary) {
        if (grossSalary <= 30000) return 0;
        else if (grossSalary <= 100000) return (grossSalary - 30000) * 0.20;
        else return (70000 * 0.20) + ((grossSalary - 100000) * 0.30);
    }
    
    public double getGrossSalary() { return grossSalary; }
    public double getTotalDeductions() { return totalDeductions; }
    public double getNetSalary() { return netSalary; }
    public double getRssbContribution() { return getBasicPay() * 0.05; }
    public double getPayeTax() { return calculatePAYE(grossSalary); }
    
    public String getPayrollInfo() {
        return getAllowanceInfo() + ", Gross: $" + grossSalary + 
               ", Deductions: $" + totalDeductions + ", Net: $" + netSalary;
    }
}