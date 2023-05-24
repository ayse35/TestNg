package tests.US_005_T;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_005_P.US_005_3_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReports;

public class TC_005_3_T extends TestBaseReports {
    @Test
    public void test005_3() throws InterruptedException {
        extentTest=extentReports.createTest("TC_005_2_T","Kullanıcı shops bölümünden herhangi bir ürün satın alır");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Url ye gidildi");
        US_005_3_P hp=new US_005_3_P();

        hp.shopsButton.click();
        extentTest.info("shops Buttonuna tıklandı");

        hp.FurnitureShop.click();
        extentTest.info("Furniture Shop bölümü tıklandı");

        javaScriptExecutor(hp.CastleryDoubleSofa);
        extentTest.info("Castlery Double Sofa ürününe gidildi");

        hp.sepetteUrunEkle.click();
        extentTest.info("ürün sepette eklendi");

        hp.sepet.click();
        extentTest.info("sepette gidildi");

        hp.sepetteUrunArtir.click();
        extentTest.info("kullanıcı sepette ürünü artırdı");

        String miktar=hp.artirDogrula.getText();
        Assert.assertEquals(miktar, "2");
        extentTest.info("kullanıcı sepetteki ürnün artırıldığını doğruladı");

        hp.sepetteUrunAzalt.click();
        extentTest.info("sepette ürün azaltıldı");
        miktar = hp.azaltDogrula.getText();

        Assert.assertEquals(miktar, "1");
        extentTest.info("kullanıcı sepette ürün azaltıldığını doğruladı");

        hp.checkout.click();
        extentTest.info("ürün satın alma kısmına gidildi");


        hp.email.clear();
        hp.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("email girildi");

        hp.password.clear();
        hp.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("password girildi");

        hp.login.click();
        extentTest.info("login buttonuna basıldı ve login olundu");

        hp.CheckAvailability.click();
        extentTest.info("Check Availability buttonuna basildi");

        hp.PlaceOrder.click();
        extentTest.info("Place order buttonuno tıklandı");

        hp.pay.click();
        extentTest.info("ürün satın alındı");
        Assert.assertTrue(hp.paySuccess.getText().contains("Payment Success"));
        extentTest.info("ürün satın alındığı doğrulandı");

        hp.userAvatar.click();
        extentTest.info("Avatar tıklandı");

        hp.logout.click();
        extentTest.info("kullanıcı cikisi yapidi");

        Driver.closeDriver();
        extentTest.info("Driver kapatıldı");


    }
    public static void javaScriptExecutor(WebElement locator){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", locator);
    }
}
