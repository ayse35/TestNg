package tests.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePages_36_37 {




    public HomePages_36_37() {

        PageFactory.initElements(Driver.getDriver(), this);







    }

    @FindBy(xpath = "(//span[text()='Grocery'])[1]")
    public WebElement groceryButton;


    @FindBy(id = "headlessui-menu-item-9")

    public WebElement clothing;


    @FindBy(xpath = "//div[@class='os-resize-observer-host observed']")

    public WebElement clothings;


    @FindBy(tagName = "h1")

    public WebElement clothingpage;


    @FindBy(xpath ="//li[@class='rounded-md py-1']")
//"rounded-md py-1"
    public List<WebElement> clothingsCategories;


    @FindBy(xpath = "//input[@type='text']")
    public WebElement search;


    @FindBy(xpath = "//button[text()='Search']")

    public WebElement searchButton;


    @FindBy(xpath = "//span[text()='Outer Wear']")

    public WebElement outerWear;


    @FindBy(xpath = "//span[text()='Blazer']   ")
    public WebElement Blazer;


    @FindBy(tagName = "h3")

    public WebElement plus;



    @FindBy(xpath = "//*[text()='M']")

    public WebElement size;


    @FindBy(xpath = "//div[@class='mt-4']")


    public WebElement AddToShoppingCart;

    @FindBy(xpath = "(//span[@class='h-full w-full rounded-full border border-border-200'])[1]")
    public WebElement color2;


    @FindBy(xpath = "(//*[text()='plus'])[1]")

    public WebElement NarrowNotch;//plus aktif değil


    @FindBy(xpath = "//img[@alt='Cowl Neck Kangaroo Pocket Color Block Hoodie']")
    public WebElement Cowlneck;//renk yok


    @FindBy(xpath = "(//*[text()='Add To Shopping Cart'])[2]")

    public WebElement AddToCart;


    @FindBy(xpath = "//span[@class='whitespace-nowrap text-base text-body ltr:lg:ml-7 rtl:lg:mr-7']")
    public WebElement pieces;


    @FindBy(xpath = "(//span[@class='sr-only'])[52]")
    public WebElement minus;

    @FindBy(xpath = "//*[contains(text(),'1 Item')]")
    public WebElement Item;


    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'])[4]")
    public WebElement plus2;


    @FindBy(xpath = "(//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'])[3]")
    public WebElement minus2;

    @FindBy(xpath = "(//div[@class='flex flex-1 items-center justify-center px-3 text-sm font-semibold'])[3]")
    public WebElement number;

    @FindBy(xpath = "//ins[@class='text-2xl font-semibold text-accent no-underline md:text-3xl']")
    public WebElement price;

    @FindBy(xpath="//span[@class='bg-light rounded w-full py-2 px-2 text-accent mt-3']")
    public WebElement sepettensonra;

    @FindBy(xpath = "//span[@class='whitespace-nowrap text-base text-body ltr:lg:ml-7 rtl:lg:mr-7']")
    public WebElement piecesavaible;

    @FindBy(xpath = "(//div[@class='flex flex-1 items-center justify-center px-3 text-sm font-semibold'])[3]")
    public WebElement sepettekiurun;

    @FindBy(xpath  ="//button[starts-with(text(),'Join')]")
    public WebElement join;

    @FindBy(xpath ="//button[starts-with(text(),'Login')]")
    public WebElement login;

    @FindBy(xpath = "(//span[starts-with(text(),'Grocery')])[1]")
    public WebElement grocerytabgiris;

    @FindBy(xpath = "(//span[contains(text(),'Clothing')])[1]")
    public WebElement clothing2;

    @FindBy(xpath = "//button[@class='mt-0.5 flex h-10 w-10 shrink-0 items-center justify-center " +
            "rounded-full border border-gray-300 transition-colors mr-1']")
    public WebElement kalp;

    @FindBy(id="headlessui-menu-button-8")
    public WebElement canavar;

    @FindBy(xpath = "//*[text()='My Wishlists']")
    public WebElement mywishlists;

    @FindBy(xpath = "(//span[@class='h-full w-full rounded-full border border-border-200'])[1]")
    public WebElement color3;


    @FindBy(xpath = "//span[text()='Jacket']")
    public WebElement jacket;



    //img[@alt='Loap Jerryk Mens Winter City Jacket Red']

    @FindBy(xpath = "img[@alt='Loap Jerryk Mens Winter City Jacket Red']")
    public WebElement redJacket;//pasif

    @FindBy(xpath = "(//li[@class='rounded-md py-1'])[3]")
    public WebElement Pants;

    @FindBy(xpath = "//img[@alt='Invictus']")
    public WebElement Invictuspants;

    @FindBy(xpath = "(//span[@style='background-color: rgb(52, 79, 161);'])[2]")
    public WebElement Invictuspantscolor;

    @FindBy(xpath ="(//div[@role='button'])[11]")
    public WebElement Invictuspantssize;

    //div[@role='button']











}
