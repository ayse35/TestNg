package tests.US_022_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_022_P.US_022_3_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReports;

public class TC_022_3_T extends TestBaseReports {

    @Test
    public void US_0022_3(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("pickBazarTest başlıyor");

        US_022_3_P tc3=new US_022_3_P();

        tc3.groceryButton.click();
        extentTest.info("Grocery e tıklar ");

        tc3.dailyNeedsButton.click();
        extentTest.info("Daily Needs bölümüne gider ");

        tc3.snacksButton.click();
        extentTest.info("Snack kategorisini seçer ");

        tc3.crispsButton.click();
        extentTest.info("Crisps kategorisini seçer ");

        tc3.addButton.click();
        extentTest.info("Add tıklar ");

        tc3.sepetButton.click();
        extentTest.info(" Sepete tıklar");

        Assert.assertTrue(tc3.sepettekiUrunCips.isDisplayed(),"cips yokk");
        extentTest.info("Sepette ürünü görüntüler ");

        Assert.assertTrue(tc3.sepetCheckout.isDisplayed(),"fiyat goruntulenemedi");
        extentTest.info(" Sepette fiyatı görüntüler");

        extentTest.pass("  Daily Needs bölümünde  sepete eklenen ürün ve fiyatı görüntülendi");



    }
}
