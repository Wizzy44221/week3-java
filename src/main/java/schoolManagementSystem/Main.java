package schoolManagementSystem;

import schoolManagementSystem.model.*;
import schoolManagementSystem.service.impl.AdmittableImpl;
import schoolManagementSystem.service.impl.TeachableImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //create a new school
        School school = new School();


        //create staff
        Principal principal = new Principal("Wisdom Onu Ugorji", "Principal");
        Teachers teachers = new Teachers("Assumpta Ibeh");
        NonAcademicStaffs nonAcademicStaffs = new NonAcademicStaffs("Susan Tunde");


        //add staff to school
//        school.getStaff().add(principal);
//        school.getStaff().add(teachers);
//        school.getStaff().add(nonAcademicStaffs);


        //create students
        Students student1 = new Students("Alice Brown", 18, "Female", "Christian");

        Students student2 = new Students("Micheal Kalu", 19, "Male", "Muslim");

        Students student3 = new Students("John Buruno", 20, "Male", "Atheist");

//
//        //Add students to school
//        school.getStudents().add(student1);
//        school.getStudents().add(student2);


        //create courses
        Courses course1 = new Courses("Mathematics");
        Courses course2 = new Courses("Biology");
        Courses course3 = new Courses("Chemistry");
        student1.takeCourse(student1, course1);
        student2.takeCourse(student2, course3);
        student3.takeCourse(student3, course2);
        System.out.println("******************************");

        //Assign teachers to courses
//        teachers.teach(course1, teachers);
//        teachers.teach(course2, teachers);
//        teachers.teach(course3, teachers);

        TeachableImpl teacher1 = new TeachableImpl();
        TeachableImpl teacher2 = new TeachableImpl();
        TeachableImpl teacher3 = new TeachableImpl();
        teacher1.teach(course1, teachers);
        teacher2.teach(course2, teachers);
        teacher3.teach(course3, teachers);


        //Enroll students in course
//        student1.enroll(course1, course3);
//        student2.enroll(course1, course2);
//        student3.enroll(course1, course2);

        //create courses
        Classes class1 = new Classes("Class 1");
        Classes class2 = new Classes("Class 2");
        Classes class3 = new Classes("Class 3");

        //Schedule classes
        class1.schedule(course1, course2, course3);
        class2.schdedule(course1, course2);
        class3.schdedule(course1, course3);


        // Create applicants
        Applicants applicants1 = new Applicants("Monica Taiye", 16, "Female", "Christian");
        Applicants applicant2 = new Applicants("David Akuchie", 20, "Male", "Jewish");
        Applicants applicant3 = new Applicants("Samuel White", 17, "Male", "Atheist");
        System.out.println("******************************");


        // List of applicants
        List<Applicants> applicants = new ArrayList<>();
        applicants.add(applicants1);
        applicants.add(applicant2);
        applicants.add(applicant3);

//        principal.admit(applicants);
        AdmittableImpl principal1 = new AdmittableImpl();
        principal1.admit(applicants);

        System.out.println("******************************");

        //Admit applicants based on conditions

        //Print school information
        System.out.println("School Information:");
        System.out.println("Staff:");


    }


}


