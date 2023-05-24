package tests.US_024_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_024_P.US_024_1_P;
import utilities.*;

public class TC_024_1_T extends TestBaseReports{

    @Test
    public  void US_0024_1() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("pickBazarTest başlıyor ");

        US_024_1_P tc1=new US_024_1_P();

        tc1.groceryButton.click();
        extentTest.info("Grocery e tıklar");
        tc1.booksButton.click();
        extentTest.info("Books bölümüne gider");
        tc1.firstBook.click();
        extentTest.info("İlk kitabı seçer");


        Actions a = new Actions(Driver.getDriver());

        a.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(3000);
        a.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(3000);

        Assert.assertTrue(tc1.detailsButton.isDisplayed(),"detay goruntulenemedi");

        extentTest.pass("Books bölümünde ürün detayları görüntülendi ");

    }
}
