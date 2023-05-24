package tests.US_028_T;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_028_29_P.US_028_29_P;
import utilities.ConfigReader;
import utilities.Driver;


public class TC_028_2_T  {


    WebDriver driver;

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("grocery"));
        US_028_29_P gp = new US_028_29_P();
        Thread.sleep(3000);
        gp.lime.click();
        System.out.println("Guncel fiyat  = "+ gp.guncelFiyat.getText());
        Assert.assertTrue(gp.guncelFiyat.isDisplayed());

    }



}
