package com.RozetkaMarketPlace.TestWeb.PakageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends BasePage {
    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogo() {
        return waitElementToBeClickable("//img[@alt = 'Rozetka Logo']");
    }

    public WebElement getSearchField() {
        return findElementByXpath("//input[@name = 'search']");
    }

    public WebElement getSearchBtn(){
        return findElementByXpath("//button[contains(@class, 'header-search-form__btn--submit')]");
    }

    public WebElement getLogInBtn(){
       return findElementByXpath("(//button[@class = 'header__button ng-star-inserted'])[1]");
    }

}
