package TestWeb.PakageObjects;

import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HomePageElements{
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public void goToComfy(){
        driver.get("https://comfy.ua");
    }

    public HomePageElements search(String objectForSearch){
        getSearchField().sendKeys(objectForSearch);
        return new HomePageElements(driver);
    }
}
