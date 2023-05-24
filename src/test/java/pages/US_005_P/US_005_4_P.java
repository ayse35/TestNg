package pages.US_005_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_005_4_P {

    public US_005_4_P(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText ="Shops")
    public WebElement shopsButton;

    @FindBy(xpath ="//span[text()='Furniture Shop']" )
    public WebElement FurnitureShop;

    @FindBy(xpath ="//*[text()='Deluxe Mahagony Double Bed']")
    public WebElement  DeluxeMahagonyDoubleBed;

    @FindBy(xpath = "//span[text()='Add To Shopping Cart']")
    public WebElement sepetteUrunEkle;

    @FindBy(xpath = "//span[text()='1 Item']")
    public WebElement sepet;

    @FindBy(xpath= "//span[text()='Checkout']")
    public WebElement checkout;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//button[text()='Check Availability']")
    public WebElement CheckAvailability;

    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement PlaceOrder;


    @FindBy(xpath = "//span[text()='Unavailable']")
    public WebElement unavailable;









}
