package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    //fields
    double salary;

    //ctor
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        this.salary = salary;
    }

    public SalariedEmployee() {

    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "name" + this.getName() +
                "hireDate" + this.getHireDate() +
                "salary=" + salary +
                '}';
    }

}
