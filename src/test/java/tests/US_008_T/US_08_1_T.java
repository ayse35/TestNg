package tests.US_008_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008_009_P.US_08_09_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_1_T extends TestBaseReports {

    

    @Test
    public void grocery() {
        extentTest = extentReports.createTest("Grocery Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info(" Kullanıcı URL ye gider ");
        US_08_09_P hp = new US_08_09_P();
        hp.GroceryTab.click();
        extentTest.info(" Kullanici Grocery bolumunu tiklar. ");
        Assert.assertTrue(hp.GroceryTab.getText().contains("Grocery"));
        extentTest.pass(" Kullanici Grocery sayfasina giris yapilabildigini dogrular");



    }




}
