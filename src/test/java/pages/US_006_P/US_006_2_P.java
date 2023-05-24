package pages.US_006_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_006_2_P {
    public US_006_2_P(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[text()='Join']")
    public WebElement join;

    @FindBy(id="email")
    public WebElement emaillocate;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='The credentials was wrong!']")
    public WebElement noEnteredPage;

    @FindBy(xpath = "//button[text()='Forgot password?']")
    public WebElement forgotPassword;
}
