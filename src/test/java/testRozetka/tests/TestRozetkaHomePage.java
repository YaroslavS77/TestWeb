package testRozetka.tests;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import testRozetka.pakageObjects.RozetkaCart;
import testRozetka.pakageObjects.RozetkaHomePageElements;
import testRozetka.pakageObjects.RozetkaHomePageHelper;

import java.time.Duration;

import static java.lang.Double.parseDouble;

public class TestRozetkaHomePage extends TestInit {
    @Test
    public void rozetkaTestList(){
        RozetkaHomePageElements rozetkaHomePageElements = new RozetkaHomePageElements(driver);
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        rozetkaHomePageHelper.goToRozetka();
        Assert.assertEquals(rozetkaHomePageElements.getList().size(), rozetkaHomePageElements.getAnimatedList().size());
    }



    @Test
    public void RozetkaTestAddGoods() throws InterruptedException {
        RozetkaHomePageElements rozetkaHomePageElements = new RozetkaHomePageElements(driver);
        RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
        RozetkaCart rozetkaCart = new RozetkaCart(driver);

        rozetkaHomePageHelper.goToRozetka();
        rozetkaHomePageHelper.search("Миша Logitech M171 Wireless Black/Grey");
        rozetkaHomePageElements.getGoods();

        WebElement priceMouseElement = rozetkaHomePageElements.getMousePrice();
        String priceMouseText = priceMouseElement.getText();
        double actualMousePrice = Double.parseDouble(priceMouseText.replace("₴", "").replaceAll("\\s+", ""));

        rozetkaCart.clickBuyButton();
        rozetkaCart.addGoods();

        WebElement priceElement = rozetkaCart.getTotalPrice();
        String priceText = priceElement.getText();
        double actualPrice = Double.parseDouble(priceText.replace("₴", "").replaceAll("\\s+", ""));
        double expectedPrice = actualMousePrice * 3;
        Assert.assertEquals(actualPrice, expectedPrice, "Ціна не відповідає очікуваній");
    }



     @Test
     public void RozetkaTestDevideGoods() throws InterruptedException {
         RozetkaHomePageElements rozetkaHomePageElements = new RozetkaHomePageElements(driver);
         RozetkaHomePageHelper rozetkaHomePageHelper = new RozetkaHomePageHelper(driver);
         RozetkaCart rozetkaCart = new RozetkaCart(driver);

         rozetkaHomePageHelper.goToRozetka();
         rozetkaHomePageHelper.search("Миша Logitech M171 Wireless Black/Grey");
         rozetkaHomePageElements.getGoods();

         WebElement priceMouseElement = rozetkaHomePageElements.getMousePrice();
         String priceMouseText = priceMouseElement.getText();
         double actualMousePrice = Double.parseDouble(priceMouseText.replace("₴", "").replaceAll("\\s+", ""));

         rozetkaCart.clickBuyButton();
         rozetkaCart.addGoods();

         rozetkaHomePageHelper.goToRozetka();
         rozetkaHomePageHelper.search("Samsung S23");
         rozetkaHomePageElements.getAnotherGoods();

         WebElement pricePhoneElement = rozetkaHomePageElements.getPhonePrice();
         String pricePhoneText = pricePhoneElement.getText();
         double actualPhonePrice = Double.parseDouble(pricePhoneText.replace("₴", "").replaceAll("\\s+", ""));

         rozetkaCart.clickBuyButton();
         rozetkaCart.addGoods();

         WebElement priceElement = rozetkaCart.getTotalPrice();
         String priceText = priceElement.getText();
         double actualPrice = parseDouble(priceText.replace("₴", "").replaceAll("\\s+", ""));
         double expectedPrice = (actualMousePrice + actualPhonePrice) * 3;
         Assert.assertEquals(actualPrice, expectedPrice, "Ціна не відповідає очікуваній");

         rozetkaHomePageHelper.goToRozetka();
         rozetkaHomePageElements.clickCartButton();
         rozetkaCart.clickDots();
         rozetkaCart.clickDeleteGoodsButton();


         WebElement priceElementAfterDecrement = rozetkaCart.getTotalPrice();
         String priceTextAfterDecrement = priceElementAfterDecrement.getText();
         double actualPriceAfterDecrement = parseDouble(priceTextAfterDecrement.replace("₴", "").replaceAll("\\s+", ""));
         double expectedPriceAfterDecrement = actualPhonePrice * 3;
         Assert.assertEquals(actualPriceAfterDecrement, expectedPriceAfterDecrement, "Ціна не відповідає очікуваній");
    }


}
