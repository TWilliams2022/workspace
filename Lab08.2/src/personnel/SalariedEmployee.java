//package personnel;
//
//import java.time.LocalDate;
//
//public class SalariedEmployee extends Employee {
//    //fields
//    double salary;
//
//    //ctor
//    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
//        super(name, hireDate);
//        this.salary = salary;
//    }
//
//    public SalariedEmployee() {
//
//    }
//
//    @Override
//    public void pay(){
//        System.out.println( getName() + " is paid salary " + salary);
//    }
//
//
//
//    @Override
//    public String toString() {
//        //calling super to string to remove redundancy
//        //the super toString is pull from parents to string
//        return  super.toString() + "SalariedEmployee{" +
//                "salary=" + salary +
//                '}';
//    }
//
//}
