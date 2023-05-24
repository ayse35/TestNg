package tests.US_006_T;

import com.beust.ah.A;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_006_P.US_006_3_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_006_3_T extends TestBaseReports {
    @Test
    public void TC_006_3_T() {
        extentTest=extentReports.createTest("TC_006_3_T","kullanıcı bölümündeki seçeneklere ulaşır ve erişebilir");
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("Sayfaya gidildi");

        US_006_3_P hp=new US_006_3_P();

        hp.join.click();
        extentTest.info("Sayfa da join buttonu tıklandı");

        hp.email.clear();
        hp.email.sendKeys(ConfigReader.getProperty("email"));
        extentTest.info("Email adresi girildi");

        hp.password.clear();
        hp.password.sendKeys(ConfigReader.getProperty("password"));
        extentTest.info("password girildi");

        hp.login.click();
        extentTest.info("login button tiklandi");

        hp.loginIcon.click();
        extentTest.info("kullanıcı bölümü tıklandı");


        Assert.assertEquals(5,hp.allMenuItems.size());
        extentTest.info("kullanıcı bölümündeki seçeneklere erişebilir");

        hp.profile.click();
        extentTest.info("profile tıklandı");

        Assert.assertTrue(hp.profileTrue.getText().contains("Profile"));
        extentTest.info("profile sayfasında olduğu doğrulandı");

        hp.loginIcon1.click();
        extentTest.info("kullanıcı bölümü tıklandı");

        hp.myOrders.click();
        extentTest.info("my orders tıklandı");

        Assert.assertTrue(hp.myOrdersTrue.getText().contains("My Orders"));
        extentTest.info("my orders sayfasında olduğu doğrulandı");
        hp.loginIcon2.click();
        extentTest.info("kullanıcı bölümü tıklandı");

        hp.myWishlists.click();
        extentTest.info("my wishlist sayfası tıklandı");

        Assert.assertTrue(hp.myWishlistsTrue.getText().contains("My Wishlists"));
        extentTest.info("My Wishlist sayfasınada olduğu doğrulandı");

        hp.loginIcon3.click();
        extentTest.info("kullanıcı bölümü tıklandı");

        hp.checkout.click();
        extentTest.info("checkout sayfasına gidildi");

        Assert.assertTrue(hp.yourOrder.getText().contains("Your Order"));
        extentTest.info("checkout sayfasında olduğu doğrulandı");

        hp.loginIcon4.click();
        extentTest.info("kullanıcı bölümü tıklandı");
        hp.logout.click();
        extentTest.info("lagout tıklandı");

        Assert.assertTrue(hp.loginWithEmailAndPassword.getText().contains("Login with your email & password"));
        extentTest.info("lagout yapıldığı için kullanıcı giriş sayfası görüntülendi");

        Driver.closeDriver();
        extentTest.info("Driver kapatıldı");
        extentTest.pass("kullanıcı bölümündeki seçeneklere ulaştı ve sayfalara erişebildi");



    }
}
