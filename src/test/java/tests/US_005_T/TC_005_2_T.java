package tests.US_005_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_005_P.US_005_2_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_005_2_T extends TestBaseReports {
    @Test
    public void BooksShop(){

        extentTest=extentReports.createTest("BooksShop","Kullanıcı books shop bölümünde address phone ve websitesi arandı");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("url ye gidildi");

        US_005_2_P hp = new US_005_2_P();

        hp.shopsButton.click();
        extentTest.info("Shops buttonuna tıklandı ");

        hp.BooksShop.click();
        extentTest.info("Books Shop gidildi ");

        Assert.assertTrue(hp.BooksAddress.getText().contains("Address"));
        extentTest.info("Address varlığı kontrol edildi");

        Assert.assertTrue(hp.BooksPhone.getText().contains("Phone"));
        extentTest.info("Phone buttonu kontrol edildi");

        Assert.assertTrue(hp.BooksWebsite.getText().contains("Website"));
        extentTest.info("Websitesi butonu arandi");
        Driver.closeDriver();
        extentTest.info("Driver kapatıldı");
        extentTest.fail("Website buttonu bulunmamaktadır");

    }
}
