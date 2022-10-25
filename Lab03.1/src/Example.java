public class Example {
    public static void main(String[] args)
    {
        // Initial values
        int a = 5; //0101
        int b = 7; //0111
        int c = 3;
        int d = 5;

        // bitwise and
        // 0101 & 0111=0101 = 5
        System.out.println("a&b = " + (a & b));

        // bitwise or
        // 0101 | 0111=0111 = 7
        System.out.println("a|b = " + (a | b));

        //bitwise &
        System.out.println("c&d = " + (c & d));

        //bitwise |
        System.out.println("c|d = " + (c | d));

    }
}