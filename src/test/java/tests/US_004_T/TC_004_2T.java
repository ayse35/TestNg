package tests.US_004_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_004_P.US_004_2_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_004_2T extends TestBaseReports {

   @Test
    public void us_004_2_T(){
       extentTest = extentReports.createTest("PickBazarTest", "us_004_2_t() test case");
       extentTest.info("offerlar arasindan indirim kodunu(id' lerini) kopyalayıp alisveriste kullanmalidir");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
       extentTest.info("ConfigReader ile Urly gidildi");

       US_004_2_P coupon2 = new US_004_2_P();
      extentTest.info(" US_004_2_P  classindan coupon  objesi olusturuldu");

       coupon2.joinBtn.click();
       extentTest.info(" Join butonu na tiklayip kayit sayfasina gider");

       coupon2.loginBtn.click();
       extentTest.info("  Demo accaunt u ile kayit yaptirir");


       coupon2.offresBtn.click();
       extentTest.info(" Kullanici \"Offers\" butonuna tiklar.");

       coupon2.coupon12.click();
       extentTest.info(" Kuponlardan kulanmak istedigini kuponu kopyalayabilmeli");


       Assert.assertTrue(coupon2.coupon12.isDisplayed());
       extentTest.info("  kuponu kopyalayabildigini dogrular");

       coupon2.shopsBtn.click();
       extentTest.info(" Alisveris icin Shops butonuna tiklanabilmeli");

       coupon2.furnitureShopBtn.click();
       extentTest.info(" Tiklanilan(furnitre) shop tan istetigi urune gidip tiklanabilmeli");


       coupon2.ashDoubleBedBtn.click();
       extentTest.info(" Acilan Pencereden urun tiklanip sepete eklenebilmeli");


       coupon2.addToShoppingCartBtn.click();
       extentTest.info(" Acilan Pencereden urun tiklanip sepete eklenebilmeli");

       coupon2.shoppingBasketBtn.click();
       extentTest.info(" Alisveris sepetinde urun goruntulenebilmeli");

       coupon2.checkOutBtn.click();
       extentTest.info(" Alisveris sepetinde Checkout butonuna tiklanmali");

       coupon2.checkAvailabilityBtn.click();
       extentTest.info(" Check availibility butonuna tiklanabilmeli");

       coupon2.doYouHaveCouponBtn.click();
       extentTest.info(" Do you have Coupon? Textine tiklayip");

       coupon2.pasteCouponBtn.click();
       extentTest.info(" alilan bolume kopyalanan kupon yapistirilmali");

       Actions actions = new Actions(Driver.getDriver());
       actions.keyDown(Keys.CONTROL).sendKeys("V").perform();
       extentTest.info("  Action objesi ile alilan bolume kopyalanan kupon yapistirilmali");

       coupon2.applyBtn.click();
       extentTest.info("  apply butonuna tiklnmali");


       double beforePrice = Double.parseDouble(coupon2.totalBefore.getText().substring(1));
    System.out.println("beforePrice = " + beforePrice);
       double afterPrice = Double.parseDouble(coupon2.totalAfter.getText().substring(1));
       System.out.println("afterPrice = " + afterPrice);

       Assert.assertNotEquals(beforePrice, afterPrice);
       extentTest.info("  Kupon indirim tutarinin toplam tutardan indirildigi  gozlemlenmeli");



   }


}
