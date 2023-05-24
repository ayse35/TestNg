package tests.US_041_T;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_041_P.US_041_3_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_041_3_T extends TestBaseReports {


    US_041_3_P pickPage = new US_041_3_P();// objemizi oluşturduk

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


        //Kullanıcı Furniture sayfasında kategori (resimli) kısmında BED bölümüne locate edildi
        Assert.assertTrue(pickPage.bedtButton.isDisplayed());
        extentTest = extentReports.createTest("furniture kategorisine gelindi");

        //Kullanıcı ürünlerin üzerinde seachbox kısmını görür.
        pickPage.serchtButton.click();

        //Kullanıcı seachbox bir ürün aratır
        pickPage.serchtButton.sendKeys("Cedar Double Bed" + Keys.ENTER);

        //kullanıcı arma butonunda arama yapabilmelinin doğrulaması

         String aranaUrun = pickPage.arananUrunKontrol.getText();
        Assert.assertTrue(aranaUrun.contains("Cedar Double Bed"));
        extentTest = extentReports.createTest("seachboxda arama yapılabildiği doğrulandı");


    }
}
