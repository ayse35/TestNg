package pages.US_007_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_007_2_P {

    public US_007_2_P(){
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

    //   //span[text()='user avatar']
    //   //button[@id='headlessui-menu-button-8']

    @FindBy(xpath="//button[@id='headlessui-menu-button-8']")
    public WebElement avatarBtn;

    //  //button[text()='Profile']

    @FindBy(xpath="//button[text()='Profile']")
    public WebElement profileBtn;

    //   //a[text()='Change Password']
    @FindBy(xpath="//a[text()='Change Password']")
    public WebElement changePasswordBtn;

    //   //input[@id='oldPassword']
    @FindBy(xpath="//input[@id='oldPassword']")
    public WebElement oldPasswordInput;


    //   //input[@id='newPassword']
    @FindBy(xpath="//input[@id='newPassword']")
    public WebElement newPasswordInput;


    //   //input[@id='passwordConfirmation']
    @FindBy(xpath="//input[@id='passwordConfirmation']")
    public WebElement confirmPasswordInput;



    //   //button[text()='Submit']
    @FindBy(xpath="//button[text()='Submit']")
    public WebElement saveBtn;

    //    Alert Mesaji icin
    @FindBy(xpath="")
    public WebElement alertMessage;





}
