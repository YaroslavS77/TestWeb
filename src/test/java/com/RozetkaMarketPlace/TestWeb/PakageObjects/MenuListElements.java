package com.RozetkaMarketPlace.TestWeb.PakageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuListElements extends BasePage{
    public MenuListElements(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getStaticList(){
        return findElementsByXpath("//ul[contains(@class, 'menu-categories_type_main')]/li");
    }

    public List<WebElement> getAnimatedList(){
        return findElementsByXpath("//ul[contains(@class, 'menu-categories ng-star-inserted')]/li");
    }
}
