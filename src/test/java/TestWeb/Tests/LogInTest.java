package TestWeb.Tests;
import TestWeb.PakageObjects.HomePageElements;
import TestWeb.PakageObjects.HomePageHelper;
import TestWeb.PakageObjects.LogInPageElements;
import TestWeb.PakageObjects.LogInPageHelper;
import org.testng.annotations.Test;

public class LogInTest  extends TestInit{
    @Test
    public void testLogIn() throws InterruptedException {
        LogInPageElements logInPageElements = new LogInPageHelper(driver);
        LogInPageHelper logInPageHelper = new LogInPageHelper(driver);
        HomePageElements homePageElements = new HomePageElements(driver);
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        homePageHelper.goToRozetka();
        homePageElements.getLogInBtn().click();
        logInPageHelper.enterEmailOrPhone("0443443434");
        logInPageHelper.enterPassword("1111");
        logInPageElements.getEnterBtn().click();
    }
}
