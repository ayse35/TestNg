package tests.US_009_T;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.US_008_009_P.US_08_09_P;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReports;

import java.util.ArrayList;
import java.util.List;

public class US_09_1_T extends TestBaseReports {



     @Test
     public void grocery() throws InterruptedException {
          extentTest = extentReports.createTest("Grocery Test");
          Driver.getDriver().get(ConfigReader.getProperty("url"));
          extentTest = extentReports.createTest(" Kullanıcı URL ye gider ");
          US_08_09_P hp = new US_08_09_P();
          hp.GroceryTab.click();
          Actions act = new Actions(Driver.getDriver());
          act.sendKeys(Keys.ESCAPE);
          hp.MakeupTab.click();

          List<String> makeUpList = new ArrayList<String>();


          for (WebElement element : hp.makeUpItem) {
               String str[] = element.getText().toLowerCase().split(" ");
               if (!makeUpList.contains(str[0])) {
                    makeUpList.add(str[0]);
               }
          }
          System.out.println(makeUpList);
          extentTest = extentReports.createTest("MakeUp sayfasında bulunan ürünlerin adlarıyla  unique bir liste oluşturuldu");
          System.out.println(makeUpList.size());

          for (int i = 0; i < makeUpList.size(); i++) { //MakeUPList.size()
               System.out.println(makeUpList.get(i));
               hp.Search.sendKeys(makeUpList.get(i));
               hp.searchButton.click();
               extentTest = extentReports.createTest("m sayfasında bulunan ürünlerin her bir kelimesi, search box da arandı");

               Thread.sleep(3000);
               Actions actions = new Actions(Driver.getDriver());
               actions.scrollToElement(hp.Search).perform();
               Thread.sleep(3000);
             //  ReusableMethods.waitForVisibility(hp.searchedMakeUp,5000);
               hp.Search.clear();
               extentTest = extentReports.createTest("Aranan her kelime sonunda, search box kutuusna tekrar gidilip  search box temizlendi");
               Thread.sleep(3000);
               for (WebElement element : hp.searchedMakeUp) {
                    Assert.assertTrue(element.getText().toLowerCase().contains(makeUpList.get(i)));
                    extentTest = extentReports.createTest("Aranan kelimenin  bags sayfasındaki üürnler arasında olup olmadığı kontrol edildi");
               }



          }

     }

}

