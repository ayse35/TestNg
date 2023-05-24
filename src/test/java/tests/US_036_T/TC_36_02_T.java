package tests.US_036_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.pages.HomePages_36_37;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;


public class TC_36_02_T  extends TestBaseReports {




    @Test
    public void test03() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

       HomePages_36_37 hp=new HomePages_36_37();
       hp.grocerytabgiris.click();
       extentTest.info("kullanıcı grocery sayfasına girer");

       hp.clothing2.click();
       extentTest.info("kullanıcı clothing sekmesine girer");
       Actions pp = new Actions(Driver.getDriver());
       pp.click(hp.clothingpage).sendKeys(Keys.PAGE_DOWN).build().perform();
       extentTest.info("sayfada scroll down yapar");

       hp.Pants.click();
       extentTest.info("kullanıcı ürün seçer");

       hp.Invictuspants.click();

       hp.Invictuspantscolor.click();
       extentTest.info("kullaını renk seçer");

       hp.Invictuspantssize.click();
       extentTest.info("kullaını beden seçimi yapar");















    }
}
