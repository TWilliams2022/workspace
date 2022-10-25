package Inheritance2.client;

import Inheritance2.Department;
import Inheritance2.Employee;

public class DepartClient {
    public static void main(String[] args) {
        Employee[] employees = new Employee[100];
        new Department("marketing", employees);

    }
}
