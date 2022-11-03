package personnel;

import gov.irs.TaxPayer;

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
        this.rate = rate;
        this.hours = hours;

    }

    //both pay methods are ovrride because hourly and salary employee uses same method
    @Override
    public void pay(){
        System.out.println( getName() + " is paid hourly " + (getRate() * getHours()));
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                //shows name hiredate
                super.toString() +
                "rate=" + rate +
                ", hours=" + hours +
                '}';
    }
}
