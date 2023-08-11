package engineeringClubProject.packageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends BasePage{


    public GoogleHomePage(WebDriver driver){
        super(driver);
    }
    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//textarea[contains(@class, 'gLFyf')]"));
    }

    public WebElement clickGoogleBtn() {
        return driver.findElement(By.xpath("//a[contains(@class, 'gb_v') and contains(@aria-label, 'Пошук зображень')]"));
    }
}
