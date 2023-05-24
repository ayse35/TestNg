package tests.US_002_T;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_002_P.US_002_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReports;

public class TC_002_8_T extends TestBaseReports {
    // Kullanıcı url ye gider
    // Kullanıcı Contact butonuna tıklar
    // Kullanıcı name alanını doldurur
    // Kullanıcı Email alanını geçerli email bilgisiyle doldurur
    // Kullanıcı Subject alanını doldurur
    // Kullanıcı description alanına sadece sayılardan olusan bir metin girer
    // Kullanıcı submit butonunu tıklar
    // Kullanıcı description bölümünden uyarı mesajı almaz

    US_002_P page = new US_002_P();

    @Test
    public void test08() {
        extentTest = extentReports.createTest("US_002_TC_002_8", "Description alaninda yazılan yazinin icerigi ile ilgil bir sinirlandirma olmalidır ");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("https://shop-pickbazar-rest.vercel.app/ anasayfaya gidildi");
        page.contactButton.click();
        extentTest.info("Contact tıklandı");

        Faker faker = new Faker();
        Actions action = new Actions(Driver.getDriver());
        action.click(page.nameBox).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys(faker.book().author()).sendKeys(Keys.TAB)
                .sendKeys(faker.number().digits(30)).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();
        extentTest.info("Kullanıcı tüm alanları doldurur ;description alanına sadece sayılardan olusan bir metin girer");

        ReusableMethods.waitForVisibility(page.succeesfulAlert,10);
        Assert.assertFalse(page.succeesfulAlert.isDisplayed());
        extentTest.pass("Kullanıcı sent mesajı almamalı");

    }
}