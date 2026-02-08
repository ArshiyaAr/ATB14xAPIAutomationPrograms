package com.thetestingacademy.ex_05_TestNGAdvancedExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting018_TestNG_Groups {

    @Test(groups = {"sanity","reg"})
    public void test_sanityRun() {
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test(groups = {"reg"})
    public void test_regRun() {
        System.out.println("Reg");
        Assert.assertTrue(false);
    }

    @Test(groups = {"smoke"})
    public void test_smokeRun() {
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
