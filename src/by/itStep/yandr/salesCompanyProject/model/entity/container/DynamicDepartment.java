package by.itStep.yandr.salesCompanyProject.model.entity.container;

import by.itStep.yandr.salesCompanyProject.model.entity.abstracts.Staff;

public class DynamicDepartment implements Department{
    private Staff[] employees;

    public DynamicDepartment() {
        employees = new Staff[0];
    }

    public DynamicDepartment(Staff[] employees) {
        this();
        if (employees != null) {
            this.employees = employees;
        }

    }

    public int size() {
        return employees.length;
    }

    //!!!work-flow
    public Staff get(int index) {
        return employees[index];
    }

    public void setStaff(int index, Staff employee) {
        employees[index] = employee;
    }

    public void add(Staff employee) {
        if (employees == null) {
            return;
        }
        Staff[] temp = new Staff[employees.length + 1];
        int i = 0;
        for (; i < employees.length; i++) {
            temp[i] = employees[i];
        }
        temp[i] = employee;
        employees = temp;

    }

    public void remove(int index) {
        if (employees == null) {
            return;
        }
        Staff[] temp = new Staff[employees.length - 1];

        for (int i = 0, j = 0; i < employees.length; i++) {
            if (i != index) {
                temp[j++] = employees[i];
            }
        }
        employees = temp;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (employees.length == 0) {
            builder.append("Department is empty.");
        } else {
            builder.append("Department:");

            for (Staff employee : employees) {
                builder.append("\n").append(employee);
            }
        }

        return builder.toString();
    }
}
