package tests.US_042_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_042_P.US_042_5_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_42_5_T extends TestBaseReports {


    US_042_5_P pickPage = new US_042_5_P();// objemizi oluşturduk

    @Test
    public void test1() throws InterruptedException {


        // Raporlama için objemizi ekliyoruz
        extentTest = extentReports.createTest("US_042 Number Test");

        // https://shop-pickbazar-rest.vercel.app/ sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("pickbazar sitesi açıldı");

        //Ana sayfanın açıldığı kontrol edilir
        String homePageUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("url");

        Assert.assertEquals(expectedUrl, homePageUrl);

        // join butonuna basılır
        pickPage.joinButton.click();
        extentTest = extentReports.createTest("join butonuna basıldı");

        // name ve e mail demo olarak gelmekte, buradan login olnur
        pickPage.loginButton.click();
        extentTest = extentReports.createTest("login olundu");

        Thread.sleep(3000);

        // Kullanıcı Grocery sekmesine tıklar
        pickPage.groceryButton.click();
        extentTest = extentReports.createTest("grocery butonuna gidildi");

        // Kullanıcı Furniture sekmesini seçer
        pickPage.furnitureButton.click();
        extentTest = extentReports.createTest("furniture butonuna basıldı");

        // kullanıcı ikinci ürüne gider
        pickPage.ikinciUrunButton.click();
        extentTest = extentReports.createTest("kullanıcı sayfadaki ikinci ürüne tıkladı");

        // kullanıcı sepete ekle butonuna basar
        pickPage.addToChartButton.click();
        extentTest = extentReports.createTest("kullanıcı sepete ürün ekledi");

        //kullanıcı sepete git butonuna gider
        pickPage.sepetigittButton.click();
        extentTest = extentReports.createTest("kullanıcı sepete gittti");

        // kullanıcı sepete eklediği ürünün birim fiyatını görür/doğrular
        Assert.assertTrue(pickPage.birimFiyatButton.isDisplayed());

    }
}
