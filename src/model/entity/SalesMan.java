package model.entity;

import model.entity.abstracts.Staff;

public class SalesMan extends Staff {
    public SalesMan() {
    }

    public SalesMan(String name, double professionalExperience, int age, String gender, double wage) {
        super(name, professionalExperience, age, gender, wage);
    }
}
