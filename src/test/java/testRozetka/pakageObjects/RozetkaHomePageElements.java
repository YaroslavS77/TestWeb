package testRozetka.pakageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RozetkaHomePageElements extends BasePage{
    public RozetkaHomePageElements(WebDriver driver){

        super(driver);
    }

    public WebElement getSearchField(){

        return findElementByXpath("//input[contains(@name, \"search\")]");
    }


    public WebElement getSearchBtn(){
        return findElementByXpath("//button[contains(@class, 'button button_color_green')]");
    }

    public List<WebElement> getList(){
        return findElementsByXpath("//ul[contains(@class, 'menu-categories_type_main')]/li/a/span");
    }

    public List<WebElement> getAnimatedList(){
        return findElementsByXpath("//ul[contains(@class, 'menu-categories ng-star-inserted')]/li/a/span");
    }

    public void getGoods(){
        findElementByXpath("//div[contains(@data-goods-id, '7111684')]").click();
    }

    public void getAnotherGoods() {
        findElementByXpath("//div[contains(@data-goods-id, '365696184')]").click();
    }

    public void clickCartButton(){
        findElementByXpath("//button[contains(@class, 'main-notification__cart-link')]").click();
    }

    public WebElement getMousePrice(){
        return findElementByXpath("//p[contains(@class, 'product-price__big')]");
    }

    public WebElement getPhonePrice(){
        return findElementByXpath("//p[contains(@class, 'product-price__big-color-red')]");
    }
}
