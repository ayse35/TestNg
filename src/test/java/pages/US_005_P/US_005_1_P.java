package pages.US_005_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US_005_1_P {
    public US_005_1_P(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText ="Shops")
    public WebElement shopsButton;

    @FindAll({
            @FindBy(xpath = "//span[text()='Furniture Shop']"),
            @FindBy(xpath = "//span[text()='Clothing Shop']"),
            @FindBy(xpath = "//span[text()='Bags Shop']"),
            @FindBy(xpath = "//span[text()='Makeup Shop']"),
            @FindBy(xpath = "//span[text()='Bakery Shop']"),
            @FindBy(xpath = "//span[text()='Grocery Shop']"),
            @FindBy(xpath = "//span[text()='Books Shop']")
    })
    public List<WebElement> shopsCenter;

    @FindBy(xpath ="//span[text()='Furniture Shop']" )
    public WebElement FurnitureShop;

    @FindBy(xpath = "//span[text()='Address']")
    public WebElement FurnitureAddress;

    @FindBy(xpath ="//span[text()='Phone']" )
    public WebElement FurniturePhone;

    @FindBy(xpath ="//span[text()='Website']" )
    public WebElement FurnitureWebsite;

}
