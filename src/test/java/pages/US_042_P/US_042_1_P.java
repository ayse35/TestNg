package pages.US_042_P;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_042_1_P {

    public US_042_1_P (){

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

    @FindBy(xpath = "(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[1]")
    public WebElement ilkurunButton;

    @FindBy(xpath = "(//div[@class='relative flex h-48 w-auto items-center justify-center sm:h-64'])[2]") //ikinci ürün locate
    public WebElement ikinciUrunButton;


    @FindBy(xpath= "//*[text()='Add To Shopping Cart']") //sepete ekle locate
    public WebElement addToChartButton;

    @FindBy(xpath= "//span[@class='bg-light rounded w-full py-2 px-2 text-accent mt-3']") //sepeti gör locate
    public WebElement sepetigittButton;




}
