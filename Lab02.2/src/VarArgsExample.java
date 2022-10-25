public class VarArgsExample {
    public static void main(String[] args) {
        myVarArgsMethod("Jasmine", "Kyrie");
        myVarArgsMethod("Tyreik", "Markel");
        myVarArgsMethod("Tyreik", "Markel", "Tieshia", "Mike");

    }

    private static void myVarArgsMethod(String name, String... friends){
        for (String friend : friends) {
            System.out.println(friend + " ");
        }

    }

}
