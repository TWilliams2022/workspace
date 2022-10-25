package com.entertainment;

public class Television {

    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    //instance variable - FIELDS
    String brand = "Toshiba";
    int volume = 23;
    boolean muted;
    private int oldVolume;
    TelevisionDisplayType display = TelevisionDisplayType.valueOf("LED");


    //default constructor
    public Television() {

    }

    //Constructors - helps take away ex. tv1.setVolume so that i can put in the argument
    public Television(String brand, int volume) {
        this.brand = brand;
        this.volume = volume;
    }

    public Television(String brand, int volume, TelevisionDisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // business methods
    public void turnOn() {
        System.out.println("Hello User :) welcome to your new " + brand + " the volume is set to " + volume);
        //instructions----
        boolean isConnected = verifyInternetConnection();
    }


    public void turnOff() {
        System.out.println("Goodbye User :(");
    }

    public void mute() {
        if (!muted) {
            //setOldVolume is used to set current volume so that
            //we can then change our volume to what it was before it was muted.
            this.setOldVolume(this.volume); // this.volume is whatever my set volume is.
            this.volume = 0;
            this.muted = true;
        } else if (muted) {
            //this.volume is changing back to oldVolume
            this.volume = oldVolume;
            this.muted = false;
        }
        System.out.println("The volume is " + this.volume + " Muted status: " + this.muted);
    }

    //accessor methods
    public void setBrand(String brand) {
        if (brand.equalsIgnoreCase("samsung") || brand.equalsIgnoreCase("toshiba") || brand.equalsIgnoreCase("sony") || brand.equalsIgnoreCase("lg")) {
            this.brand = brand;
        } else {
            System.out.println("ERROR UNKNOWN TV");
        }

    }

    public void setVolume(int volume) {

        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        } else {
            System.out.println("ERROR");
        }
    }

    public boolean isMuted() {
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public int getOldVolume() {
        return oldVolume;
    }

    public void setOldVolume(int oldVolume) {
        this.oldVolume = oldVolume;
    }

    public TelevisionDisplayType getDisplay() {
        return display;
    }

    public void setDisplay(TelevisionDisplayType display) {
        this.display = display;
    }

    // instructions---------------------------------
    private boolean verifyInternetConnection() {
        return true;
    }

    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", volume=" + volume +
                ", muted=" + muted +
                ", oldVolume=" + oldVolume +
                ", display=" + display +
                '}';
    }
}

