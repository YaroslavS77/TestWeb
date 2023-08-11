package engineeringClubProject.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import engineeringClubProject.packageObjects.GoogleHomePage;

public class TestJava extends TestInit{


    @Test
    public void chromeTest (){
        goToGoogle();
        driver.findElement(By.xpath("//a[contains(@class, 'gb_v') and contains(@aria-label, 'Пошук зображень')]")).click();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.getSearchField().sendKeys("Funny cats\n");
    }

    @Test
    public void secondChromeTest (){
        goToGoogle();
        GoogleHomePage googleHomePage = new GoogleHomePage(driver);
        googleHomePage.clickGoogleBtn().click();
        driver.findElement(By.xpath("//textarea[contains(@class, 'gLFyf')]")).sendKeys("Funny cats\n");
    }


}
