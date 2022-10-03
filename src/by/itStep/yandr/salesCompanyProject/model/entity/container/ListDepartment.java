package by.itStep.yandr.salesCompanyProject.model.entity.container;

import by.itStep.yandr.salesCompanyProject.model.entity.abstracts.Staff;

public class ListDepartment implements Department {

    private Node first;
    private int size;

    public ListDepartment() {
        first = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Staff get(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            return null;
        }
        Node temp = first;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.employee;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Staff employee) {
        if (isEmpty()) {
            first = new Node(employee);
        } else {
            Node temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(employee);
        }
        size++;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (isEmpty()) {
            builder.append("Department is empty.");
        } else {
            builder.append("Department:");
            Node temp = first;
            while (temp.next != null) {
                builder.append("\n").append(temp.employee);
                temp = temp.next;
            }
            builder.append(temp.employee);
        }

        return builder.toString();
    }


    private class Node {
        public Staff employee;
        public Node next;

        public Node(Staff employee) {
            this.employee = employee;
        }
    }


}
