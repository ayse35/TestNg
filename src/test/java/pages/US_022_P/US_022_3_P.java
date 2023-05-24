package pages.US_022_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_022_3_P {
    public US_022_3_P(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[text()='Grocery'])[1]")
    public WebElement groceryButton;

    @FindBy(xpath = "//span[text()='Daily Needs']")
    public WebElement dailyNeedsButton;

    @FindBy(xpath = "//h3[text()='Vegetables']")
    public WebElement vegetablesButton;

    @FindBy(xpath = "//h3[text()='Allium']")
    public WebElement alliumButton;

    @FindBy(xpath = "(//span[text()='Add'])[1]")
    public WebElement addButton;

    @FindBy(xpath = "//button[@class='hidden product-cart lg:flex relative']")
    public WebElement sepetButton;

    @FindBy(xpath = "(//h3[text()='Fresh chopped chives 1lbs'])[2]")
    public WebElement sepettekiUrun;

    @FindBy(xpath = "(//span[text()='$2.29'])[2]")
    public WebElement sepettekiUrunFiyat;

    //sonradan ekledim snacks bolumunu
    @FindBy(xpath = "//h3[text()='Snacks']")
    public WebElement snacksButton;

    //h3[text()='Crisps']
    @FindBy(xpath = "//h3[text()='Crisps']")
    public WebElement crispsButton;


    @FindBy(xpath = "(//h3[text()='Lays Classic 74g'])[2]")
    public WebElement sepettekiUrunCips;

    @FindBy(xpath = "(//span[text()='$4.49'])[2]")
    public WebElement sepettekiUrunCipsFiyat;


    @FindBy(xpath = "//span[text()='Checkout']")
    public WebElement sepetCheckout;
}
