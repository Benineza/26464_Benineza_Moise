package _26464.q5;

import java.time.LocalDate;

public class AttendanceSummary extends LeaveRequest {
    private LocalDate reportDate;
    private int totalPresent;
    private int totalAbsent;
    
    public AttendanceSummary(int id, LocalDate createdDate, LocalDate updatedDate,
                            String institutionName, String code, String address,
                            String departmentName, String departmentHead,
                            String courseName, String courseCode, int credits,
                            String instructorName, String email, String phone,
                            String studentName, String studentID, int age,
                            LocalDate sessionDate, String topic,
                            String recordStudentID, String sessionID, String status,
                            LocalDate requestDate, String reason, boolean approved,
                            LocalDate reportDate, int totalPresent, int totalAbsent) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, recordStudentID, sessionID, status, requestDate, reason, approved);
        
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
    }
    
    public void generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        double attendanceRate = 0;
        
        if (totalSessions > 0) {
            attendanceRate = (double) totalPresent / totalSessions * 100;
        }
        
        System.out.println("=== ATTENDANCE SUMMARY REPORT ===");
        System.out.println("Student ID: 26464");
        System.out.println("Report Date: " + reportDate);
        System.out.println("Institution: " + getInstitutionName());
        System.out.println("Student: " + getStudentName() + " (" + getStudentID() + ")");
        System.out.println("Course: " + getCourseName());
        System.out.println("Total Present: " + totalPresent);
        System.out.println("Total Absent: " + totalAbsent);
        System.out.println("Total Sessions: " + totalSessions);
        System.out.println("Attendance Rate: " + String.format("%.2f", attendanceRate) + "%");
        System.out.println("Leave Request Approved: " + isApproved());
        System.out.println("=================================");
    }
    
    public String getAttendanceSummaryInfo() {
        return getLeaveRequestInfo() + ", Report Date: " + reportDate + ", Total Present: " + totalPresent + ", Total Absent: " + totalAbsent;
    }
}