class MyMath {

    int age;
    public static final int MIN_AGE = 5;
    public static final int MAX_AGE = 100;


public MyMath(int ageOfPerson){
    age = ageOfPerson;

}

    //smaller
    public static int min(int x, int y){

        return Math.min(x,y);
    }
    //larger
    public static int max(int x, int y){
        return Math.max(x,y);
    }


    public static boolean isAgeRange(int age){
        return age >= MIN_AGE && age <= MAX_AGE;
    }
}
