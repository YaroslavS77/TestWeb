package com.RozetkaMarketPlace.TestWeb.Tests;
import com.RozetkaMarketPlace.TestWeb.PakageObjects.HomePageElements;
import com.RozetkaMarketPlace.TestWeb.PakageObjects.HomePageHelper;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainPageTest extends TestInit{
    private static final Logger logger = Logger.getLogger(MainPageTest.class);
    @Test
    public void testMainPage(){
        logger.info("TEST");
        HomePageElements homePageElements = new HomePageElements(driver);
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        homePageHelper.goToRozetka();
        Assert.assertTrue(homePageElements.getLogo().isDisplayed(), "Logo is not displayed on the page");
    }

    @Test
    public void testSearchField(){
        logger.info("TEST");
        HomePageElements homePageElements = new HomePageElements(driver);
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        homePageHelper.goToRozetka();
        Assert.assertTrue(homePageElements.getSearchField().isDisplayed(), "Search field is not displayed on the page");

    }


}