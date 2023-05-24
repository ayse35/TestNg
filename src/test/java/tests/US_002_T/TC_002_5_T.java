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

public class TC_002_5_T extends TestBaseReports {
    // Kullanıcı url ye gider
    // Kullanıcı Contact butonuna tıklar
    // Kullanıcı name alanını doldurur
    // Kullanıcı Email alanını geçerli email bilgisiyle doldurur
    // Kullanıcı Subject alanını doldurur
    // Kullanıcı Description alanını doldurur
    // Kullanıcı Submit butonuna tıklar
    // Kullanıcı Email Succesfully send yazısını görür

    US_002_P page = new US_002_P();

    @Test
    public void test05() throws InterruptedException {

        extentTest = extentReports.createTest("US_002_TC_002_5", "Kullanıcı şikayet , öneri ve sorularını iletebilmelidir");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("https://shop-pickbazar-rest.vercel.app/ anasayfaya gidildi");
        page.contactButton.click();
        extentTest.info("Contact tıklandı");

        Faker fake = new Faker();
        Actions action = new Actions(Driver.getDriver());
        action.click(page.nameBox).sendKeys(fake.name().firstName()).sendKeys(Keys.TAB)
                .sendKeys(fake.internet().emailAddress()).sendKeys(Keys.TAB)
                .sendKeys(fake.book().author()).sendKeys(Keys.TAB)
                .sendKeys(fake.lorem().paragraph())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();

        ReusableMethods.waitForClickablility(page.succeesfulAlert,10);
        Assert.assertTrue(page.succeesfulAlert.getText().contains("sent"));




    }
}
