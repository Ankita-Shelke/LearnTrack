package com.airtribe.learntrack.service;

import com.airtribe.learntrack.entity.Enrollment;
import com.airtribe.learntrack.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentService {

    private List<Enrollment> enrollments = new ArrayList<>();

    public void enrollStudent(int studentId, int courseId) {
        enrollments.add(new Enrollment(
                com.airtribe.learntrack.util.IdGenerator.nextEnrollmentId(),
                studentId,
                courseId,
                java.time.LocalDate.now(),
                "ACTIVE"
        ));
    }


    public void listEnrollments(StudentService studentService) {

        if (enrollments.isEmpty()) {
            System.out.println("No enrollments found.");
            return;
        }

        for (Enrollment e : enrollments) {
            Student s = studentService.findById(e.getStudentId());

            System.out.println(
                    "EnrollmentID=" + e.getId() +
                            ", Student=" + s.getDisplayName() +
                            ", StudentID=" + e.getStudentId() +
                            ", CourseID=" + e.getCourseId() +
                            ", Date=" + e.getEnrollmentDate() +
                            ", Status=" + e.getStatus()
            );
        }
    }
}
