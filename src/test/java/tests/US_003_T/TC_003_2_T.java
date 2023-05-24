package tests.US_003_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_003_P.US_003_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;


public class TC_003_2_T extends TestBaseReports {

    //  Kullanıcı url ye gider
    //  Kullanıcı FAQ butonuna tıklar
    //  Sayfadaki + botonlarına basar
    //  Butonun - ye döndüğünü ve ilgili sorunun cevabını görüntüler

    US_003_P page = new US_003_P();

    @Test
    public void test2() {

        extentTest = extentReports.createTest("Sıkça sorulan sorularda + ve - semboleni görüntüleme");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Kullanıcı url ye gider");
        page.FAQbutton.click();
        extentTest.info("Kullanıcı FAQ butonuna tıklar");

        Assert.assertTrue(page.negatifSimge1.isDisplayed());
        page.negatifSimge1.click();
        Assert.assertTrue(page.pozitifSimge1.isDisplayed());

       Assert.assertTrue(page.pozitifSimge2.isDisplayed());
       page.pozitifSimge2.click();
       Assert.assertTrue(page.negatifSimge2.isDisplayed());

        Assert.assertTrue(page.pozitifSimge3.isDisplayed());
        page.pozitifSimge3.click();
        Assert.assertTrue(page.negatifSimge3.isDisplayed());

        Assert.assertTrue(page.pozitifSimge4.isDisplayed());
        page.pozitifSimge4.click();
        Assert.assertTrue(page.negatifSimge4.isDisplayed());
        extentTest.pass("Sayfadaki + botonlarına basar ve Butonun - ye döndüğünü ve ilgili sorunun cevabını görüntüler");


    }
}
