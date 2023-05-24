package tests.US_007_T;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_007_P.US_007_3_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_007_3_T extends TestBaseReports {


    @Test
    public void us_007_3_T() {
        extentTest = extentReports.createTest("PickBazarTest", "us_007_3_T() test case");

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest.info("ConfigReader ile Urly gidildi");

        US_007_3_P customer3 = new US_007_3_P();
        extentTest.info(" US_007_3_P  classindan customer3  objesi olusturuldu");

        customer3.joinBtn.click();
        extentTest.info("Kullanici \"join\" butonuna tiklar.");

        customer3.loginBtn.click();
        extentTest.info("Kullanici demo acaunt u  ile giris yapar");

        customer3.avatarBtn.click();
        extentTest.info("Kullanici avatar sembolu uzerine tiklar ");

        customer3.myOrdersBtn.click();
        extentTest.info("Kullanici My orders bolumune tiklar ve sayfaya gider");

        customer3.orderPendingBtn.click();
        extentTest.info("Order Received butonunun ve order details I goruntulemelidir");

        System.out.println("customer3.orderPendingBtn.getText() = " + customer3.orderPendingBtn.getText());
        String orderAxtualText=customer3.orderPendingBtn.getText();
        String orderReceivedExpectedText ="Order Received";

        Assert.assertEquals(orderAxtualText,orderReceivedExpectedText);
        extentTest.fail("Test fails :because expected result and actual result doues not match");


    }

    }
