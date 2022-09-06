package model.entity.abstracts;

public class Staff {
    private String name;
    private double professionalExperience;
    private int age;
    private String gender;
    private double wage;

    public Staff() {

    }

    public Staff(String name, double professionalExperience, int age, String gender, double wage) {
        this.name = name;
        this.professionalExperience = professionalExperience;
        this.age = age;
        this.gender = gender;
        this.wage = wage;
    }

    public double getProfessionalExperience() {
        return professionalExperience;
    }

    public void setProfessionalExperience(double professionalExperience) {
        this.professionalExperience = professionalExperience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff\n{" +
                "Name = " + name +
                ", professional experience = " + professionalExperience +
                ", age = " + age +
                ", gender = '" + gender + '\'' +
                ", wage = " + wage +
                '}';
    }
}
