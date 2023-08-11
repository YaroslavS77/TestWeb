package APITest;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;

public class SoftAssertExample{
    public static void main(String[] args) {
        SoftAssert softAssert = new SoftAssert();
        int actualVallue = 10;
        int expectVallue = 10;

        softAssert.assertEquals(actualVallue, expectVallue, "no match");

        softAssert.assertAll();
    }
}
