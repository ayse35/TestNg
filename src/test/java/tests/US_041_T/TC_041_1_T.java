package tests.US_041_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_041_P.US_041_1_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_041_1_T extends TestBaseReports {

    US_041_1_P pickPage = new US_041_1_P();// objemizi oluşturduk

    @Test
    public void test1() throws InterruptedException {


        // Raporlama için objemizi ekliyoruz
        extentTest = extentReports.createTest("US_041 Number Test");

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

        // Kullanıcı açılan sayfadaki ilk ürüne tıklar
        pickPage.ikinciUrunButton.click();
        extentTest = extentReports.createTest("ikinci ürün butonuna basıldı");


        // kullanıcı açılan sayfadaki ürünü favorilere(wishliste) ekler
        pickPage.favoriButton.click();
        extentTest = extentReports.createTest("favori butonuna basıldı");

        Thread.sleep(3000);

        // kullanıcı butona basılır
        pickPage.kullaniciButton.click();
        extentTest = extentReports.createTest("kullanıcı butonuna basıldı");

        // kullanıcı sekmesinden "my wishlist" butonuna tıklar
        pickPage.myWishListButton.click();
        extentTest = extentReports.createTest("favori butonuna basıldı");

        Thread.sleep(3000);

        // kullanıcı eklediği ürünü bu sayfada görür

        Assert.assertTrue(pickPage.sepetekiUrun.isDisplayed());


    }

    private class PickBazarPage {
    }

}
