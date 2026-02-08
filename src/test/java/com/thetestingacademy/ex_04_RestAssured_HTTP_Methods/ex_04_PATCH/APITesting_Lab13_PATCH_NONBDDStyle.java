package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.ex_04_PATCH;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab13_PATCH_NONBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_PATCH_NON_BDD_STYLE(){

        String token = "ae2b5738479d484";
        String bookingID = "1";

        Faker faker = new Faker();

        //String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory

        String payloadPATCH = "{\n" +
                "    \""+firstName+"\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        //DIVIDE YOUR PROGRAM INTO 3 PARTS
        //GIVEN - PART1
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" +bookingID);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        //r.auth().basic("username" , "password123"); use auth or cookie
        r.body(payloadPATCH).log().all();

        //WHEN - PART2
        response = r.when().log().all().patch();
        System.out.println(response.asString());

        //THEN - PART3
        vr = response.then().log().all();
        vr.statusCode(200);

        //write further test cases or assertions also here

    }
}
