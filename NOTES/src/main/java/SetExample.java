import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        //SET - NO DUPLICATES ALLOWED
        Set<String> cities = new HashSet<>();
        cities.add("South Carolina");
        cities.add("Georgia");
        cities.add("Florida");
        boolean georgia = cities.add("Georgia");
        System.out.println(georgia);

        //LIST<STRING> allows duplicate
        List<String> states = new ArrayList<>();
        states.add("WA");
        states.add("SC");
        states.add("WA");
        states.add("FL");
        states.add("VA");
        System.out.println(states);

        System.out.println("");

        //this changes it back to no duplicates
        Set<String> statesAsASet = new HashSet<>(states);
        System.out.println(statesAsASet);

        if (new Integer(10) > new Integer(4)) {
            System.out.println("10 is greater");
        }

        boolean b1 = new Integer(10) > new Integer(4);
        int b2 = new Integer(10).compareTo(new Integer(4));
        int b3 = new String("abc").compareTo(new String("xyz"));

    }
}
