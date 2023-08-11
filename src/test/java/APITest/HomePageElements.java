package APITest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends BasePage{
    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public void goToSite(){
        driver.get("https://google.com");
    }

    public WebElement getSearchField(){
        return findElementByXpath("//textarea[contains(@class, 'gLFyf')]");
    }
}
