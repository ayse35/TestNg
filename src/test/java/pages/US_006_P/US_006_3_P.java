package pages.US_006_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_006_3_P {
    public US_006_3_P(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Join']")
    public WebElement join;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement login;

    @FindBy(id="headlessui-menu-button-8")
    public WebElement loginIcon;

    @FindAll({
            @FindBy(xpath = "//button[text()='Profile']"),
            @FindBy(xpath = "//button[text()='My Orders']"),
            @FindBy(xpath = "//button[text()='My Wishlists']"),
            @FindBy(xpath = "//button[text()='Checkout']"),
            @FindBy(xpath = "//button[text()='Logout']")

    })
    public List<WebElement> allMenuItems;

    @FindBy(xpath = "//button[text()='Profile']")
    public WebElement profile;
    @FindBy(xpath = "//button[text()='My Orders']")
    public WebElement myOrders;
    @FindBy(xpath = "//button[text()='My Wishlists']")
    public WebElement myWishlists;
    @FindBy(xpath = "//button[text()='Checkout']")
    public WebElement checkout;
    @FindBy(xpath = "//a[text()='Profile']")
    public WebElement profileTrue;

    @FindBy(id="headlessui-menu-button-18")
    public WebElement loginIcon1;

    @FindBy(id="headlessui-menu-button-28")
    public WebElement loginIcon2;

    @FindBy(id="headlessui-menu-button-38")
    public WebElement loginIcon3;

    @FindBy(id="headlessui-menu-button-48")
    public WebElement loginIcon4;



    @FindBy(xpath = "//h3[text()='My Orders']")
    public WebElement myOrdersTrue;
    @FindBy(xpath = "//h1[text()='My Wishlists']")
    public WebElement myWishlistsTrue;
    @FindBy(xpath = "//span[text()='Your Order']")
    public WebElement yourOrder;
    @FindBy(xpath = "//button[text()='Logout']")
    public WebElement logout;
    @FindBy(xpath = "//p[text()='Login with your email & password']")
    public WebElement loginWithEmailAndPassword;
}
