package pages.US_024_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_024_1_P {
    public US_024_1_P(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[text()='Grocery'])[1]")
    public WebElement groceryButton;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksButton;

    @FindBy(xpath = "(//a[@href='/products/the-children-story'])[1]")
    public WebElement firstBook;

    @FindBy(xpath = "//h2[text()='Details']")
    public WebElement detailsButton;


}
