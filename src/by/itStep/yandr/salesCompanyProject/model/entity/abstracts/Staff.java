package by.itStep.yandr.salesCompanyProject.model.entity.abstracts;

import java.util.Objects;

public class Staff implements Comparable<Staff> {
    private String name;
    private double professionalExperience;
    private double salary;

    public Staff() {
    }

    public Staff(String name, double professionalExperience, double salary) {
        this.name = name;
        this.professionalExperience = professionalExperience;
        this.salary = salary;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Double.compare(staff.professionalExperience, professionalExperience) == 0
                && Double.compare(staff.salary, salary) == 0 && name.equals(staff.name);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = prime + Objects.hash(name);
        result = result * prime + Objects.hash(professionalExperience);
        result = result * prime + Objects.hash(salary);
        return result;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", professionalExperience=" + professionalExperience +
                ", salary=" + salary;
    }

    @Override
    public int compareTo(Staff o) {
        return Double.compare(salary, o.salary);
    }
}
