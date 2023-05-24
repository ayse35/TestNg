package tests.US_008_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008_009_P.US_08_09_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_2_T extends TestBaseReports {

    @Test
    public void bakery() {
        extentTest = extentReports.createTest("Bakery Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info(" Kullanıcı URL ye gider ");
        US_08_09_P hp = new US_08_09_P();
        hp.GroceryTab.click();
        extentTest.info(" Kullanici urun kategorisi secer. ");
        hp.BakeryTab.click();
        extentTest.info(" Kullanici Bakery bolumunu tiklar. ");
        System.out.println(hp.BakeryTab.getText());
        Assert.assertTrue(hp.BakeryTab.getText().contains("Bakery"));
        extentTest.pass(" Kullanici Bakery sayfasina giris yapilabildigini dogrular");



    }

}