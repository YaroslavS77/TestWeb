package testRozetka.pakageObjects;

import org.openqa.selenium.WebDriver;

public class RozetkaHomePageHelper extends RozetkaHomePageElements {

    public RozetkaHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void goToRozetka(){
        driver.get("https://rozetka.com.ua/");
    }

    public RozetkaHomePageElements search(String objectForSearch) {
        getSearchField().sendKeys(objectForSearch);
        getSearchBtn().click();
        return new RozetkaHomePageElements(driver);
    }
}
