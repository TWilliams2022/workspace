package test;

import DogType.Dogs;

public class DogsValidationTest {
    public static void main(String[] args) {
        try {
            Dogs dog2 = new Dogs(2, "Greenville, SC", "Brown");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR " + e);
        }
    }
}
