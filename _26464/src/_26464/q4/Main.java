package _26464.q4;

import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== PROCUREMENT MANAGEMENT SYSTEM ===");
        System.out.println("Student ID: 26464");
        
        try {
            System.out.println("\nEnter Procurement Details:");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Organization Name: ");
            String orgName = scanner.nextLine();
            
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();
            
            System.out.print("Enter Department Name: ");
            String deptName = scanner.nextLine();
            
            System.out.print("Enter Department Code (min 3 chars): ");
            String deptCode = scanner.nextLine();
            
            System.out.print("Enter Supplier Name: ");
            String supplierName = scanner.nextLine();
            
            System.out.print("Enter Supplier TIN (9 digits): ");
            String supplierTIN = scanner.nextLine();
            
            System.out.print("Enter Contact (10 digits): ");
            String contact = scanner.nextLine();
            
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            
            System.out.print("Enter Unit Price: ");
            double unitPrice = scanner.nextDouble();
            
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter PO Number: ");
            String poNumber = scanner.nextLine();
            
            System.out.print("Enter Order Date (YYYY-MM-DD): ");
            String orderDateStr = scanner.nextLine();
            LocalDate orderDate = LocalDate.parse(orderDateStr);
            
            System.out.print("Enter Total Amount: ");
            double totalAmount = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Delivery Date (YYYY-MM-DD): ");
            String deliveryDateStr = scanner.nextLine();
            LocalDate deliveryDate = LocalDate.parse(deliveryDateStr);
            
            System.out.print("Enter Delivered By: ");
            String deliveredBy = scanner.nextLine();
            
            System.out.print("Enter Inspection Name: ");
            String inspectionName = scanner.nextLine();
            
            System.out.print("Enter Status (Passed/Failed): ");
            String status = scanner.nextLine();
            
            System.out.print("Enter Remarks: ");
            String remarks = scanner.nextLine();
            
            System.out.print("Enter Invoice Number: ");
            String invoiceNo = scanner.nextLine();
            
            System.out.print("Enter Invoice Amount: ");
            double invoiceAmount = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Enter Report Summary: ");
            String summary = scanner.nextLine();
            
            ProcurementReport report = new ProcurementReport(
                id, LocalDate.now(), LocalDate.now(),
                orgName, address, contactEmail,
                deptName, deptCode,
                supplierName, supplierTIN, contact,
                productName, unitPrice, quantity,
                poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy,
                inspectionName, status, remarks,
                invoiceNo, invoiceAmount,
                LocalDate.now(), summary
            );
            
            System.out.println("\n--- ALL INSERTED DATA ---");
            System.out.println(report.getProcurementReportInfo());
            
            System.out.println("\n--- PROCUREMENT CALCULATION ---");
            report.calculateTotal();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}