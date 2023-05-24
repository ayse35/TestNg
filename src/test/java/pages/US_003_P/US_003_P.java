package pages.US_003_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_003_P {

    public US_003_P() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "FAQ")
    public WebElement FAQbutton;

    @FindBy(xpath = "//h2[text()='How to contact with Customer Service?']")
    public WebElement soru1;

    @FindBy(xpath = "//h2[text()='App installation failed, how to update system information?']")
    public WebElement soru2;

    @FindBy(xpath = "//h2[text()='Website response taking time, how to improve?']")
    public WebElement soru3;

    @FindBy(xpath = "//h2[text()='How do I create a account?']")
    public WebElement soru4;

    @FindBy(xpath = "//div[@class='md:pt-1 pb-4 px-5 leading-7 text-sm md:text-base md:leading-loose text-body-dark']")
    public WebElement cevap2;

    @FindBy(xpath = "//div[@class='md:pt-1 pb-4 px-5 leading-7 text-sm md:text-base md:leading-loose text-body-dark']")
    public WebElement cevap1;

    @FindBy(xpath = "//div[@class='md:pt-1 pb-4 px-5 leading-7 text-sm md:text-base md:leading-loose text-body-dark']")
    public WebElement cevap3;

    @FindBy(xpath = "//div[@class='md:pt-1 pb-4 px-5 leading-7 text-sm md:text-base md:leading-loose text-body-dark']")
    public WebElement cevap4;

    @FindBy(xpath = "(//*[local-name()='svg' and @width='18']/*[local-name()='path'])[1]")
    public WebElement pozitifSimge1;

    @FindBy(xpath = "(//*[local-name()='svg' and @width='18']/*[local-name()='path'])[2]")
    public WebElement pozitifSimge2;

    @FindBy(xpath = "(//*[local-name()='svg' and @width='18']/*[local-name()='path'])[3]")
    public WebElement pozitifSimge3;

    @FindBy(xpath = "(//*[local-name()='svg' and @width='18']/*[local-name()='path'])[4]")
    public WebElement pozitifSimge4;

    @FindBy(xpath = "(//*[local-name()='svg' and @width='20']/*[local-name()='path'])[1]")
    public WebElement negatifSimge1;

    @FindBy(xpath = "(//*[local-name()='svg' and @width='20']/*[local-name()='path'])[1]")
    public WebElement negatifSimge2;

    @FindBy(xpath = "(//*[local-name()='svg' and @width='20']/*[local-name()='path'])[1]")
    public WebElement negatifSimge3;

    @FindBy(xpath = "(//*[local-name()='svg' and @width='20']/*[local-name()='path'])[1]")
    public WebElement negatifSimge4;






}
