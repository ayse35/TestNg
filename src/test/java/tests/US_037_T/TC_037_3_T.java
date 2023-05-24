package tests.US_037_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.pages.HomePages_36_37;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

public class TC_037_3_T extends TestBaseReports {



    @Test
    public void test03() throws InterruptedException {


        Driver.getDriver().get(ConfigReader.getProperty("url"));

        HomePages_36_37 hp=new HomePages_36_37();
        hp.groceryButton.click();
        extentTest.info("kullanıcı grocery sekmesine gider");
        hp.clothing.click();

        Actions pp = new Actions(Driver.getDriver());
        pp.click(hp.clothingpage).sendKeys(Keys.PAGE_DOWN).build().perform();

        hp.outerWear.click();

        hp.Cowlneck.click();

        hp.AddToCart.click();
        extentTest.info("ürünü seçer  ");


        String stok=hp.piecesavaible.getText().substring(0,2);

        int stoknumber= Integer.parseInt(stok);//16 gelecek

        for (int i = 1; i <stoknumber+3 ; i++) {
            hp.plus2.click();

        }
        String cart=hp.sepettekiurun.getText();

        int cardnumber= Integer.parseInt(cart);

        Assert.assertEquals(cardnumber, stoknumber);

        extentTest.info("ürünün stoktakinden daha fazla ekleyemediğini test eder");

        extentTest.pass("testin geçtiği görülür");


















    }
}