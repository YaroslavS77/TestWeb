package com.RozetkaMarketPlace.SecondApiTest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestDynamicJson {
    @Test(dataProvider = "ArrayBooksData")
    public void addBook(String isbn, String aisle){
        RestAssured.baseURI="http://216.10.245.166";

        String responsePost =  given().log().all().header("Content-Type", "application/json")
                .body(ApiResources.addBookJson(isbn, aisle))
                .when().post("/Library/Addbook.php")
                .then().log().all().assertThat().statusCode(200)
                .extract().response().asString();
        JsonPath jsonPathResponse = ReUsableMethods.rawToJson(responsePost);
        String id = jsonPathResponse.getString("ID");
        System.out.println(id);
    }

    @DataProvider(name="ArrayBooksData")
    public Object[][] getDataFromLibrary(){
        return new Object[][] {{"hdjfk", "5655"},{"hdjsf", "8988"},{"dkjfsk", "7774"}};
    }
}
