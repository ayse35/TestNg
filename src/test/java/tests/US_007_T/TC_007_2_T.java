package tests.US_007_T;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_007_P.US_007_2_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_007_2_T extends TestBaseReports {


    @Test
    public void us_007_2_T() {
        extentTest = extentReports.createTest("PickBazarTest", "us_007_2_T() test case");
        extentTest.info("Change Password bolumunde sifre degistirince  \"Password changed succesfully\" mesaji gorulmelidir");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("ConfigReader ile Urly gidildi");

        US_007_2_P customer2 = new US_007_2_P();
        extentTest.info(" US_007_2_P  classindan customer4  obhesi olusturuldu");

        customer2.joinBtn.click();
        extentTest.info("Kullanici \"join\" butonuna tiklar.");

        customer2.loginBtn.click();
        extentTest.info("Kullanici demo acaunt u  ile giris yapar");

        customer2.avatarBtn.click();
        extentTest.info("Kullanici demo acaunt u  ile giris yapar gorur");

        customer2.profileBtn.click();
        extentTest.info("profil bolumunu uzerine gelir ve tiklar");

        customer2.changePasswordBtn.click();
        extentTest.info(" Kullanici acilan profil sayfasindaki change password butonuna tiklayabilmeli");

        customer2.oldPasswordInput.click();
        extentTest.info("acilan sayfadan formu doldurup submit butonuna tiklayabilmeli");

        Actions action = new Actions(Driver.getDriver());
        action.sendKeys((ConfigReader.getProperty("oldpass"))).perform();
        extentTest.info("ConfigReader ile old pasword girildi ");



        customer2.newPasswordInput.click();
        extentTest.info("ConfigReader ile new pasword girildi ");

        action.sendKeys((ConfigReader.getProperty("newpass"))).perform();
        extentTest.info("ConfigReader ile old pasword girildi ");

        customer2.confirmPasswordInput.click();
        extentTest.info("ConfigReader ile Urly gidildi");

        action.sendKeys((ConfigReader.getProperty("confirmpass"))).perform();
        extentTest.info("ConfigReader ile Urly gidildi");

        customer2.saveBtn.click();
        extentTest.info("ConfigReader ile Urly gidildi");

        System.out.println("Driver.getDriver().switchTo().alert().getText() = " + Driver.getDriver().switchTo().alert().getText());
        String passChangeExpectedMassage ="Password changed succesfully";
        String actualMassage ="This mutation doesn't work for demo purposes";

        Assert.assertEquals(actualMassage,passChangeExpectedMassage );
        extentTest.fail("Test fails :because expected result and actual result doues not match");

    }

    }
