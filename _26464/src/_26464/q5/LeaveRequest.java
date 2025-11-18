package _26464.q5;

import java.time.LocalDate;

public class LeaveRequest extends AttendanceRecord {
    private LocalDate requestDate;
    private String reason;
    private boolean approved;
    
    public LeaveRequest(int id, LocalDate createdDate, LocalDate updatedDate,
                       String institutionName, String code, String address,
                       String departmentName, String departmentHead,
                       String courseName, String courseCode, int credits,
                       String instructorName, String email, String phone,
                       String studentName, String studentID, int age,
                       LocalDate sessionDate, String topic,
                       String recordStudentID, String sessionID, String status,
                       LocalDate requestDate, String reason, boolean approved) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic, recordStudentID, sessionID, status);
        
        if (reason == null || reason.isEmpty()) throw new IllegalArgumentException("Reason cannot be empty");
        
        this.requestDate = requestDate;
        this.reason = reason;
        this.approved = approved;
    }
    
    public LocalDate getRequestDate() { return requestDate; }
    public String getReason() { return reason; }
    public boolean isApproved() { return approved; }
    
    public String getLeaveRequestInfo() {
        return getAttendanceRecordInfo() + ", Request Date: " + requestDate + ", Reason: " + reason + ", Approved: " + approved;
    }
}