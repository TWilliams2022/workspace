package Inheritance2;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private int numberOfHoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name,
                          LocalDate hireDate,
                          int numberOfHoursWorkedPerMonth,
                          double hourlyRate) {
        super(name, hireDate);
        this.numberOfHoursWorkedPerMonth = numberOfHoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    //----------------------------------------------------------------------
    public int getNumberOfHoursWorkedPerMonth() {
        return numberOfHoursWorkedPerMonth;
    }

    public void setNumberOfHoursWorkedPerMonth(int numberOfHoursWorkedPerMonth) {
        this.numberOfHoursWorkedPerMonth = numberOfHoursWorkedPerMonth;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }












}
