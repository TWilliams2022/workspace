package com.entertainment.client;

import com.entertainment.Television;

//CLIENT-SIDE CODE
class TelevisionClient {

    public static void main(String[] args) {

        //pulls instance that has DATA from The ORIGINAL CLASS OF TELEVISION!!!
        Television tv = new Television("LG", 100);
        //creating my own properties/data/values from the instance.. can create more if I have extra TV's..

        //THE PURPOSE OF THE CONSTRUCTOR IS TO TAKE AWAY THE these at the bottom
        // tv.setBrand("LG");
        // tv.setVolume(100);
        tv.turnOff();
        tv.turnOn();
        System.out.println(tv);

        System.out.println();

        Television tv2 = new Television("Sony", 14);

        //tv2.setBrand("Sony");
        //tv2.setVolume(14);
        tv2.turnOff();
        tv2.turnOn();

        System.out.println(tv2);
    }

}
