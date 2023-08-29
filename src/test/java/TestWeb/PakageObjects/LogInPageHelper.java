package TestWeb.PakageObjects;

import org.openqa.selenium.WebDriver;

public class LogInPageHelper extends  LogInPageElements{
    public LogInPageHelper(WebDriver driver) {
        super(driver);
    }

    public HomePageElements enterEmailOrPhone(String objectForEnterEmailOrPhone){
        getEmailOrPhoneField().sendKeys(objectForEnterEmailOrPhone);
        return new HomePageElements(driver);
    }

    public HomePageElements enterPassword(String objectForPassword){
        getPasswordField().sendKeys(objectForPassword);
        return new HomePageElements(driver);
    }
}
