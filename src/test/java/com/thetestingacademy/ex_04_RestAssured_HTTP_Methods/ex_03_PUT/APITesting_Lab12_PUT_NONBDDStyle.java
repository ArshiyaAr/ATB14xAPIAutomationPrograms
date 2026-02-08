package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.ex_03_PUT;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab12_PUT_NONBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    public void test_PUT_NON_BDD_STYLE(){

        String token = "6243c191425a4f9";
        String bookingID = "1";

        Faker faker = new Faker();

        //String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory

        String payload = "{\n" +
                "    \"firstname\" : \"" +firstName+"\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        //DIVIDE YOUR PROGRAM INTO 3 PARTS
        //GIVEN - PART1
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" +bookingID);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        //r.auth().basic("username" , "password123"); use auth or cookie
        r.body(payload).log().all();

        //WHEN - PART2
        response = r.when().log().all().put();
        System.out.println(response.asString());

        //THEN - PART3
        vr = response.then().log().all();
        vr.statusCode(200);

        //write further test cases or assertions also here

    }
}
