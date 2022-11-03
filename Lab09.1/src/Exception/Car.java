package Exception;

import java.sql.SQLException;

class Employee {
    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public void goToWork() throws SQLException {
        Car c = new Car("ABC123");
        c.moveTo("Mars");
        System.out.println("Arrived to work!");
    }
}

class Car {
    private final String vin;

    public Car(String vin) {
        this.vin = vin;
    }

    public void moveTo(String location) throws SQLException //, MyOwnCheckedException
    {
        Car c = new Car("ABC123");
        try {
            c.moveTo("Moon");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("I dealt with IllegalArgumentException");
        } catch (SQLException sqlException) {
            System.out.println("I also handled SQL Exception");
        }
        System.out.println("Arrived at work");
    }
}

//    {
//        if (location.equals("Mars")) {
//            throw new IllegalArgumentException("Can't get to " + location);
//            // throw new SQLException("Can't get to  " + location);
//        } else if (location.equals("Moon")) {
//            throw new SQLException("Can't get to" + location);
//        }
//    }


class Main {
    public static void main(String[] args) throws SQLException //throws SQLException
    {
        Employee employee = new Employee("Tyreik");
        employee.goToWork();
        System.out.println("DONE!");
    }

}
