package NewFrameworkTest.PakageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends BasePage {
    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return findElementByXpath("//input[contains(@name, 'q')]");
    }

    public WebElement getSearchBtn(){
        return findElementByXpath("//button[contains(@class, 'header-search-form__btn--submit')]");
    }


}
