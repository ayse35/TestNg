package tests.US_008_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008_009_P.US_08_09_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_6_T extends TestBaseReports {

    @Test
    public void furniture() {
        extentTest = extentReports.createTest("Furniture Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("1- Kullanıcı URL ye gider ");
        US_08_09_P hp = new US_08_09_P();
        hp.GroceryTab.click();
        extentTest.info("Kullanici urun kategorisi secer.");
        hp.FurnitureTab.click();
        extentTest.info("Kullanici Furniture bolumunu tiklar.");
        Assert.assertTrue(hp.FurnitureTab.getText().contains("Furniture"));
        extentTest.pass("Kullanici Furniture sayfasina giris yapilabildigini dogrular");

    }



}
