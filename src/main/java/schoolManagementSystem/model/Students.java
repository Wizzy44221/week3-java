package schoolManagementSystem.model;

import java.util.List;

public class Students {

    private String name;
    private int age;
    private String gender;
    private String religion;
    private List<Courses>enrolledCourses;

    public Students(String name, int age, String gender, String religion) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.religion = religion;
    }

    public Students() {
    }

    public void takeCourse (Students students, Courses courses) {
        System.out.println(students.getName() + " student is learning " + courses.getName());
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getReligion() {
        return religion;
    }

    public List<Courses> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public void setEnrolledCourses(List<Courses> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public void enroll(Courses course1, Courses courses2) {
    }
}




