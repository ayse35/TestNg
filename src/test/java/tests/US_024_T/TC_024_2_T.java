package tests.US_024_T;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_024_P.US_024_2_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReports;

public class TC_024_2_T extends TestBaseReports {
    @Test
    public void US_0024_1(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("pickBazarTest başlıyor");

        US_024_2_P tc2=new US_024_2_P();

        tc2.groceryButton.click();
        extentTest.info("Grocery e tıklar");

        tc2.booksButton.click();
        extentTest.info("Books bölümüne gider");

        tc2.firstBook.click();
        extentTest.info("İlk kitabı seçer");

        tc2.addToCartButton.click();
        extentTest.info("Add tıklar");

        tc2.sepetBook.click();
        extentTest.info("Sepete gider");

        tc2.checkOutBook.click();
        extentTest.info("Checkout butonuna tıklar");

        tc2.loginButton.click();
        extentTest.info("Login olur");

        tc2.checkAvailabilityButton.click();
        extentTest.info("Check Availability tıklar");

        tc2.placeOrderButton.click();
        extentTest.info("Place Order tıklar");

        ReusableMethods.waitForClickablility(tc2.payButton,3000);
        tc2.payButton.click();
        extentTest.info("Pay tıklar");


        ReusableMethods.waitForClickablility(tc2.paymentSuccessButton,3000);
        Assert.assertTrue(tc2.paymentSuccessButton.isDisplayed(),"sipariş alınamadı");
        extentTest.info("Payment Success görülür ");

        extentTest.pass("Books bölümünden sipariş alındığı dogrulandı");



    }
}
