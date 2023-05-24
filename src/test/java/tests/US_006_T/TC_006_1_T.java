package tests.US_006_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_006_P.US_006_1_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_006_1_T extends TestBaseReports {

    @Test
    public void TC_006_1_T() {
        extentTest=extentReports.createTest("TC_006_1_T","Kullanıcı email ve password doğrular");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Sayfaya gidildi");

        US_006_1_P hp=new US_006_1_P();

        hp.join.click();
        extentTest.info("login butonuna tıklandı");

        hp.email.clear();
        hp.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("email adresi girildi");

        hp.password.clear();
        hp.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("password girildi");

        hp.login.click();
        extentTest.info("login butonuna tıklandı");

        Assert.assertTrue(hp.loginIcon.isDisplayed());
        extentTest.info("login icon görüntülendi");


        Driver.closeDriver();
        extentTest.info("Driver kapatıldı");

        extentTest.pass("login olunup login button görüntülendi");

    }
}
