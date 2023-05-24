package pages.US_007_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_007_4_P {

    public US_007_4_P(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //   //button[text()='Join']
    @FindBy(xpath="//button[text()='Join']")
    public WebElement joinBtn;


    //  Demo registration  page

    //    //input[@id='email']
    @FindBy(xpath="//input[@id='email']")
    public WebElement emailBtn;

    //   //input[@id='password']
    @FindBy(xpath="//input[@id='password']")
    public WebElement passwordBtn;


    @FindBy(xpath="//button[text()='Login']")
    public WebElement loginBtn;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement succeesfulAlert;
    @FindBy(xpath="//a[text()='Shops']")
    public WebElement shopsBtn;

    //  //span[text()='Furniture Shop']

    @FindBy(xpath="//span[text()='Furniture Shop']")
    public WebElement furnitureShopBtn;


    //  //h3[text()='Ash Double Bed']

    @FindBy(xpath="//h3[text()='Ash Double Bed'] ")
    public WebElement ashDoubleBedBtn;

    // (//button[@type='button'])[3]     favorite button

    @FindBy(xpath="(//button[@type='button'])[3] ")
    public WebElement ashDoubleBedFavoriteBtn;



    //   //span[text()='user avatar']
    //    //   //button[@id='headlessui-menu-button-8']

    @FindBy(xpath="//button[@id='headlessui-menu-button-8']")
    public WebElement avatarBtn;


    //   //button[text()='My Wishlists']
    @FindBy(xpath="//button[text()='My Wishlists']")
    public WebElement myWishLIstBtn;



    //   (//button[text()='Remove'])[1]
    @FindBy(xpath="(//button[text()='Remove'])[1]")
    public WebElement favoriteRemoveBtn;






    //    Alert Mesaji icin
    @FindBy(xpath="")
    public WebElement alertMessage;





}
