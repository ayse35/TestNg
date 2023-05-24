package tests.US_028_T;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_028_29_P.US_028_29_P;
import utilities.ConfigReader;
import utilities.Driver;


public class TC_028_3_T {


    WebDriver driver;

    @Test
    public void indirimliFiyat() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("grocery"));


        US_028_29_P gp = new US_028_29_P();

        Thread.sleep(3000);
        gp.lime.click();
        System.out.println("Indirim orani = "+ gp.indirimOrani.getText());
        Assert.assertTrue(gp.indirimOrani.isDisplayed());


    }



}
