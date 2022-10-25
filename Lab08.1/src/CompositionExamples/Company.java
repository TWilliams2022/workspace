package CompositionExamples;

import java.util.Arrays;

public class Company {
    private String companyName;
    //already initalized so there isn't a need to be a constructi
    private Employee[] employees = new Employee[100];

    //CONSTRUCTORS
    public Company(String companyName) {
        this.companyName = companyName;

    }

    //business methods
    public void addEmployee(Employee employee){
//logic to help us
        for (int i = 0; i < employees.length ; i++) {
            if (employees[i] == null){
                employees[i] = employee;
            }
        }
        System.out.println(employees);
    }

    public double computeTotalSalaryOfAllEmployees(){
        double total = 0.0;
        for (Employee employee : employees) {
           total += employee.getSalary();
        }
        return total;
    }

    //accessor methods
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}

class CompanyClient {
    public static void main(String[] args) {

        Company obj = new Company("T-MOBILE");
        System.out.println(obj.getCompanyName());
        Employee obj2 = new Employee("Tyreik", 82.23, new Address("Columbia -", "USA"));
        System.out.println(obj2.getEmployeeInfo());

    }
}