package personnel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    // creating array list
//collection of String, or Employee, or whatever.. specifying the type
    static private List<Employee> myCollection
            = new ArrayList<>();

    static private List myCollectionNotUsingGenerics
            = new ArrayList();

    static private List<String> names = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        //var integers = new ArrayList<Integer>(); - the same as top -


        myCollection.add(new Employee("Tyreik", LocalDate.of(1990, 1, 4)));

        myCollectionNotUsingGenerics.add(new String("Test"));

        names.add("Tyreik"); //index 0
        names.add("Kyrie"); //index 1
        System.out.println(names);
        //or
        // can add index as well
        names.add(1, "Jasmine");
        System.out.println(names);
        //removes whatever is in that space
        names.set(1,"TY");
        System.out.println(names);

        //getting index of 0
        String name = names.get(0);
        System.out.println(name);

        //checking size
        System.out.println(names.size());

    }
}
