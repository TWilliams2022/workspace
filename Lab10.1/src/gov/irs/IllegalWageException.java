package gov.irs;

public class IllegalWageException extends Throwable {
    public IllegalWageException(){

    }

    public IllegalWageException(String message){

        System.out.println("Illegal Wages!");
    }

}
