package Inheritance2;

public class Department {

    private String departmentName;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public Department(String departmentName, Employee[] employees) {
        this.departmentName = departmentName;
        employees = employees;
    }

    public void addEmployeeE(Employee employee) {
        employees[currentIndex++] = employee;
    }

    public void listAllEmployees(){
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i].toString());
        }
    }




}
