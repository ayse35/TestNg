package tests.US_002_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_002_P.US_002_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

import java.util.Set;

public class TC_002_1_T extends TestBaseReports {

    US_002_P page = new US_002_P();

    @Test
    public void test01() {

        // Kullanici url ye gider
        // Kullanıcı Contact butonuna tıklar
        // Kullanıcı Adress , Phone , WebSite bilgilerini görür.
        // Kullanıcı Visit This Site butonunu tıklar ve sitenin açıldıgını görür

        extentTest = extentReports.createTest("US_002_TC_002_1", "Kullanıcı Contact bölümünde gerekli bilgilere erişebilir");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("https://shop-pickbazar-rest.vercel.app/ anasayfaya gidildi");
        page.contactButton.click();
        extentTest.info("Contact tıklandı");


        Assert.assertTrue(page.address.isDisplayed());
        extentTest.info("Address görüntülendi");
        Assert.assertTrue(page.phone.isDisplayed());
        extentTest.info("Phone görüntülendi");
        Assert.assertTrue(page.webSite.isDisplayed());
        extentTest.info("WebSite görüntülendi");

        String contactPage = Driver.getDriver().getWindowHandle();
        page.visitTheSite.click();
        extentTest.info("Visit This Site tıklandı");


        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        String webSiteWindow = "";
        for (String each : allWindowHandles) {
            if (!each.equals(contactPage)) {
                webSiteWindow = each;
            }
        }
        Driver.getDriver().switchTo().window(webSiteWindow);
        extentTest.pass("Sitenin açıldığını doğrular");

    }
}
