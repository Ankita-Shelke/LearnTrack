package com.airtribe.learntrack.ui;

import com.airtribe.learntrack.entity.*;
import com.airtribe.learntrack.service.*;
import com.airtribe.learntrack.util.IdGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService studentService = new StudentService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();

        while (true) {
            System.out.println("\n===== LearnTrack Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Deactivate Student");
            System.out.println("5. Add Course");
            System.out.println("6. View Courses");
            System.out.println("7. Enroll Student");
            System.out.println("8. View Enrollments");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        System.out.print("First Name: ");
                        String fn = sc.nextLine();
                        System.out.print("Last Name: ");
                        String ln = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("Batch: ");
                        String batch = sc.nextLine();

                        studentService.addStudent(
                                new Student(IdGenerator.nextStudentId(), fn, ln, email, batch)
                        );
                        System.out.println("Student added!");
                        break;

                    case 2:
                        studentService.listStudents();
                        break;

                    case 3:
                        System.out.print("Student ID: ");
                        System.out.println(studentService.findById(Integer.parseInt(sc.nextLine())));
                        break;

                    case 4:
                        System.out.print("Student ID: ");
                        studentService.deactivateStudent(Integer.parseInt(sc.nextLine()));
                        System.out.println("Student deactivated");
                        break;

                    case 5:
                        System.out.print("Course Name: ");
                        String cn = sc.nextLine();
                        System.out.print("Description: ");
                        String d = sc.nextLine();
                        System.out.print("Duration: ");
                        int dur = Integer.parseInt(sc.nextLine());

                        courseService.addCourse(
                                new Course(IdGenerator.nextCourseId(), cn, d, dur)
                        );
                        System.out.println("Course added!");
                        break;

                    case 6:
                        courseService.listCourses();
                        break;

                    case 7:
                        System.out.print("Student ID: ");
                        int sid = Integer.parseInt(sc.nextLine());
                        System.out.print("Course ID: ");
                        int cid = Integer.parseInt(sc.nextLine());
                        enrollmentService.enrollStudent(sid, cid);
                        System.out.println("Enrollment successful!");
                        break;

                    case 8:
                        enrollmentService.listEnrollments(studentService);
                        break;

                    case 0:
                        System.out.println("Bye!");
                        return;

                    default:
                        System.out.println("Invalid option");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
