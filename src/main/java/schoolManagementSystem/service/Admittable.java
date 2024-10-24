package schoolManagementSystem.service;

import schoolManagementSystem.model.Applicants;
import schoolManagementSystem.model.Students;

import java.util.List;

public interface Admittable {

    void admit (List<Applicants> applicants);

    void expel(Students students);
}
