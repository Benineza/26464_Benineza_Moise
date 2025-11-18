package _26464.q6;

import java.util.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PAYROLL MANAGEMENT SYSTEM (RSSB) ===");
        System.out.println("Student ID: 26464");
        
        try {
            System.out.println("\nEnter Payroll Details:");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Organization Name: ");
            String orgName = scanner.nextLine();
            
            System.out.print("Enter Organization Code (min 3 chars): ");
            String orgCode = scanner.nextLine();
            
            System.out.print("Enter RSSB Number (8 digits): ");
            String rssbNumber = scanner.nextLine();
            
            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();
            
            System.out.print("Enter Department Name: ");
            String deptName = scanner.nextLine();
            
            System.out.print("Enter Department Code (min 3 chars): ");
            String deptCode = scanner.nextLine();
            
            System.out.print("Enter Manager Name: ");
            String managerName = scanner.nextLine();
            
            System.out.print("Enter Employee ID (min 1000): ");
            String employeeID = scanner.nextLine();
            
            System.out.print("Enter Full Name: ");
            String fullName = scanner.nextLine();
            
            System.out.print("Enter Position: ");
            String position = scanner.nextLine();
            
            System.out.print("Enter Base Salary: ");
            double baseSalary = scanner.nextDouble();
            
            System.out.print("Enter RSSB Registered (true/false): ");
            boolean rssbRegistered = scanner.nextBoolean();
            scanner.nextLine();
            
            System.out.print("Enter Payroll Month (1-12): ");
            int month = scanner.nextInt();
            
            System.out.print("Enter Payroll Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Start Date (YYYY-MM-DD): ");
            String startDateStr = scanner.nextLine();
            LocalDate startDate = LocalDate.parse(startDateStr);
            
            System.out.print("Enter End Date (YYYY-MM-DD): ");
            String endDateStr = scanner.nextLine();
            LocalDate endDate = LocalDate.parse(endDateStr);
            
            System.out.print("Enter Basic Pay: ");
            double basicPay = scanner.nextDouble();
            
            System.out.print("Enter Transport Allowance: ");
            double transportAllowance = scanner.nextDouble();
            
            System.out.print("Enter Housing Allowance: ");
            double housingAllowance = scanner.nextDouble();
            
            System.out.print("Enter Loan Deduction: ");
            double loanDeduction = scanner.nextDouble();
            
            System.out.print("Enter Overtime Hours: ");
            double overtimeHours = scanner.nextDouble();
            
            System.out.print("Enter Overtime Rate: ");
            double overtimeRate = scanner.nextDouble();
            
            System.out.print("Enter Bonus: ");
            double bonus = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Payslip Number: ");
            String payslipNumber = scanner.nextLine();
            
            Payslip payslip = new Payslip(
                id, LocalDate.now(), LocalDate.now(),
                orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance,
                loanDeduction,
                overtimeHours, overtimeRate, bonus,
                payslipNumber, LocalDate.now()
            );
            
            System.out.println("\n--- ALL INSERTED DATA ---");
            System.out.println(payslip.getPayslipInfo());
            
            System.out.println("\n--- PAYSLIP GENERATION ---");
            payslip.generatePayslip();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}