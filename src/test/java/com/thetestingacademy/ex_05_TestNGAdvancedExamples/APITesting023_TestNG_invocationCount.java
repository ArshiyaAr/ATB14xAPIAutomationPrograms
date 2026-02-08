package com.thetestingacademy.ex_05_TestNGAdvancedExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting023_TestNG_invocationCount {

    @Test(invocationCount = 2)
    public void test1(){
        System.out.println("hi");
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void test2(){
        System.out.println("bye");
        Assert.assertTrue(true);
    }

    @Test(invocationCount = 3)
    public void test3(){
        Assert.assertTrue(true);
    }
}
