public class Debugging {
    public int someMethod(int argument){

        var counter = 0;

        for(int i = 0; i < argument; i++){
            System.out.println(i);
            counter++;
        }
        return counter+2;
    }
}

class Main11{
    public static void main(String[] args) {
        Debugging debug = new Debugging();

    }

}