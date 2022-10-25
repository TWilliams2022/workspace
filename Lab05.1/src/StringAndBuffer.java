public class StringAndBuffer {
    public static void main(String[] args) {
        String msg = "Hello";
        System.out.println(msg);
        String upperCaseMe = msg.toUpperCase();
        System.out.println(upperCaseMe);

        System.out.println("new under");

        String msg1 = "hello";
        String msg2 = "hello";
        boolean equals = msg1.equals(msg2);

        //will be true because same data and same type
        System.out.println(equals);

        //will return false
        boolean b = msg1 == msg2;
        System.out.println(b);

        //String BUFFER
            String x = "1500" + " " + "Orangeburg";
//            String x2 = new StringBuffer(100)
//                    .append("20");


    }
}
