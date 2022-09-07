package model.entity;

import model.entity.abstracts.Staff;

public class SalesMan extends Staff {
    private double salesAmount;
    private double dealsAmount;
    private double hoursWorked;
    public SalesMan() {
    }

    public SalesMan(String name, double professionalExperience, double salary, double salesAmount
            , double dealsAmount, double hoursWorked) {
        super(name, professionalExperience, salary);
        this.salesAmount = salesAmount;
        this.dealsAmount = dealsAmount;

        this.hoursWorked = hoursWorked;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public double getDealsAmount() {
        return dealsAmount;
    }

    public void setDealsAmount(double dealsAmount) {
        this.dealsAmount = dealsAmount;
    }


    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                super.toString()+
                ", salesAmount=" + salesAmount +
                ", dealsAmount=" + dealsAmount +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}
