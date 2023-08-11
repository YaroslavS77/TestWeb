package APITest;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static io.restassured.RestAssured.given;

public class TestGetGame{
    @Test
    public void positiveGameTest() {
        Response response = given()
                .baseUri("http://localhost:8080")
                .header("Accept", "application/json")
        .when()
                .get("/app/videogames/2");

        GameModel gameModel = response.as(GameModel.class);

        Assert.assertTrue(gameModel.id == 2);
        Assert.assertTrue(gameModel.name.equals( "Gran Turismo 34"));
        Assert.assertTrue(gameModel.reviewScore == 49);
        Assert.assertTrue(gameModel.rating.equals("hello"));
        Assert.assertTrue(gameModel.releaseDate.equals( "2001-03-10"));
        Assert.assertTrue(gameModel.category.equals("Driving"));
    }
}
