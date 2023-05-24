package tests.US_036_T;



import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.pages.HomePages_36_37;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;



public class TC_036_4_T extends TestBaseReports {


    @Test
    public void test04() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));

        HomePages_36_37 hp=new HomePages_36_37();


        hp.groceryButton.click();

        hp.clothing.click();

        extentTest.info("kullanıcı ürünleri seçer");




        Actions pp = new Actions(Driver.getDriver());
        pp.click(hp.clothingpage).sendKeys(Keys.PAGE_DOWN).build().perform();
        extentTest.info("kullanıcı sayfada gezebilmeli");
        extentTest.info("kullanı ürünleri görüntüleyebilmeli");












































    }
}