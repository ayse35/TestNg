package pages.US_006_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_006_1_P {
    public US_006_1_P(){

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
}
