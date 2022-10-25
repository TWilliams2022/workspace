package Inheritance2.client;

import Inheritance2.Employee;
import Inheritance2.HourlyEmployee;
import Inheritance2.SalaryEmployee;

import java.time.LocalDate;

public class EmployeeClient {
    public static void main(String[] args) {

        Employee tyreik = new Employee("Tyreik", LocalDate.of(2022, 11, 13));
        System.out.println(tyreik);

        Employee jasmine = new SalaryEmployee("Jasmine", LocalDate.of(2002, 01, 31));

        Employee kyrie = new HourlyEmployee("kyrie", LocalDate.of(2000, 01, 31));

//        SalaryEmployee salaryEmployee = new Employee("JON", LocalDate.of(1999, 02, 02));

    }
}
