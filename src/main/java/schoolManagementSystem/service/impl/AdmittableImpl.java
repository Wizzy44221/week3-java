package schoolManagementSystem.service.impl;

import schoolManagementSystem.model.Applicants;
import schoolManagementSystem.model.Students;
import schoolManagementSystem.service.Admittable;

import java.util.List;

public class AdmittableImpl implements Admittable {

    @Override
    public void admit(List<Applicants> applicants) {

        for(Applicants applicant : applicants) {
            if (applicant.getAge() >= 18
                    && applicant.getGender().equals("Female")
                    && applicant.getReligion().equals("Non-Religious")) {
                System.out.println(applicant.getName() + "admitted successfully.");
            } else{
                System.out.println(applicant.getName() + "does not meet admission criteria.");
            }
        }
    }

    @Override
    public void expel(Students students) {

    }
}
