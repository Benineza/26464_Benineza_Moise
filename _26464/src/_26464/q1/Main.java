package _26464.q1;

import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== STOCK MANAGEMENT SYSTEM ===");
        System.out.println("Student ID: 26464");
        
        try {
            // Get user input for all fields
            System.out.println("\nEnter Entity Details:");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Warehouse Name: ");
            String warehouseName = scanner.nextLine();
            
            System.out.print("Enter Location: ");
            String location = scanner.nextLine();
            
            System.out.print("Enter Contact Number (10 digits): ");
            String contactNumber = scanner.nextLine();
            
            System.out.print("Enter Category Name: ");
            String categoryName = scanner.nextLine();
            
            System.out.print("Enter Category Code (min 3 chars): ");
            String categoryCode = scanner.nextLine();
            
            System.out.print("Enter Supplier Name: ");
            String supplierName = scanner.nextLine();
            
            System.out.print("Enter Supplier Email: ");
            String supplierEmail = scanner.nextLine();
            
            System.out.print("Enter Supplier Phone (10 digits): ");
            String supplierPhone = scanner.nextLine();
            
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            
            System.out.print("Enter Unit Price: ");
            double unitPrice = scanner.nextDouble();
            
            System.out.print("Enter Stock Limit: ");
            int stockLimit = scanner.nextInt();
            
            System.out.print("Enter Quantity Available: ");
            int quantityAvailable = scanner.nextInt();
            
            System.out.print("Enter Reorder Level: ");
            int reorderLevel = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Purchase Date (YYYY-MM-DD): ");
            String purchaseDateStr = scanner.nextLine();
            LocalDate purchaseDate = LocalDate.parse(purchaseDateStr);
            
            System.out.print("Enter Purchased Quantity: ");
            int purchasedQuantity = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Purchase Supplier Name: ");
            String purchaseSupplierName = scanner.nextLine();
            
            System.out.print("Enter Sale Date (YYYY-MM-DD): ");
            String saleDateStr = scanner.nextLine();
            LocalDate saleDate = LocalDate.parse(saleDateStr);
            
            System.out.print("Enter Sold Quantity: ");
            int soldQuantity = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.nextLine();
            
            System.out.print("Enter Total Items: ");
            int totalItems = scanner.nextInt();
            
            System.out.print("Enter Stock Value: ");
            double stockValue = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Report Remarks: ");
            String remarks = scanner.nextLine();
            
            // Create StockReport with user input
            StockReport report = new StockReport(
                id, 
                LocalDate.now(), 
                LocalDate.now(),
                warehouseName, 
                location, 
                contactNumber,
                categoryName, 
                categoryCode,
                supplierName, 
                supplierEmail, 
                supplierPhone,
                productName, 
                unitPrice, 
                stockLimit,
                quantityAvailable, 
                reorderLevel,
                purchaseDate, 
                purchasedQuantity, 
                purchaseSupplierName,
                saleDate, 
                soldQuantity, 
                customerName,
                totalItems, 
                stockValue,
                LocalDate.now(), 
                remarks
            );
            
            System.out.println("\n--- ALL INSERTED DATA ---");
            System.out.println(report.getStockReportInfo());
            
            System.out.println("\n--- GENERATED REPORT ---");
            report.generateReport();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
        
        scanner.close();
    }
}