package tests.US_037_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.pages.HomePages_36_37;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;




public class TC_037_1_T extends TestBaseReports {



    public void test01() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("kullanıcı url gider");



        HomePages_36_37 hp=new HomePages_36_37();



        hp.groceryButton.click();
        extentTest.info("kullanıcı grocery sekmesine tıklar");
        hp.clothing.click();
        extentTest.info("kullanıcı clothing sekmesine tıklar");
        Actions pp = new Actions(Driver.getDriver());
        pp.click(hp.clothingpage).sendKeys(Keys.PAGE_DOWN).build().perform();
        extentTest.info("kullanıcı sayfada gezebilmeli");
        hp.outerWear.click();
        extentTest.info("kullanıcı ürün seçer");
        hp.Cowlneck.click();
        hp.AddToCart.click();
        extentTest.info("kullanıcı sepete ekler");
        extentTest.pass("testin geçtiği görülür");






















    }
}