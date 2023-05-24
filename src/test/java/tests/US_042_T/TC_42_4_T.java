package tests.US_042_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_042_P.US_042_4_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_42_4_T extends TestBaseReports {


    US_042_4_P pickPage = new US_042_4_P();// objemizi oluşturduk

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

        Thread.sleep(3000);


        // kullanıcı ürün miktarını artırabilir
        pickPage.urunArtırButton.click();
        pickPage.urunArtırButton.click();

        extentTest = extentReports.createTest("kullanıcı sepetteki ürünü artırdı");


        // kullanıcı artan ürün adedini doğrular
        String actualMiktar = pickPage.urunMiktarButton.getText();
        Assert.assertEquals(actualMiktar, "3");
        extentTest = extentReports.createTest("kullanıcı sepetteki ürnün artırıldığını doğruladı");

        Thread.sleep(3000);

        // kullanıcı sepetteki ürünü bir azaltır
        pickPage.urunAzaltButton.click();
        actualMiktar = pickPage.urunMiktarButton.getText();
        Assert.assertEquals(actualMiktar, "2");

        Thread.sleep(3000);

        // kullanıcı sepetteki ürünü sepetten siler   ve doğrular
        pickPage.urunSilButton.click();
        String emptyChart = pickPage.sepetBos.getText();

        Assert.assertEquals(emptyChart,"No products found");


    }
}
