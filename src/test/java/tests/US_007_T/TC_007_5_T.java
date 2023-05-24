package tests.US_007_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_007_P.US_007_5_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_007_5_T extends TestBaseReports {


    @Test
    public void us_007_5_T() {
        extentTest = extentReports.createTest("PickBazarTest", "us_007_5_T() test case");
        extentTest.info("Logout dan cikis yapabilmelidir");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("ConfigReader ile Urly gidildi");

        US_007_5_P customer5 = new US_007_5_P();
        extentTest.info(" US_007_5_P classindan customer5 objesi olusturuldu");

        customer5.joinBtn.click();
        extentTest.info("Kullanici join butonuna tiklar.");

        customer5.loginBtn.click();
        extentTest.info("Kullanici demo acauntu  gile giris yapar.");

        customer5.avatarBtn.click();
        extentTest.info(" Sayfadan once avatar butonu ve Logout butonuna tiklayip cikabilmelidir");

        customer5.logOutBtn.click();
        extentTest.info(" Logout butonuna tiklayip cikabilmelidir");


        Assert.assertTrue(customer5.mainPageLogoMessage.isDisplayed());
        extentTest.pass("Sayfadan Ciktigini Ana sayfaya gelme ile dogrular");






    }

    }
