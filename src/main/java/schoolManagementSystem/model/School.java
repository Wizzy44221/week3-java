package schoolManagementSystem.model;

import schoolManagementSystem.baseClass.Staff;

import java.util.List;

public class School {

    private List <Staff> staff;

    private List <schoolManagementSystem.model.Students> Students;

    private List <Courses> courses;

    private List <Classes> classes;

    public School(List<Staff> staff, List<schoolManagementSystem.model.Students> students, List<Courses> courses, List<Classes> classes) {
        this.staff = staff;
        Students = students;
        this.courses = courses;
        this.classes = classes;
    }

    public School() {
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public List<schoolManagementSystem.model.Students> getStudents() {
        return Students;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public void setStudents(List<schoolManagementSystem.model.Students> students) {
        Students = students;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }
}
