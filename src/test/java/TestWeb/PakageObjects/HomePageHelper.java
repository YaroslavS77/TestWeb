package TestWeb.PakageObjects;

import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HomePageElements{
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void goToRozetka(){
        driver.get("https://rozetka.com.ua");
    }

    public HomePageElements search(String objectForSearch){
        getSearchField().sendKeys(objectForSearch);
        return new HomePageElements(driver);
    }
}
