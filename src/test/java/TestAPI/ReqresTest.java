package TestAPI;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ReqresTest {
    private final static String URL = "https://reqres.in/";
    @Test
    public void testId(){
        List<UserData> users = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
    }
}