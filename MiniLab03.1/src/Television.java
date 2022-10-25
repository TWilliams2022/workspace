/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

class Television {
    private static int instanceCount = 0;
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int volume;
    private String brand;


    public Television() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public Television(String brand){
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        //this() is calling the above constructor.. which will make the instance count increase here!
       this(brand);
        setVolume(volume);
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        Television.volume = volume;
    }

    public String toString() {
        return "Television: brand=" + getBrand() + ", volume=" + getVolume();
    }
}