package by.itStep.yandr.salesCompanyProject.model.entity;

import by.itStep.yandr.salesCompanyProject.model.entity.abstracts.Staff;

import java.util.Objects;

public class SalesMan extends Staff {
    private double salesAmount;
    private double hoursWorked;

    public SalesMan() {
    }

    public SalesMan(String name, double professionalExperience, double salary, double salesAmount, double hoursWorked) {
        super(name, professionalExperience, salary);
        this.salesAmount = salesAmount;
        this.hoursWorked = hoursWorked;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalesMan salesMan = (SalesMan) o;
        return Double.compare(salesMan.salesAmount, salesAmount) == 0 && Double.compare(salesMan.hoursWorked, hoursWorked) == 0;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = prime + super.hashCode();
        result = result * prime + Objects.hash(salesAmount);
        result = result * prime + Objects.hash(hoursWorked);
        return result;
    }

    @Override
    public int compareTo(Staff o) {
        if (getClass() != o.getClass()) return 1;
        SalesMan sm = (SalesMan) o;
        return Double.compare(salesAmount,sm.salesAmount);
    }
}
