package CompositionExamples;

import jdk.swing.interop.SwingInterOpUtils;

public class Employee {
    private String name;

    private double salary;

    private Address address;

    public Employee(String name, double salary, Address address) {
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    //returns all employee info including address
    //I can call this
    public String getEmployeeInfo(){
        return "Employee Info | NAME: " + getName() + " | SALARY: " + getSalary() + " | ADDRESS: " + address.getAddressInfo();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //Create client class in which you 1
    // "getEmployeeInfo()" method and display the result 3

    static class EmployeeClient{
        public static void main(String[] args) {

            // create a couple of "Employee" objects and  2
            // new Adress() because it is a object
            Employee employee1 = new Employee("Tyreik", 82.23, new Address("Columbia - ", "USA"));

            //called getEmployeeInfo() from LINE 20
            System.out.println(employee1.getEmployeeInfo());

            // "getEmployeeInfo()" method and display the result 3


        }



    }
}
