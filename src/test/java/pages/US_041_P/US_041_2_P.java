package pages.US_041_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_041_2_P {

    public US_041_2_P (){

        PageFactory.initElements(Driver.getDriver(),this);

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


    @FindBy(xpath = "//span[text()='Bed']") //kategorilerden sadece "bed" locate alındı
    public WebElement bedtButton;





}
