package com.airtribe.learntrack.entity;

import java.time.LocalDate;

public class Enrollment {

    private int id;
    private int studentId;
    private int courseId;
    private LocalDate enrollmentDate;
    private String status;

    public Enrollment(int id, int studentId, int courseId, LocalDate date, String status) {
        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = date;
        this.status = status;
    }

    // ✅ Getter methods (Encapsulation)

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "EnrollmentID=" + id +
                ", StudentID=" + studentId +
                ", CourseID=" + courseId +
                ", Date=" + enrollmentDate +
                ", Status=" + status;
    }
}
