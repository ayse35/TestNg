package tests.US_008_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008_009_P.US_08_09_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_4_T extends TestBaseReports {

    @Test
    public void Bags() {
        extentTest = extentReports.createTest("Bags Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("1- Kullanıcı URL ye gider ");
        US_08_09_P hp = new US_08_09_P();
        hp.GroceryTab.click();
        extentTest.info("Kullanici urun kategorisi secer.");
        hp.BagsTab.click();
        System.out.println(hp.BagsTab.getText());
        extentTest.info("Kullanici Bags bolumunu tiklar.");
        Assert.assertTrue(hp.BagsTab.getText().contains("Bags"));
        extentTest.pass("Kullanici Bags  sayfasina giris yapilabildigini dogrular");

    }


}
