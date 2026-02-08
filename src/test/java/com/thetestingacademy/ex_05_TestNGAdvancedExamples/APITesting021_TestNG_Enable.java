package com.thetestingacademy.ex_05_TestNGAdvancedExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting021_TestNG_Enable {

    @Test
    public void test1(){
        Assert.assertTrue(true);
    }

    @Test(enabled = false)
    public void test2(){
        Assert.assertTrue(true);
    }

    @Test
    public void test3(){
        Assert.assertTrue(true);
    }
}
