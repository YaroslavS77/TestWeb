package com.RozetkaMarketPlace.TestWeb.Tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.nio.file.WatchEvent;

public abstract class TestInit {
    public WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.safaridriver().setup();
        SafariOptions options = new SafariOptions();
        driver = new SafariDriver(options);
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
