import java.util.EnumSet;

public enum MyFamily {

        JASMINE, KYRIE, TYREIK
}

class Main10 {
    public static void main(String[] args) {
        MyFamily[] families = MyFamily.values();
        for (MyFamily member : families) {

            System.out.println(member);
        }

        for(MyFamily families2 : EnumSet.range(MyFamily.JASMINE,MyFamily.TYREIK)){
            System.out.println(families2);
        }




    }
}
