package tests.US_006_T;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_006_P.US_006_2_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_006_2_T extends TestBaseReports {
    @Test
    public void yanlısEmailYanlısPassword() throws InterruptedException {
        extentTest=extentReports.createTest("TC_006_2_T","Kullanıcı yanlış email ve password ile login olunmamalı");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Sayfaya gidildi");

        US_006_2_P hp=new US_006_2_P();

        hp.join.click();
        extentTest.info("Join buttonuna tıklandı");

        Faker faker=new Faker();
        hp.emaillocate.clear();
        hp.emaillocate.sendKeys(faker.internet().emailAddress());
        extentTest.info("Yanlış email adresi girildi");

        hp.password.clear();
        hp.password.sendKeys(faker.internet().password());
        extentTest.info("Yanlış sifre girildi");

        hp.login.click();

        extentTest.info("login button tıklandı");

        Assert.assertTrue(hp.noEnteredPage.getText().contains("The credentials was wrong!"));
        extentTest.info("The credentials was wrong! mesajı görüntülendi");

        Driver.closeDriver();
        extentTest.info("Driver kapatıldı");
        extentTest.pass("yanlış email ve yanlış password ile siteye login olunamadı.");


    }
    @Test
    public void yanlısEmailDogruPassword(){

        extentTest=extentReports.createTest("TC_006_2_T","Kullanıcı yanlış email ve password ile login olunmamalı");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Sayfaya gidildi");

        US_006_2_P hp=new US_006_2_P();

        hp.join.click();
        extentTest.info("Join buttonuna tıklandı");

        Faker faker=new Faker();
        hp.emaillocate.clear();
        hp.emaillocate.sendKeys(faker.internet().emailAddress());
        extentTest.info("Yanlış email adresi girildi");

        hp.password.clear();
        hp.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("Doğru password girildi");

        hp.login.click();

        extentTest.info("login button tıklandı");

        Assert.assertTrue(hp.noEnteredPage.getText().contains("The credentials was wrong!"));
        extentTest.info("The credentials was wrong! mesajı görüntülendi");

        Driver.closeDriver();
        extentTest.info("Driver kapatıldı");
        extentTest.pass("yanlış email ve doğru password ile siteye login olunamadı.");


    }

    @Test
    public void dogruEmailYanlısPassword(){

        Faker faker = new Faker();
        extentTest=extentReports.createTest("TC_006_2_T","Kullanıcı yanlış email ve password ile login olunmamalı");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Sayfaya gidildi");

        US_006_2_P hp=new US_006_2_P();

        hp.join.click();
        extentTest.info("Join buttonuna tıklandı");

        hp.emaillocate.clear();
        hp.emaillocate.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("email adresi girildi");

        hp.password.clear();
        hp.password.sendKeys(faker.internet().password());
        extentTest.info("Yanlış sifre girildi");

        hp.login.click();

        extentTest.info("login button tıklandı");

        Assert.assertTrue(hp.forgotPassword.getText().contains("Forgot password?"));
        extentTest.info("Forgot passwor?! mesajı görüntülendi");

        Driver.closeDriver();
        extentTest.info("Driver kapatıldı");
        extentTest.pass("Doğru email ve yanlışpassword ile siteye login olunamadı.");


    }




}
