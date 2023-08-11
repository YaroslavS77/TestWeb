package testRozetka.pakageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class RozetkaCart extends BasePage {
    public RozetkaCart(WebDriver driver) {
        super(driver);
    }

    public void clickBuyButton() {
        findElementByXpath("//button[contains(@class, 'buy-button--tile ng-star-inserted')]").click();
    }

    public void addGoods() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            findElementByXpath("//button[contains(@aria-label, 'Додати ще один товар')]").click();
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@aria-label, 'Додати ще один товар')]")));
            sleep(1500);
        }
    }

    public WebElement getTotalPrice() {
        return findElementByXpath("//div[contains(@data-testid, 'cart-receipt-sum')]");
    }

    public void clickDots(){
        findElementByXpath("//button[contains(@id, 'cartProductActions1')]").click();
    }

    public void clickDeleteGoodsButton() throws InterruptedException {
        findElementByXpath("//button[contains(@class, 'button--medium button--with-icon button--link')]").click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'button--medium button--with-icon button--link")));
        sleep(1000);
    }

}
