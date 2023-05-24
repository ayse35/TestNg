package pages.US_008_009_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_08_09_P {

    public US_08_09_P() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='whitespace-nowrap']")
    public WebElement GroceryTab;


    @FindBy(id= "headlessui-menu-item-6")
    public WebElement BakeryTab;


    @FindBy(id= "headlessui-menu-item-7")
    public WebElement MakeupTab;

    @FindBy(id= "headlessui-menu-item-8")
    public WebElement BagsTab;

    @FindBy(id= "headlessui-menu-item-9")
    public WebElement ClothingTab;

    @FindBy(id= "headlessui-menu-item-10")
    public WebElement FurnitureTab;

    @FindBy(id= "headlessui-menu-item-11")
    public WebElement DailyNeedsTab;


    @FindBy(id= "headlessui-menu-item-12")
    public WebElement BooksTab;

    @FindBy(id= "search")
    public WebElement Search;



    @FindBy(xpath = "//h3[@role='button']")
    public List<WebElement> makeUpItem;

    @FindBy( xpath="//button[text()='Search']")
    public WebElement searchButton;


    @FindBy(xpath = "//h3[@role='button']")
    public List<WebElement> searchedMakeUp;




}
