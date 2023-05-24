package tests.US_005_T;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_005_P.US_005_3_P;
import pages.US_005_P.US_005_4_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_005_4_T extends TestBaseReports {

    @Test
    public void outofStok() {

        extentTest=extentReports.createTest("TC_005_2_T","Kullanıcı shops bölümünden herhangi bir ürün satın alır");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Url ye gidildi");
        US_005_4_P hp=new US_005_4_P();

        hp.shopsButton.click();
        extentTest.info("shops Buttonuna tıklandı");

        hp.FurnitureShop.click();
        extentTest.info("Furniture Shop bölümü tıklandı");

        javaScriptExecutor(hp.DeluxeMahagonyDoubleBed);
        extentTest.info("Deluxe Mahagony Double Bed");

        hp.sepetteUrunEkle.click();
        extentTest.info("ürün sepette eklendi");

        hp.sepet.click();
        extentTest.info("sepette gidildi");

        hp.checkout.click();
        extentTest.info("ürün satın alma kısmına gidildi");


        hp.email.clear();
        hp.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("email girildi");

        hp.password.clear();
        hp.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("password girildi");

        hp.login.click();
        extentTest.info("login buttonuna basıldı ve login olundu");

        hp.CheckAvailability.click();
        extentTest.info("Check Availability buttonuna basildi");

        Assert.assertFalse(hp.unavailable.getText().contains("Unavailable"));
        extentTest.info("Stokta olmayan ürün sepette eklendi");

        hp.PlaceOrder.click();
        extentTest.info("Place order buttonuno tıklandı");

        Driver.closeDriver();
        extentTest.info("Driver kapatıldı");

        extentTest.fail("Sepette olmayan ürün sepette eklendiği için bu bir bug dır");




    }




    public static void javaScriptExecutor(WebElement locator){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", locator);
    }












}
