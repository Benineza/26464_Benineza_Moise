package _26464.q5;

import java.time.LocalDate;

public class ClassSession extends Student {
    private LocalDate sessionDate;
    private String topic;
    
    public ClassSession(int id, LocalDate createdDate, LocalDate updatedDate,
                       String institutionName, String code, String address,
                       String departmentName, String departmentHead,
                       String courseName, String courseCode, int credits,
                       String instructorName, String email, String phone,
                       String studentName, String studentID, int age,
                       LocalDate sessionDate, String topic) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age);
        
        if (sessionDate == null) throw new IllegalArgumentException("Session date cannot be null");
        if (topic == null || topic.isEmpty()) throw new IllegalArgumentException("Topic cannot be empty");
        
        this.sessionDate = sessionDate;
        this.topic = topic;
    }
    
    public LocalDate getSessionDate() { return sessionDate; }
    public String getTopic() { return topic; }
    
    public String getClassSessionInfo() {
        return getStudentInfo() + ", Session Date: " + sessionDate + ", Topic: " + topic;
    }
}