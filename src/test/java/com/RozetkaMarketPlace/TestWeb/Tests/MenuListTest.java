package com.RozetkaMarketPlace.TestWeb.Tests;
import com.RozetkaMarketPlace.TestWeb.PakageObjects.HomePageHelper;
import com.RozetkaMarketPlace.TestWeb.PakageObjects.MenuListElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuListTest extends TestInit{
    @Test
    public void testLists(){
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        MenuListElements menuListElements = new MenuListElements(driver);
        homePageHelper.goToRozetka();
        Assert.assertEquals(menuListElements.getStaticList().size(), menuListElements.getAnimatedList().size());
    }
}
