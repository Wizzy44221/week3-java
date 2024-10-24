package schoolManagementSystem.model;

import schoolManagementSystem.baseClass.Staff;
import schoolManagementSystem.service.Teachable;

import java.util.ArrayList;
import java.util.List;

public class Teachers extends Staff {

      private List <Courses> coursesTaught;


    public Teachers(String name) {
        super(name, "Teacher");
        this.coursesTaught = new ArrayList<>();
    }

    public Teachers(List<Courses> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

//    @Override
//    public void teach(Courses courses,Teachers teachers) {
//        System.out.println(teachers.getName() + " teaches " + courses.getName());
//    }


    public void addCourse(Courses courses) {
    this.coursesTaught.add(courses);
    }

    public List<Courses> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(List<Courses> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }


}
