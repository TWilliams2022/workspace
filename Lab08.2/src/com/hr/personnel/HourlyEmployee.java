package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
//fields
    double rate;
    double hours;

    //business methods
    public HourlyEmployee() {
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        setName(name);
        setHireDate(hireDate);

    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "name=" + getName() +
                "hireDate" + getHireDate() +
                "rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
