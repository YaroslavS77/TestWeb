package TestWeb.Tests;
import TestWeb.PakageObjects.HomePageHelper;
import org.testng.annotations.Test;

public class MainTest extends TestInit{
    @Test
    public void testMainPage(){
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        homePageHelper.goToComfy();
        homePageHelper.search("cat");
    }
}
