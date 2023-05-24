package pages.US_041_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_041_1_P {

    public US_041_1_P() {

        PageFactory.initElements(Driver.getDriver(), this);

    }




    @FindBy(xpath = "//*[text()='Join']")
    public WebElement joinButton;


    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailButton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[text()='Grocery']") // grcery butonun locate edildi
    public WebElement groceryButton;
    // @FindBy(xpath= "//span[@class='whitespace-nowrap']") // grcery butonun locate edildi
    // public WebElement groceryButton;


    @FindBy(xpath = "//span[text()='Furniture']")
    public WebElement furnitureButton;

    @FindBy(xpath = "(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[1]")
    public WebElement ilkurunButton;

    @FindBy(xpath = "(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[2]") //ikinci ürün locate
    public WebElement ikinciUrunButton;

   // @FindBy(xpath = "(//button[@type='button'])[3]")
    //public WebElement favoriButton;
    @FindBy(xpath = "/html/body/div/div/div[1]/div[1]/article/div[1]/div[2]/div[1]/div[1]/span/button")
    public WebElement favoriButton;


   // @FindBy(xpath = "(//button[@type='button'])[2]") //kullanıcı-profil kısmının locate
   // public WebElement kullaniciButton;
   // @FindBy(xpath = "//span[text()='user avatar']") //kullanıcı-profil kısmının locate
   // public WebElement kullaniciButton;
    @FindBy(id= "headlessui-menu-button-21") //kullanıcı-profil kısmının locate
    public WebElement kullaniciButton;


    @FindBy(id ="headlessui-menu-item-28")
    public WebElement myWishListButton;


    @FindBy(linkText ="Brown Hardwood Double Bed")
    public WebElement sepetekiUrun;

}
