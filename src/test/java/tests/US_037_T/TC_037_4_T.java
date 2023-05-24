package tests.US_037_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pages.HomePages_36_37;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_037_4_T extends TestBaseReports {




    @Test
    public void test04() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePages_36_37 hp=new HomePages_36_37();
        hp.groceryButton.click();
        hp.clothing.click();
        extentTest.info("Kullanıcı ürün sayfasına geçer");

        Actions pp = new Actions(Driver.getDriver());
        pp.click(hp.clothingpage).sendKeys(Keys.PAGE_DOWN).build().perform();

        hp.outerWear.click();

        hp.Cowlneck.click();


         hp.AddToCart.click();
         String ilkdeger=hp.number.getText();
         int ilkdeger1= Integer.parseInt(ilkdeger);//ilke değer 1
        extentTest.info("ürün seçimi yapar ve listesine ekler");

         hp.plus2.click();
         hp.plus2.click();
         String ikincideger=hp.number.getText();
         int ikincideger2= Integer.parseInt(ikincideger);//ikinci degwer üç
        Assert.assertNotEquals(ilkdeger1,ikincideger2);
         hp.minus2.click();
         extentTest.info("ürün artışı ve eksiltmesi yapar");
         String ucuncudeger=hp.number.getText();
         int ucuncudeger3= Integer.parseInt(ucuncudeger);
         Assert.assertNotEquals(ucuncudeger,ikincideger2);
         extentTest.pass("testin geçtiği gözlenir");






       // pp.click(hp.clothingpage).sendKeys(Keys.ESCAPE).perform();

       // hp.Item.click();



        //hp.minus.click();
       // hp.plus.click();






    }
}