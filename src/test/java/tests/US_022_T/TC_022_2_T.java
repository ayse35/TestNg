package tests.US_022_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_022_P.US_022_2_P;
import utilities.*;

public class TC_022_2_T extends TestBaseReports {
    @Test
    public void US_0022_2(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("pickBazarTest başlıyor");


        US_022_2_P tc2=new US_022_2_P();

        tc2.groceryButton.click();
        extentTest.info("Grocery e tıklar ");

        tc2.dailyNeedsButton.click();
        extentTest.info("Daily Needs bölümüne gider ");

        tc2.vegetablesButton.click();
        extentTest.info("Vegetables kategorisini seçer ");

        tc2.alliumButton.click();
        extentTest.info(" Allium kategorisini seçer");

        tc2.addButton.click();
        extentTest.info("Add tıklar ");

        tc2.sepetButton.click();
        extentTest.info(" Sepete tıklar");

        Assert.assertTrue(tc2.sepettekiUrun.isDisplayed(),"urun yok");
        extentTest.info(" Sepette ürünü görüntüler ");

        tc2.minusButton.click();
        extentTest.info("Sepetten ürünü çıkarır ");

        Assert.assertTrue(tc2.bosSepetButton.isDisplayed(),"urun silinmedi");
        extentTest.info(" Sepetten ürünün silindiğini görür");

        extentTest.pass(" Daily Needs bölümünde sepetten ürün silindi");


    }
}
