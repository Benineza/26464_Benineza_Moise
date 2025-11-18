package _26464.q3;

import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== TAX ADMINISTRATION SYSTEM ===");
        System.out.println("Student ID: 26464");
        
        try {
            System.out.println("\nEnter Tax Administration Details:");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Authority Name: ");
            String authorityName = scanner.nextLine();
            
            System.out.print("Enter Region: ");
            String region = scanner.nextLine();
            
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter Category Name: ");
            String categoryName = scanner.nextLine();
            
            System.out.print("Enter Tax Rate (e.g., 0.15 for 15%): ");
            double rate = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Category Code (min 3 chars): ");
            String code = scanner.nextLine();
            
            System.out.print("Enter TIN (9 digits): ");
            String tin = scanner.nextLine();
            
            System.out.print("Enter Taxpayer Name: ");
            String taxpayerName = scanner.nextLine();
            
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Employer Name: ");
            String employerName = scanner.nextLine();
            
            System.out.print("Enter Employer TIN (9 digits): ");
            String employerTIN = scanner.nextLine();
            
            System.out.print("Enter Contact (10 digits): ");
            String contact = scanner.nextLine();
            
            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();
            
            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Employee Employer TIN (9 digits): ");
            String employeeEmployerTIN = scanner.nextLine();
            
            System.out.print("Enter Declaration Month: ");
            String declarationMonth = scanner.nextLine();
            
            System.out.print("Enter Total Income: ");
            double totalIncome = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Assessment Date (YYYY-MM-DD): ");
            String assessmentDateStr = scanner.nextLine();
            LocalDate assessmentDate = LocalDate.parse(assessmentDateStr);
            
            System.out.print("Enter Assessed Tax: ");
            double assessedTax = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Payment Date (YYYY-MM-DD): ");
            String paymentDateStr = scanner.nextLine();
            LocalDate paymentDate = LocalDate.parse(paymentDateStr);
            
            System.out.print("Enter Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Receipt Number: ");
            String receiptNo = scanner.nextLine();
            
            System.out.print("Enter Total Tax: ");
            double totalTax = scanner.nextDouble();
            
            TaxRecord taxRecord = new TaxRecord(
                id, LocalDate.now(), LocalDate.now(),
                authorityName, region, email,
                categoryName, rate, code,
                tin, taxpayerName, address,
                employerName, employerTIN, contact,
                employeeName, salary, employeeEmployerTIN,
                declarationMonth, totalIncome,
                assessmentDate, assessedTax,
                paymentDate, paymentAmount,
                receiptNo, totalTax
            );
            
            System.out.println("\n--- ALL INSERTED DATA ---");
            System.out.println(taxRecord.getTaxRecordInfo());
            
            System.out.println("\n--- TAX CALCULATION ---");
            taxRecord.computeTax();
            
        } catch (TaxDataException e) {
            System.out.println("Tax Data Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}