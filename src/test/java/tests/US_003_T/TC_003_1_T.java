package tests.US_003_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_003_P.US_003_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReports;



public class TC_003_1_T extends TestBaseReports {

    // Kullanıcı url ye gider
    // Kullanıcı FAQ butonuna tıklar
    // *How to contact with Customer Service? sorusunu görüntüler
    // Kullanıcı + tıklar ve sorunun cevbını görüntüler
    // *App installation failed, how to update system information ? sorusunu görüntüler
    // Kullanıcı + tıklar ve sorunun cevbını görüntüler
    // *Website response taking time, how to improve? sorusunu görüntüler
    // Kullanıcı + tıklar ve sorunun cevbını görüntüler
    // *How do I create a account? sorusunu görüntüler
    // Kullanıcı + tıklar ve sorunun cevbını görüntüler

    US_003_P page = new US_003_P();

    @Test
    public void test1() {
        extentTest = extentReports.createTest("Sıkca sorulan sorularda 4 soru ve 4 cevap oldugunu goruntuleyebilme");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info(" Kullanıcı url ye gider");
        page.FAQbutton.click();
        extentTest.info("Kullanıcı FAQ butonuna tıklar");

        Assert.assertTrue(page.soru1.isDisplayed());
        extentTest.info("*How to contact with Customer Service? sorusunu görüntüler");
        page.soru1.click();
        Assert.assertTrue(page.cevap1.isDisplayed());
        extentTest.info("Kullanıcı + tıklar ve sorunun cevbını görüntüler");

        Assert.assertTrue(page.soru2.isDisplayed());
        extentTest.info("*App installation failed, how to update system information ? sorusunu görüntüler");
        page.soru2.click();
        Assert.assertTrue(page.cevap2.isDisplayed());
        extentTest.info("Kullanıcı + tıklar ve sorunun cevbını görüntüler");

        Assert.assertTrue(page.soru3.isDisplayed());
        extentTest.info(" *Website response taking time, how to improve? sorusunu görüntüler");
        page.soru3.click();
        Assert.assertTrue(page.cevap3.isDisplayed());
        extentTest.info("Kullanıcı + tıklar ve sorunun cevbını görüntüler");

        Assert.assertTrue(page.soru4.isDisplayed());
        extentTest.info("*How do I create a account? sorusunu görüntüler");
        page.soru4.click();
        ReusableMethods.waitForVisibility(page.cevap4, 10);
        Assert.assertTrue(page.cevap4.isDisplayed());
        extentTest.info("Kullanıcı + tıklar ve sorunun cevbını görüntüler");
        extentTest.pass("4 soru ve 4 cevap görüntülendi");


    }
}
