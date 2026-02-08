package com.thetestingacademy.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab05_MultipleTestcases {
    public static void main(String args[]) {
        String pincode = "110048";
        RestAssured
                .given()
                       .baseUri("https://api.zippopotam.us/")
                       .basePath("/IN/"+pincode).log().all()
                .when()
                       .get()
                .then()
                       .log().all().statusCode(200);


        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/"+pincode).log().all()
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        pincode = "";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/"+pincode).log().all()
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
