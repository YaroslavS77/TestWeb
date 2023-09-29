package com.RozetkaMarketPlace.TestAPI;

import com.RozetkaMarketPlace.SecondApiTest.ReUsableMethods;
import com.RozetkaMarketPlace.TestAPI.API_Files.PayLoad;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class AddPlaceAPITest {
    @Test
    public void addNewPlace () throws IOException {
        RestAssured.baseURI="https://rahulshettyacademy.com";
        String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body(PayLoad.addPlace())
                .when().post("/maps/api/place/add/json")
                .then().statusCode(200).body("scope", equalTo("APP"))
                .header("server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();
        System.out.println(response);
        JsonPath js = new JsonPath(response);
        String placeId = js.getString("place_id");
        System.out.println(placeId);

        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body(new String (Files.readAllBytes(Paths.get("/Users/yaroslavsemenchenko/Downloads/Library+API.postman_collection.json"))))
                .when().put("/maps/api/place/update/json")
                .then().assertThat().log().all().statusCode(200);

        String getNewAddress = given().log().all().queryParam("key", "qaclick123")
                .queryParam("place_id", placeId)
                .when().get("/maps/api/place/get/json")
                .then().assertThat().log().all().statusCode(200).extract().response().asString();
        JsonPath jsonPath = ReUsableMethods.rawToJson(getNewAddress);

        JsonPath json = new JsonPath(getNewAddress);
        String actualAddress = json.getString("address");
        System.out.println(actualAddress);
    }


}