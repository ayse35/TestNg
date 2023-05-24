package tests.US_037_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.pages.HomePages_36_37;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_037_2_T extends TestBaseReports {


    @Test
    public void test02() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("kullanıcı gider");

        HomePages_36_37 hp=new HomePages_36_37();
        hp.groceryButton.click();
        extentTest.info("kullanıcı grocery sekmesine tıklar");
        hp.clothing.click();
        extentTest.info("kullanıcı ürün seçer");

        Actions pp = new Actions(Driver.getDriver());
        pp.click(hp.clothingpage).sendKeys(Keys.PAGE_DOWN).build().perform();
        extentTest.info("kullanıcı sayfada gezer");

        hp.outerWear.click();

        hp.Cowlneck.click();
        extentTest.info("kullanıcı sayfada gezer");

        hp.AddToCart.click();
        System.out.println("hp.piecesavaible.getSize() = " + hp.piecesavaible.getSize());
        extentTest.info("ürünü stoğa ekler");

        System.out.println("hp.pieces.getSize() = " + hp.pieces.getSize());
        extentTest.info("ürün stoğunu görüntüler");


      extentTest.pass("ürün testi geçer");

    }

}