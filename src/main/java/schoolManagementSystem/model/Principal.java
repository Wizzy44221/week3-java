package schoolManagementSystem.model;

import schoolManagementSystem.service.Admittable;
import schoolManagementSystem.baseClass.Staff;

import java.util.List;

public class Principal extends Staff{



    public Principal(String name, String role) {
        super(name, role);
    }

    public Principal() {
    }

//    @Override
//    public void admit(List<Applicants> applicants) {
//
//        for(Applicants applicant : applicants) {
//            if (applicant.getAge() >= 18
//                    && applicant.getGender().equals("Female")
//                    && applicant.getReligion().equals("Non-Religious")) {
//                System.out.println(applicant.getName() + "admitted successfully.");
//            } else{
//                System.out.println(applicant.getName() + "does not meet admission criteria.");
//            }
//        }
//    }

//    @Override
//    public void expel(Students students) {
//
//    }



}
