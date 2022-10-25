package com.entertainment.client;

import com.entertainment.Television;
import com.entertainment.TelevisionDisplayType;

class TelevisionValidationTests{

    public static void main(String[] args) {

            Television tv9 = new Television();
            Television tv10 = new Television("sony", 10, TelevisionDisplayType.OLED);
            tv9.setVolume(0);
            System.out.println(tv9);
            System.out.println();
            System.out.println(tv10);

            tv9.setVolume(100);
            System.out.println(tv9);

            System.out.println();
            tv9.setVolume(-1);
            tv9.setVolume(101);


            tv9.setBrand("SAMSUNG"); //should stick
            System.out.println(tv9);
            tv9.setBrand("LG"); //should stick
            System.out.println(tv9);
            tv9.setBrand("SONY"); //should stick
            System.out.println(tv9);
            tv9.setBrand("TOSHIBA"); //should stick
            System.out.println(tv9);
            tv9.setBrand("INVALID"); //ERROR MESSAGE



            tv9.mute();
            tv9.mute();

            Television tv11 = new Television("sony", 10, TelevisionDisplayType.LCD);

    }


}