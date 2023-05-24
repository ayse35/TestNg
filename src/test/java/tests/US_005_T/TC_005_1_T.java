package tests.US_005_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_005_P.US_005_1_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_005_1_T extends TestBaseReports {

    @Test
    public void FurniteShop() {

        extentTest = extentReports.createTest("FurniteShop", "Kullanıcı shop bölümünde shopların görünürlüğünü kontrol edildi ve Furnite shop bölümünde address phone ve websitesi arandı");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Driver a gidildi");
        US_005_1_P hp = new US_005_1_P();

        hp.shopsButton.click();
        extentTest.info("shops button tıklandı");

        Assert.assertEquals(7,hp.shopsCenter.size());
        extentTest.info("Sayfada shoplar görünüyor mu diye kontrol ettik");

        hp.FurnitureShop.click();
        extentTest.info("Furnite Shop kısmına tıklandı.");

        // System.out.println(hp.furAd.getText());
        Assert.assertTrue(hp.FurnitureAddress.getText().contains("Address"));
        extentTest.info("Address kısmının varlığı kontrol edildi.");

        Assert.assertTrue(hp.FurniturePhone.getText().contains("Phone"));
        extentTest.info("Phone kısmının varlığı kontrol edildi");

        Assert.assertTrue(hp.FurnitureWebsite.getText().contains("Website"));
        extentTest.info("Website butonu göründü");
        Driver.closeDriver();
        extentTest.info("Driver kapatıldı");
        extentTest.pass("Adress phone ve Websitesi göründü");
    }

}
