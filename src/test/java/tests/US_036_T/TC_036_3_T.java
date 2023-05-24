package tests.US_036_T;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pages.HomePages_36_37;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;



/*
Kategoriler kullaniciya ilgili aramayi yapma imkani sunmali

1)Kullanıcı scroll down yapabilmeli
2)Ürünler Üzerinde gezebilmeli
3)Ürün seçebilmeli
4)fiyat görüntülenmeli





 */

public class TC_036_3_T extends TestBaseReports {


    @Test
    public void test04() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));

        HomePages_36_37 hp=new HomePages_36_37();

        hp.groceryButton.click();
        extentTest.info("kullanıcı grocery button clicked");

        hp.clothing.click();

        Actions pp = new Actions(Driver.getDriver());
        pp.click(hp.search).sendKeys("Pants").perform();
        extentTest.info("kullanıcı searh button aramak istediği ürüü yazar");



        hp.searchButton.click();
        extentTest.info("kullanıcı arama butonuna tıklar");




        for (int i = 0; i < hp.clothingsCategories.size(); i++) {
            Assert.assertTrue(hp.clothingsCategories.get(i).isDisplayed());
        }



         System.out.println("hp.clothingsCategories.size() = " + hp.clothingsCategories.size());



    }
}