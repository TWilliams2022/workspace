package Inheritance2;

import java.time.LocalDate;

public class SalaryEmployee extends Employee{
    //anything dealing with money should be double
    private double monthlySalary;

    public void methodUniqueToSalariedEmployeeClass(){

    }

    //constructor came from the extends but it still has it own fields
    public SalaryEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    @Override
    public String toString() {
        String nameAndOtherInfoFromParentClass;
        return "SalaryEmployee{" +
                "monthlySalary=" + monthlySalary +
                '}';
    }








}
