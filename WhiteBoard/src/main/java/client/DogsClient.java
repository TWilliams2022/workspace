package client;

import DogType.Dogs;

//------Main Method is where you assign those values and add your own
//write a client class (with a main() method) that creates a few instances (#9,#14,#19) of your business class,
// sets their properties, and invokes some of their methods.
// This client main-class should be named after your business class, with a "Client"
public class DogsClient {
    public static void main(String[] args) {

        //instances created
        try {
            Dogs dog = new Dogs(6, "Columbia", "red");
            dog.ageNow();
            dog.colorNow();
            dog.originNow();
            System.out.println();
            Dogs dog3 = new Dogs(12, "Greenville", "black");
            dog3.ageNow();
            dog3.colorNow();
            dog3.originNow();
            System.out.println();
            Dogs dog4 = new Dogs(3, "Charleston", "green");
            dog4.ageNow();
            dog4.colorNow();
            dog4.originNow();
        } catch (Exception e) {
            System.out.println("Done");
        }
    }
}
