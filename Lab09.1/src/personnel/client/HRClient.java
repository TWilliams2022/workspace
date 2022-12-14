/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package personnel.client;

import personnel.Department;
import personnel.Employee;
import personnel.HourlyEmployee;
import personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new Employee("Jason", LocalDate.of(1990, 8, 24)));
        dept.addEmployee(new Employee("Julie", LocalDate.of(2000, 2, 2)));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println(" ");

        //created from page 110
        dept.addEmployee(new Employee("Tyreik",LocalDate.of(1994, 11, 13)));
        dept.addEmployee(new Employee("Jasmine",LocalDate.of(1996, 1, 1)));

        //needed to put information in
        dept.addEmployee(new SalariedEmployee("Tyreik", LocalDate.now(), 20.00 ));
        dept.addEmployee(new HourlyEmployee("Jasmine", LocalDate.now(), 40.00, 40));

        dept.payEmployee();

    }
}