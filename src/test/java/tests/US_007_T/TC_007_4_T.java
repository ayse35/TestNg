package tests.US_007_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_007_P.US_007_4_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReports;

public class TC_007_4_T extends TestBaseReports {


    @Test
    public void us_007_4_T() throws InterruptedException {
        extentTest = extentReports.createTest("PickBazarTest", "us_007_4_T() test case");
        extentTest.info("WishListden urun kaldirinca \"Successfully Removed from Wishlist!\" mesaji gorulmelidir");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("ConfigReader ile Urly gidildi");

        US_007_4_P customer4 = new US_007_4_P();
        extentTest.info(" US_007_4_P  classindan customer4  objesi olusturuldu");

        customer4.joinBtn.click();
        extentTest.info("Kullanici \"join\" butonuna tiklar.");

        customer4.loginBtn.click();
        extentTest.info("Kullanici demo acaunt u  ile giris yapar");
        ReusableMethods.waitForClickablility(customer4.shopsBtn,10);
     //   customer4.avatarBtn.click();
      //  extentTest.info("Kullanici demo acaunt u  ile giris yapar gorur");

        customer4.shopsBtn.click();
        extentTest.info("Kullanici Shops bolumunden (Furniture shop) a gider");

        customer4.furnitureShopBtn.click();
        extentTest.info("Kullanici  (Furniture shop) a gider");

        customer4.ashDoubleBedBtn.click();
        extentTest.info("lk urun olan AshDouble Bed i tilar ");

        customer4.ashDoubleBedFavoriteBtn.click();
        extentTest.info("favori butonuna tiklar");
        ReusableMethods.waitForClickablility(customer4.avatarBtn,10);

        customer4.avatarBtn.click();
        extentTest.info("Kullanici avatar sembolu uzerine tiklar");

        customer4.myWishLIstBtn.click();
        extentTest.info("Wish list butonuna tiklar ve sayfaya gider");

       //customer4.ashDoubleBedBtn.click();
       // extentTest.info("Favoriye alinmis urunlerden istemedigi bir urunun remove butonuna tiklar");

        customer4.favoriteRemoveBtn.click();
        extentTest.info("Favoriye alinmis urunlerden istemedigi bir urunun remove butonuna tiklar");

        ReusableMethods.waitForVisibility(customer4.succeesfulAlert,10);
        String actualAlertMessage =customer4.succeesfulAlert.getText();



        String expectedAlertMessage ="Successfully Removed from Wishlist!";



        Assert.assertEquals(actualAlertMessage, expectedAlertMessage );
        extentTest.pass("Test pssed bey seing same message; Successfully Removed from Wishlist! ");








    }

    }
