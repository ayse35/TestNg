package tests.US_029_T;




import org.testng.annotations.Test;
import pages.US_028_29_P.US_028_29_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;


public class TC_029_1T extends TestBaseReports {



    @Test
    public void sepeteEkle()  throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("grocery"));
        extentTest = extentReports.createTest("Kullanici url ye gider");


        US_028_29_P gp = new US_028_29_P();
        //Thread.sleep(1000);
        gp.apples.click();
        extentTest = extentReports.createTest("Kullanici elmaya tiklar");
        Thread.sleep(3000);
        gp.sepeteEkle.click();
        extentTest = extentReports.createTest("Kullanici sepete ekler");
        Thread.sleep(3000);
        gp.sepettenAzalt.click();
        extentTest = extentReports.createTest("Kullanici sepetten azaltir");


    }



}