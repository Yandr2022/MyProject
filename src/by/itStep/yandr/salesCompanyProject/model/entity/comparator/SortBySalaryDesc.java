package by.itStep.yandr.salesCompanyProject.model.entity.comparator;

import by.itStep.yandr.salesCompanyProject.model.entity.abstracts.Staff;

import java.util.Comparator;

public class SortBySalaryDesc implements Comparator<Staff> {
    @Override
    public int compare(Staff o1, Staff o2) {
        return Double.compare(o2.getSalary(),o1.getSalary());
    }
}
