package _26464.q5;

import java.time.LocalDate;

public class AttendanceRecord extends ClassSession {
    private String recordStudentID;
    private String sessionID;
    private String status;
    
    public AttendanceRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                           String institutionName, String code, String address,
                           String departmentName, String departmentHead,
                           String courseName, String courseCode, int credits,
                           String instructorName, String email, String phone,
                           String studentName, String studentID, int age,
                           LocalDate sessionDate, String topic,
                           String recordStudentID, String sessionID, String status) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic);
        
        if (!status.equals("Present") && !status.equals("Absent"))
            throw new IllegalArgumentException("Status must be 'Present' or 'Absent'");
        
        this.recordStudentID = recordStudentID;
        this.sessionID = sessionID;
        this.status = status;
    }
    
    public String getRecordStudentID() { return recordStudentID; }
    public String getSessionID() { return sessionID; }
    public String getStatus() { return status; }
    
    public String getAttendanceRecordInfo() {
        return getClassSessionInfo() + ", Record Student ID: " + recordStudentID + ", Session ID: " + sessionID + ", Status: " + status;
    }
}