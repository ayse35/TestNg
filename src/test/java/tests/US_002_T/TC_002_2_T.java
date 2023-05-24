package tests.US_002_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_002_P.US_002_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReports;

import java.util.Set;

public class TC_002_2_T extends TestBaseReports {

    // Kullanıcı url ye gider
    // Kullanıcı Contact butonuna tıklar
    // Kullanıcı Folow Us seçeneklerinden Facebook simgesine tıklar ve platformun açıldığını görür

    US_002_P page = new US_002_P();

    @Test
    public void test02() {

        extentTest = extentReports.createTest("US_002_TC_002_2", "Kullanıcı Contact bölümündeki Folow Us seçeneklerinden facebook a erişebilir");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("https://shop-pickbazar-rest.vercel.app/ anasayfaya gidildi");
        page.contactButton.click();
        extentTest.info("Contact tıklandı");

        String contactPage = Driver.getDriver().getWindowHandle();
        ReusableMethods.waitForClickablility(page.facebookLink,5);
        page.facebookLink.click();
        extentTest.info("Facebook simgesine tıklandı");

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        String webSiteWindow = "";
        for (String each : allWindowHandles) {
            if (!each.equals(contactPage)) {
                webSiteWindow = each;
            }
        }
        Driver.getDriver().switchTo().window(webSiteWindow);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("facebook"));
        extentTest.pass("Sitenin açıldığını doğrular");
        extentTest.info("");





    }

}
