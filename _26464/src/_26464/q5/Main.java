package _26464.q5;

import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== ATTENDANCE MANAGEMENT SYSTEM ===");
        System.out.println("Student ID: 26464");
        
        try {
            System.out.println("\nEnter Attendance Details:");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Institution Name: ");
            String institutionName = scanner.nextLine();
            
            System.out.print("Enter Institution Code (min 3 chars): ");
            String code = scanner.nextLine();
            
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            
            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();
            
            System.out.print("Enter Department Head: ");
            String departmentHead = scanner.nextLine();
            
            System.out.print("Enter Course Name: ");
            String courseName = scanner.nextLine();
            
            System.out.print("Enter Course Code: ");
            String courseCode = scanner.nextLine();
            
            System.out.print("Enter Credits: ");
            int credits = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Instructor Name: ");
            String instructorName = scanner.nextLine();
            
            System.out.print("Enter Instructor Email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter Instructor Phone (10 digits): ");
            String phone = scanner.nextLine();
            
            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            
            System.out.print("Enter Student ID: ");
            String studentID = scanner.nextLine();
            
            System.out.print("Enter Student Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter Session Date (YYYY-MM-DD): ");
            String sessionDateStr = scanner.nextLine();
            LocalDate sessionDate = LocalDate.parse(sessionDateStr);
            
            System.out.print("Enter Topic: ");
            String topic = scanner.nextLine();
            
            System.out.print("Enter Record Student ID: ");
            String recordStudentID = scanner.nextLine();
            
            System.out.print("Enter Session ID: ");
            String sessionID = scanner.nextLine();
            
            System.out.print("Enter Status (Present/Absent): ");
            String status = scanner.nextLine();
            
            System.out.print("Enter Request Date (YYYY-MM-DD): ");
            String requestDateStr = scanner.nextLine();
            LocalDate requestDate = LocalDate.parse(requestDateStr);
            
            System.out.print("Enter Reason: ");
            String reason = scanner.nextLine();
            
            System.out.print("Enter Approved (true/false): ");
            boolean approved = scanner.nextBoolean();
            scanner.nextLine();
            
            System.out.print("Enter Total Present: ");
            int totalPresent = scanner.nextInt();
            
            System.out.print("Enter Total Absent: ");
            int totalAbsent = scanner.nextInt();
            
            AttendanceSummary summary = new AttendanceSummary(
                id, LocalDate.now(), LocalDate.now(),
                institutionName, code, address,
                departmentName, departmentHead,
                courseName, courseCode, credits,
                instructorName, email, phone,
                studentName, studentID, age,
                sessionDate, topic,
                recordStudentID, sessionID, status,
                requestDate, reason, approved,
                LocalDate.now(), totalPresent, totalAbsent
            );
            
            System.out.println("\n--- ALL INSERTED DATA ---");
            System.out.println(summary.getAttendanceSummaryInfo());
            
            System.out.println("\n--- ATTENDANCE SUMMARY ---");
            summary.generateSummary();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}