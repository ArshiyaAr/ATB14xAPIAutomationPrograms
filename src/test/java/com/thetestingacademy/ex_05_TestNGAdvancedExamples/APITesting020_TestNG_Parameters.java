package com.thetestingacademy.ex_05_TestNGAdvancedExamples;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting020_TestNG_Parameters {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("i am a demo");
        System.out.println("you are running this param");

        if(value.equalsIgnoreCase("firefox")){
            System.out.println("start the firefox");
        }

        if(value.equalsIgnoreCase("chrome")){
            System.out.println("start the chrome");
        }

    }
}
