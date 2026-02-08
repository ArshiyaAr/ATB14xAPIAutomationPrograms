package com.thetestingacademy.ex_04_RestAssured_HTTP_Methods.ex_02_POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab11_POST_NonBDDStyle {

    @Test
    public void test_POST_NonBDDStyle_Create_AUTH_TOKEN(){

        RequestSpecification r;
        Response response;
        ValidatableResponse vr;

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        r = RestAssured.given();
                r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/auth").contentType(ContentType.JSON);
                r.log().all();
                r.body(payload);

                response = r.when().log().all().post();
                
                vr = response.then().log().all();
                vr.statusCode(200);
    }
}
