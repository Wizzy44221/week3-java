package schoolManagementSystem.model;

public class Applicants {

    private String name;
    private  int age;
    private String gender;
    private String religion;


    public Applicants(String name, int age, String gender, String religion) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.religion = religion;
    }

    public Applicants() {
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
}
