package tests.US_037_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pages.HomePages_36_37;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_037_5_T extends TestBaseReports {




    @Test
    public void test04() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        HomePages_36_37 hp=new HomePages_36_37();
        hp.groceryButton.click();
        hp.clothing.click();
        extentTest.info("ürübler sekmesine gidilir");

        Actions pp = new Actions(Driver.getDriver());
        pp.click(hp.clothingpage).sendKeys(Keys.PAGE_DOWN).build().perform();

        extentTest.info("sayfada gezebilmeli");

        hp.outerWear.click();
        hp.Cowlneck.click();
        String sepettenonce=hp.price.getText();
        extentTest.info("sepetten önceki fitat gözlenir");


        System.out.println(sepettenonce);


        hp.AddToCart.click();


        pp.click(hp.clothingpage).sendKeys(Keys.ESCAPE).perform();

        hp.Item.click();
        String sepettensonra=hp.sepettensonra.getText();
        extentTest.info("sepetten sonraki ürünler gözlenir");
        System.out.println(sepettensonra);
        Assert.assertEquals(sepettenonce, sepettensonra);
        extentTest.pass("sepetten önceki ve sepetten sonraki ürün fiyatı gözlenir");












    }
}