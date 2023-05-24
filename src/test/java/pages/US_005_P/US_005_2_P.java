package pages.US_005_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_005_2_P {
    public US_005_2_P(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText ="Shops")
    public WebElement shopsButton;
    @FindBy(xpath ="//span[text()='Books Shop']")
    public WebElement BooksShop;

    @FindBy(xpath = "//span[text()='Address']")
    public WebElement BooksAddress;

    @FindBy(xpath ="//span[text()='Phone']" )
    public WebElement BooksPhone;

    @FindBy(xpath ="//span[text()='Website']" )
    public WebElement BooksWebsite;

}
