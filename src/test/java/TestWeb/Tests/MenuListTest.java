package TestWeb.Tests;
import TestWeb.PakageObjects.HomePageHelper;
import TestWeb.PakageObjects.MenuListElements;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenuListTest extends TestInit{
    @Test
    public void testLists(){
        HomePageHelper homePageHelper = new HomePageHelper(driver);
        MenuListElements menuListElements = new MenuListElements(driver);
        homePageHelper.goToRozetka();
        Assert.assertEquals(menuListElements.getStaticList().size(), menuListElements.getAnimatedList().size());
    }
}
