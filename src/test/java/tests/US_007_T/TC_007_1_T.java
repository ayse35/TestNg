package tests.US_007_T;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_007_P.US_007_1_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_007_1_T extends TestBaseReports {

    @Test
    public void us_007_1_T() {
        extentTest = extentReports.createTest("PickBazarTest", "us_007_1_T() test case");
        extentTest.info("profil de gerekli bilgiler girilerek updateler yapilinca \"Profile Updated Successfully\" mesaji gorulmelidir");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("ConfigReader ile Urly gidildi");

        US_007_1_P customer = new US_007_1_P();
        extentTest.info(" US_007_1_P  classindan customer4  objesi olusturuldu");

        customer.joinBtn.click();
        extentTest.info("Kullanici \"join\" butonuna tiklar.");

        customer.loginBtn.click();
        extentTest.info("Kullanici demo acaunt u  ile giris yapar");

        customer.avatarBtn.click();
        extentTest.info("Kullanici demo acaunt u  ile giris yapar gorur");

        customer.profileBtn.click();
        extentTest.info("profil bolumunu uzerine gelir ve tiklar");

        customer.nameInput.click();

        extentTest.info("profil bolumunu uzerine  Formu doldurur  ve save butonuna tiklar");

        Actions action = new Actions(Driver.getDriver());
        action.sendKeys((ConfigReader.getProperty("ProfilName"))).perform();
        customer.bioInput.click();
        extentTest.info("profil bolumunu uzerine  Formu doldurur  ve save butonuna tiklar");


        action.sendKeys((ConfigReader.getProperty("bio"))).perform();
        customer.saveBtn.click();
        extentTest.info("profil bolumunu uzerine  Formu doldurur  ve save butonuna tiklar");


        System.out.println("Driver.getDriver().switchTo().alert().getText() = " + Driver.getDriver().switchTo().alert().getText());
        String profieExpectedMassage ="Profile Updated Successfully";
        String actualMassage ="This mutation doesn't work for demo purposes";

        Assert.assertEquals(actualMassage,profieExpectedMassage );
        extentTest.fail("Test fails :because expected result and actual result doues not match");



    }

    }
