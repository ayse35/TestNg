package tests.US_008_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008_009_P.US_08_09_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class US_08_3_T extends TestBaseReports {

    @Test
    public void makeup() {
        extentTest = extentReports.createTest("Make Up Test");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info(" Kullanıcı URL ye gider ");
        US_08_09_P hp = new US_08_09_P();
        hp.GroceryTab.click();
        extentTest.info(" Kullanici urun kategorisi secer. ");
        hp.MakeupTab.click();
        extentTest.info(" Kullanici Make up bolumunu tiklar.");
        Assert.assertTrue(hp.MakeupTab.getText().contains("Makeup"));
        extentTest.info(" Kullanici Make up bolumunu tiklar.");


    }



}
