package tests.US_002_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_002_P.US_002_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_002_7_T extends TestBaseReports {
  // Kullanıcı url ye gider
  // Kullanıcı Contact butonuna tıklar
  // Kullanıcı bilgi girişi yapmadan Submit butonuna tıklar
  // You must need to provide your name metnini görüntüler
  // You must need to provide your email address metnini görüntüler
  // What subject do you want to discuss with us? metnini görüntüler
  // Tell us more about it metnini görüntler

    US_002_P page = new US_002_P();

    @Test
    public void test07(){
        extentTest = extentReports.createTest("US_002_TC_002_7", "Kullanıcı gerekli alanları boş bırakarak işlem yapamaz");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("https://shop-pickbazar-rest.vercel.app/ anasayfaya gidildi");
        page.contactButton.click();
        extentTest.info("Contact tıklandı");

        page.submitButton.click();
        extentTest.info("Kullanıcı bilgi girişi yapmadan Submit butonuna tıklar");

        Assert.assertTrue(page.nameUyariMesaj.isDisplayed());
        Assert.assertTrue(page.EmailUyariMesaj.isDisplayed());
        Assert.assertTrue(page.subjectUyariMesaj.isDisplayed());
        Assert.assertTrue(page.descriptionUyariMesaj.isDisplayed());
        extentTest.pass("Tüm uyarı mesajları görüntülendi mail gönderilemedi");





    }
}
