package by.itStep.yandr.salesCompanyProject.model.entity.container;

import by.itStep.yandr.salesCompanyProject.model.entity.abstracts.Staff;

public class StaticDepartment implements Department {

    public static final int DEFAULT_CAPACITY = 10;
    private Staff[] employees;
    private int size;

    public StaticDepartment() {
        employees = new Staff[DEFAULT_CAPACITY];
        size = 0;
    }

    public StaticDepartment(int capacity) {
        employees = new Staff[capacity];
        size = 0;
    }

    public StaticDepartment(Staff[] employees) {
        this.employees = employees;
        size = employees.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Staff get(int index) {
        return employees[index];
    }

    public int capacity() {
        return employees.length;
    }

    public void setStaff(int index, Staff employee) {
        employees[index] = employee;
    }

    public void add(Staff employee) {
        if (employee == null) {
            return;
        }
        if (size < employees.length) {
            employees[size++] = employee;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public void remove(int index){
        if (isEmpty() || index == 0 && index >= size){
            return;
        }
        if (index == size - 1) {
            employees[index] = null;
        } else {
            for (int i = index; i < size; i++) {
                employees[i] = employees[i + 1];
            }
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (isEmpty()) {
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
