package tests.US_014_T;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_014_P.US_014_1_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

import java.util.ArrayList;
import java.util.List;

public class TC_014_1_T extends TestBaseReports {

    WebDriver driver;

    @Test
    public void test01() throws InterruptedException {
        // url ye gidecegiz
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        extentTest = extentReports.createTest("PickBazar ana sayfasına gidildi");


        US_014_1_P page = new US_014_1_P();
        page.groceryTab.click();
        extentTest = extentReports.createTest("Grocery Butonuna basıldı");

        page.bagTab.click();
        extentTest = extentReports.createTest("Bags sayfasuna gidildi");


        List<String> bagsList = new ArrayList<String>();


        for (WebElement element : page.bags) {
            String str[] = element.getText().toLowerCase().split(" ");
            if (!bagsList.contains(str[0])) {
                bagsList.add(str[0]);
            }
        }
        System.out.println(bagsList);
        extentTest = extentReports.createTest("Bags sayfasında bulunan ürünlerin adlarıyla  unique bir liste oluşturuldu");
        System.out.println(bagsList.size());

        for (int i = 0; i < bagsList.size(); i++) { //bagsList.size()
            System.out.println(bagsList.get(i));
            page.searchResults.sendKeys(bagsList.get(i));
            page.searchButton.click();
            extentTest = extentReports.createTest("Bags sayfasında bulunan ürünlerin her bir kelimesi, search box da arandı");

            Thread.sleep(3000);
            Actions actions = new Actions(Driver.getDriver());
            actions.scrollToElement(page.searchResults).perform();
            Thread.sleep(3000);
            page.searchResults.clear();
            extentTest = extentReports.createTest("Aranan her kelime sonunda, search box kutuusna tekrar gidilip  search box temizlendi");
            Thread.sleep(3000);
            for (WebElement element : page.searchedBags) {
                Assert.assertTrue(element.getText().toLowerCase().contains(bagsList.get(i)));
                extentTest = extentReports.createTest("Aranan kelimenin  bags sayfasındaki üürnler arasında olup olmadığı kontrol edildi");
            }



        }

    }
}


