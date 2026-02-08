package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.ex_01_GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab09_GET_NONBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;

    @Test
    public void test_GET_NON_BDD_STYLE(){

        pincode = "560049";

        //DIVIDE YOUR PROGRAM INTO 3 PARTS
        //GIVEN - PART1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/IN/" +pincode);

        //WHEN - PART2
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //THEN - PART3
        vr = response.then().log().all();
        vr.statusCode(200);

        //write further test cases or assertions also here

    }
}
