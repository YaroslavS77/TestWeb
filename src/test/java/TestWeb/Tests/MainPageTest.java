package TestWeb.Tests;
import TestWeb.PakageObjects.HomePageElements;
import TestWeb.PakageObjects.HomePageHelper;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest extends TestInit{
    @Test
    public void testMainPage(){
        HomePageElements homePageElements = new HomePageElements(driver);
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        homePageHelper.goToRozetka();
        Assert.assertTrue(homePageElements.getLogo().isDisplayed(), "Logo is not displayed on the page");
    }

    @Test
    public void testSearchField(){
        HomePageElements homePageElements = new HomePageElements(driver);
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        homePageHelper.goToRozetka();
        Assert.assertTrue(homePageElements.getSearchField().isDisplayed(), "Search field is not displayed on the page");
    }
}