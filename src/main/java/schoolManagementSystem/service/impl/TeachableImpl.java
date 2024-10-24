package schoolManagementSystem.service.impl;

import schoolManagementSystem.model.Courses;
import schoolManagementSystem.model.Teachers;
import schoolManagementSystem.service.Teachable;

public class TeachableImpl implements Teachable {


    @Override
    public void teach(Courses courses, Teachers teachers) {
        System.out.println(teachers.getName() + " teaches " + courses.getName());

    }
}
