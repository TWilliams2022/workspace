import java.util.Locale;

public class StringMethodExample {

    public static void main(String[] args) {
        //Exercise contains(...) method
        String testString = "hello world";
        boolean containsTheseLetters = testString.contains("wor");
        System.out.println(" " + containsTheseLetters);
        boolean xyz = testString.contains("xyz");
        System.out.println(xyz);

        //exercise endsWith(..) method

        String endsWithThis = "I am a string!";
        boolean iContainS = endsWithThis.endsWith("!");
        System.out.println("It ends with !? - " + iContainS);

        //equals to another string

        String string = "equal";
        String anotherString = "equal";
        boolean areTheyEqual = anotherString.equals(string);
        System.out.println( "Are they equal? - " + areTheyEqual);

        //equals ignore casing
        String string1 = "equal";
        String anotherString1 = "EQUAL";
        boolean areTheyEqual1 = anotherString1.equalsIgnoreCase(string1);
        System.out.println( "Are they equal even though their casing is different? - " + areTheyEqual1);

        //indexOf a string
        String indexOfThisString = "Will you be able to find me?";
        System.out.println(indexOfThisString.indexOf("find"));

        //length
        String indexOfThisString2 = "What is the length of this string";
        System.out.println(indexOfThisString.length());

        //        *************************************************************************
        //split(String regex) COME BACK TO
        String string3 = "Tyreik Williams";
        String[] arrayMyString3 = string3.split("k", 2);
        System.out.println(arrayMyString3);
        //        *************************************************************************

        System.out.println();

        //startsWith
        String itStartsWith = "Jasmine";
        System.out.println(itStartsWith.startsWith("Jasmi"));
        System.out.println(itStartsWith.startsWith("ne"));

        //Strip -- strips white space
        String stripTheWhiteSpaces = "     Hello from another planet ! ! ! !    ";
        System.out.println(stripTheWhiteSpaces.strip());

        //Substring
        //1 must initialize string
        String string0 = "Hello From Another Planet";
        //2 .substring() extracts the substring
        System.out.print("I've extracted from 6 and the extracted substring is : " + string0.substring(6));
        //starts at 6 without white spaces, which is F - and continues the sentence.

        System.out.println();

        //toLowerCase
        String itStartsWith2 = "Jasmine";
        String lowerCaseMeToo = itStartsWith;
        System.out.println(lowerCaseMeToo.toLowerCase());

        //toUpperCase
        String itStartsWith3 = "Jasmine";
        String upperCaseMeToo = itStartsWith;
        System.out.println(upperCaseMeToo.toUpperCase());



    }

}
