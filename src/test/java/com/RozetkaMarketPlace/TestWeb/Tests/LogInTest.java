package com.RozetkaMarketPlace.TestWeb.Tests;
import com.RozetkaMarketPlace.TestWeb.PakageObjects.HomePageElements;
import com.RozetkaMarketPlace.TestWeb.PakageObjects.HomePageHelper;
import com.RozetkaMarketPlace.TestWeb.PakageObjects.LogInPageElements;
import com.RozetkaMarketPlace.TestWeb.PakageObjects.LogInPageHelper;
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
        logInPageHelper.enterEmailOrPhone("0662098316");
        logInPageHelper.enterPassword("Semen002");
        logInPageElements.getEnterBtn().click();
    }
}
