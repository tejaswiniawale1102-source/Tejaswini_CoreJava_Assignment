package p3;

import p1.Employee;
import p2.HR;
import p2.SalesManager;
import p2.Admin;

public class Test {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new HR(101, "Raj", 30000, 5000);

        employees[1] = new SalesManager(102, "Amit", 40000, 8000, 100000);

        employees[2] = new Admin(103, "Sneha", 35000, 6000);

        for (Employee e : employees) {

            System.out.println(e);
            System.out.println("Calculated Salary : " + e.calSal());

            System.out.println();
        }
    }
}