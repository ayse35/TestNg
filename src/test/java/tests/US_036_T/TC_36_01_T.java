package tests.US_036_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import tests.pages.HomePages_36_37;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;


public class TC_36_01_T extends TestBaseReports {





    @Test
    public void test03() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

       HomePages_36_37 hp=new HomePages_36_37();

       hp.join.click();
       extentTest.info("kullanıcı join butonuna tıklar");

       hp.login.click();

       extentTest.info("kullanıcı login olur");

       hp.grocerytabgiris.click();
       hp.clothing2.click();

        Actions pp = new Actions(Driver.getDriver());
        pp.click(hp.clothingpage).sendKeys(Keys.PAGE_DOWN).build().perform();
        hp.outerWear.click();
        hp.Cowlneck.click();

        hp.kalp.click();



        Actions pk=new Actions(Driver.getDriver());
        pk.click(hp.clothingpage).sendKeys(Keys.ESCAPE).perform();



        hp.canavar.click();

        hp.mywishlists.click();








    }
}
