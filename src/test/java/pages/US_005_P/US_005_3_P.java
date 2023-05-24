package pages.US_005_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_005_3_P {
    public US_005_3_P(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText ="Shops")
    public WebElement shopsButton;

    @FindBy(xpath ="//span[text()='Furniture Shop']" )
    public WebElement FurnitureShop;

    @FindBy(xpath ="//*[text()='Castlery Double Sofa']")
    public WebElement CastleryDoubleSofa;

    @FindBy(xpath = "//span[text()='Add To Shopping Cart']")
    public WebElement sepetteUrunEkle;

    @FindBy(xpath = "//span[text()='1 Item']")
    public WebElement sepet;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100'])[2]")
    public WebElement sepetteUrunArtir;
    @FindBy(xpath ="/html/body/reach-portal/div/aside/div/div[2]/div/div/div/div[4]/div/div/section/div/div/div[1]/div/div")
    public WebElement artirDogrula;

    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none hover:!bg-gray-100'])[1]")
    public WebElement sepetteUrunAzalt;

    @FindBy(xpath = "/html/body/reach-portal/div/aside/div/div[2]/div/div/div/div[4]/div/div/section/div/div/div[1]/div/div")
    public WebElement azaltDogrula;
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


    @FindBy(xpath = "//button[text()='Pay']")
    public WebElement pay;
    @FindBy(xpath = "//span[text()='Payment Success']")
    public WebElement paySuccess;
    @FindBy(xpath = "//img[@alt='user name']")
    public WebElement userAvatar;
    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement logout;
}
