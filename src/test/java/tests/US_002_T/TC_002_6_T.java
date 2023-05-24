package tests.US_002_T;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.US_002_P.US_002_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

import java.util.ArrayList;
import java.util.List;

public class TC_002_6_T extends TestBaseReports {
    // Kullanıcı url ye gider
    // Kullanıcı Contact butonuna tıklar
    // Kullanıcı name alanını doldurur
    // Kullanıcı Email alanını geçersiz email bilgisiyle doldurur
    // Kullanıcı Subject alanını doldurur
    // Kullanıcı Description alanını doldurur
    // Submit butonuna tıklar
    // Kullanıcı Email kutusundan "The provided email address format is not valid" mesajını görüntüler

    US_002_P page = new US_002_P();


    @Test(dataProvider = "getData")
    public void test06(String mail) {

        extentTest = extentReports.createTest("US_002_TC_002_6", "Kullanıcı Contact bölümünde geçersiz email ile işlem yapamaz");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("https://shop-pickbazar-rest.vercel.app/ anasayfaya gidildi");
        page.contactButton.click();
        extentTest.info("Contact tıklandı");


        Faker faker = new Faker();
        Actions action = new Actions(Driver.getDriver());
        extentTest.info("Kullanıcı diğer bilgileri dogru ve Email alanını geçersiz email bilgisiyle doldurur");

            action.click(page.nameBox).sendKeys(faker.name().firstName()).sendKeys(Keys.TAB)
                    .sendKeys(mail).sendKeys(Keys.TAB)
                    .sendKeys(faker.book().author()).sendKeys(Keys.TAB)
                    .sendKeys(faker.lorem().paragraph()).sendKeys(Keys.TAB)
                    .sendKeys(Keys.ENTER).perform();

            Assert.assertTrue(page.gecersizEmailMesaj.isDisplayed());

        extentTest.pass("Kullanıcı Email kutusundan \"The provided email address format is not valid\" mesajını görüntüler");
    }

    @DataProvider(parallel = true)
    public static Object[][] getData() {

        return new Object[][]{
                {ConfigReader.getProperty("gecersizEmail1")},
                {ConfigReader.getProperty("gecersizEmail2")},
                {ConfigReader.getProperty("gecersizEmail3")},
                {"gecersizEmail3"},
                {"gecersizEmail9"}
        };


    }
}