package controller;

import model.entity.SalesMan;
import model.entity.abstracts.Staff;

public class Main {
    public static void main(String[] args) {
        Staff staff = new SalesMan("John",3,20,"man",456.5);
        System.out.println(staff.getAge());
    }
}
