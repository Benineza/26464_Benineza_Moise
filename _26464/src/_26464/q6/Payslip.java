package _26464.q6;

import java.time.LocalDate;

public class Payslip extends Payroll {
    private String payslipNumber;
    private LocalDate issueDate;
    
    public Payslip(int id, LocalDate createdDate, LocalDate updatedDate,
                  String orgName, String orgCode, String rssbNumber, String contactEmail,
                  String deptName, String deptCode, String managerName,
                  String employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                  int month, int year, LocalDate startDate, LocalDate endDate,
                  double basicPay, double transportAllowance, double housingAllowance,
                  double loanDeduction,
                  double overtimeHours, double overtimeRate, double bonus,
                  String payslipNumber, LocalDate issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate, basicPay, transportAllowance, housingAllowance, loanDeduction, overtimeHours, overtimeRate, bonus);
        
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }
    
    public void generatePayslip() {
        System.out.println("=== PAYSLIP ===");
        System.out.println("Student ID: 26464");
        System.out.println("Payslip Number: " + payslipNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Employee: " + getFullName() + " (" + getEmployeeID() + ")");
        System.out.println("Position: " + getPosition());
        System.out.println("Department: " + getDeptName());
        System.out.println("Organization: " + getOrgName());
        System.out.println("RSSB Number: " + getRssbNumber());
        System.out.println("Pay Period: " + getMonth() + "/" + getYear());
        System.out.println("RSSB Registered: " + isRssbRegistered());
        
        System.out.println("\n--- EARNINGS ---");
        System.out.println("Basic Pay: $" + getBasicPay());
        System.out.println("Transport Allowance: $" + getTransportAllowance());
        System.out.println("Housing Allowance: $" + getHousingAllowance());
        System.out.println("Overtime (" + getOvertimeHours() + " hours @ $" + getOvertimeRate() + "): $" + (getOvertimeHours() * getOvertimeRate()));
        System.out.println("Bonus: $" + getBonus());
        System.out.println("Gross Salary: $" + getGrossSalary());
        
        System.out.println("\n--- DEDUCTIONS ---");
        System.out.println("RSSB Contribution (5% of basic pay): $" + getRssbContribution());
        System.out.println("PAYE Tax: $" + getPayeTax());
        System.out.println("Loan Deduction: $" + getLoanDeduction());
        System.out.println("Total Deductions: $" + getTotalDeductions());
        
        System.out.println("\n--- NET SALARY ---");
        System.out.println("Net Salary: $" + getNetSalary());
        System.out.println("=================");
    }
    
    public String getPayslipInfo() {
        return getPayrollInfo() + ", Payslip Number: " + payslipNumber + ", Issue Date: " + issueDate;
    }
}