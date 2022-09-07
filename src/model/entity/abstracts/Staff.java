package model.entity.abstracts;

public class Staff {
    private String name;
    private double professionalExperience;
    private double salary;
    public Staff() {

    }

    public Staff(String name, double professionalExperience, double salary) {
        if (name != null) {
            this.name = name;
        }
        if (professionalExperience >= 0) {
            this.professionalExperience = professionalExperience;
        }
        if (salary >= 0) {
            this.salary = salary;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProfessionalExperience() {
        return professionalExperience;
    }

    public void setProfessionalExperience(double professionalExperience) {
        this.professionalExperience = professionalExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return"name = '" + name + '\'' +
                ", professionalExperience = " + professionalExperience +
                ", salary = " + salary ;
    }
}
