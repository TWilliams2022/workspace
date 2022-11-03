package ExceptionTest;

public class CustomDogException extends Throwable {
    public CustomDogException(){
        System.out.println("Errors!!!!");
    }

    public CustomDogException(String message){

        System.out.println("Illegal Wages!");
    }

}
