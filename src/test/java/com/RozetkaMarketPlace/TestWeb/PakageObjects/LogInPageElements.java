package com.RozetkaMarketPlace.TestWeb.PakageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageElements extends BasePage{
    public LogInPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailOrPhoneField(){
        return findElementByXpath("//input[@id = 'auth_email']");
    }

    public WebElement getPasswordField(){
        return findElementByXpath("//input[@id = 'auth_pass']");
    }

    public WebElement getEnterBtn(){
        return findElementByXpath("//button[contains(@class, 'auth-modal__submit ng-star-inserted')]");
    }

    public WebElement getRegisterBtn(){
        return findElementByXpath("//button[contains(@class, 'auth-modal__register-link')]");
    }
}
