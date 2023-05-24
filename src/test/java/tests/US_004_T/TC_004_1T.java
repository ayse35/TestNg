package tests.US_004_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_004_P.US_004_1_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_004_1T extends TestBaseReports {

   @Test
    public void us_004_1_T(){
       extentTest = extentReports.createTest("PickBazarTest", "us_004_1_t() test case");
       extentTest.info("offerlar arasindan indirim kodunu(id' lerini) kopyalayıp alisveriste kullanmalidir");

      Driver.getDriver().get(ConfigReader.getProperty("url"));
       extentTest.info("ConfigReader ile Urly gidildi");

       US_004_1_P coupon = new US_004_1_P();
       extentTest.info(" US_004_1_P  classindan coupon  objesi olusturuldu");

       coupon.offresBtn.click();
       extentTest.info(" Kullanici \"Offers\" butonuna tiklar.");

       coupon.coupon12.click();
       extentTest.info(" Kuponlardan kulanmak istedigini kuponu kopyalayabilmeli");

       Assert.assertTrue(coupon.coupon12.isDisplayed());
       extentTest.info("  kuponu kopyalayabildigini dogrular");

       coupon.shopsBtn.click();
       extentTest.info(" Alisveris icin Shops butonuna tiklanabilmeli");

       coupon.furnitureShopBtn.click();
       extentTest.info(" Tiklanilan(furnitre) shop tan istetigi urune gidip tiklanabilmeli");

       coupon.ashDoubleBedBtn.click();
       extentTest.info(" Acilan Pencereden urun tiklanip sepete eklenebilmeli");

       coupon.addToShoppingCartBtn.click();
       extentTest.info(" Acilan Pencereden urun tiklanip sepete eklenebilmeli");

       coupon.shoppingBasketBtn.click();
       extentTest.info(" Alisveris sepetinde urun goruntulenebilmeli");

       coupon.checkOutBtn.click();
       extentTest.info(" Alisveris sepetinde Checkout butonuna tiklanmali");

       coupon.loginBtn.click();
       extentTest.info(" Kayit sayfasi gelmeli (demo kayitli musteri olrak) chockout sayfasina gidebilmeli");

       coupon.checkAvailabilityBtn.click();
       extentTest.info(" Check availibility butonuna tiklanabilmeli");

       coupon.doYouHaveCouponBtn.click();
       extentTest.info(" Do you have Coupon? Textine tiklayip");

       coupon.pasteCouponBtn.click();
       extentTest.info(" alilan bolume kopyalanan kupon yapistirilmali");

       Actions actions = new Actions(Driver.getDriver());
       actions.keyDown(Keys.CONTROL).sendKeys("V").perform();
       extentTest.info("  Action objesi ile alilan bolume kopyalanan kupon yapistirilmali");

       coupon.applyBtn.click();
       extentTest.info("  apply butonuna tiklnmali");

 double beforePrice = Double.parseDouble(coupon.totalBefore.getText().substring(1));
    System.out.println("beforePrice = " + beforePrice);
       double afterPrice = Double.parseDouble(coupon.totalAfter.getText().substring(1));
       System.out.println("afterPrice = " + afterPrice);

       Assert.assertNotEquals(beforePrice, afterPrice);
       extentTest.info("  Kupon indirim tutarinin toplam tutardan indirildigi  gozlemlenmeli");


   }


}
