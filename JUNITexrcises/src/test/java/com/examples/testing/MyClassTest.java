package com.examples.testing;

import org.junit.Assert;
import org.junit.Test;


    public class MyClassTest {

        @Test
        public void ConvertToUpperCase_Return_To_Upper_String() {
            //create object instance of MyClass
            MyClass myClassObject = new MyClass();
           // Create String to convert  //call the method of MyClass //HERE
            String upperCasedString = myClassObject.convertToUpperCase("Hello");
           //Check work
            Assert.assertEquals("HELLO", upperCasedString);
        }
    }

