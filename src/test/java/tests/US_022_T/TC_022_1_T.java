package tests.US_022_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_022_P.US_022_1_P;
import utilities.*;

public class TC_022_1_T extends TestBaseReports {

    @Test
    public void US_0022_1(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
       extentTest = extentReports.createTest("pickBazarTest başlıyor");

        US_022_1_P tc1=new US_022_1_P();

        tc1.groceryButton.click();
        extentTest.info("Grocery e tıklar ");


        tc1.dailyNeedsButton.click();
       extentTest.info("Daily Needs bölümüne gider ");

        tc1.vegetablesButton.click();
       extentTest.info(" Vegetables kategorisini seçer");

        tc1.alliumButton.click();
       extentTest.info(" Allium kategorisini seçer");

        tc1.addToCartButton.click();
      extentTest.info("Add tıklar ");

        tc1.sepetButton.click();
       extentTest.info("Sepete tıklar ");

        Assert.assertTrue(tc1.sepettekiUrun.isDisplayed(),"urun bulunamadı");
       extentTest.info("Sepette ürünü görüntüler ");

      extentTest.pass(" Daily Needs bölümünde sepete ürün eklendi ve görüntülendi");




    }

}
