package pages.US_024_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_024_2_P {
    public US_024_2_P(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//span[text()='Grocery'])[1]")
    public WebElement groceryButton;

    @FindBy(xpath = "//span[text()='Books']")
    public WebElement booksButton;

    @FindBy(xpath = "(//a[@href='/products/the-children-story'])[1]")
    public WebElement firstBook;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@class='flex pb-0.5']")
    public WebElement sepetBook;

    @FindBy(xpath = "//span[text()='Checkout']")
    public WebElement checkOutBook;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailbutton;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    //button[text()='Check Availability']
    @FindBy(xpath = "//button[text()='Check Availability']")
    public WebElement checkAvailabilityButton;

    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement placeOrderButton;

    @FindBy(xpath = "//button[text()='Pay']")
    public WebElement payButton;

    //div[text()='payment-successful']
    @FindBy(xpath = "//div[text()='payment-successful']")
    public WebElement paymentSuccessfulButton;

    //span[text()='Payment Success']
    @FindBy(xpath = "//span[text()='Payment Success']")
    public WebElement paymentSuccessButton;

}
