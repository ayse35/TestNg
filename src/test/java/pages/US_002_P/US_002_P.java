package pages.US_002_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_002_P {

    public US_002_P() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // 01
    @FindBy(linkText = "Contact")
    public WebElement contactButton;

    @FindBy(xpath = "//span[text()='Address']")
    public WebElement address;

    @FindBy(xpath = "//span[text()='Phone']")
    public WebElement phone;

    @FindBy(xpath = "//span[text()='Website']")
    public WebElement webSite;

    @FindBy(linkText = "Visit This Site")
    public WebElement visitTheSite;

    // 02
    @FindBy(xpath = "(//a[@target='_blank'])[3]")
    public WebElement facebookLink;

    // 03
    @FindBy(xpath = "(//a[@target='_blank'])[4]")
    public WebElement twitterLink;

    // 04
    @FindBy(xpath = "(//a[@target='_blank'])[5]")
    public WebElement instagramLink;

    // 05
    @FindBy(id = "name")
    public WebElement nameBox;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement succeesfulAlert;

    // 6
    @FindBy(xpath = "//p[text()='The provided email address format is not valid']")
    public WebElement gecersizEmailMesaj;

    // 7
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//p[text()='You must need to provide your name']")
    public WebElement nameUyariMesaj;

    @FindBy(xpath = "//p[text()='You must need to provide your email address']")
    public WebElement EmailUyariMesaj;

    @FindBy(xpath = "//p[text()='What subject do you want to discuss with us?']")
    public WebElement subjectUyariMesaj;

    @FindBy(xpath = "//p[text()='Tell us more about it']")
    public WebElement descriptionUyariMesaj;

}

