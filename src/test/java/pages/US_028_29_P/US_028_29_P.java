package pages.US_028_29_P;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_028_29_P {

    WebDriver driver;
    public US_028_29_P() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//img[@alt='Apples']")
    public WebElement apples;
    @FindBy(xpath = "//img[@alt='Lime']")
    public WebElement lime;

    @FindBy(xpath = "//del[@class='text-sm font-normal text-muted ltr:ml-2 rtl:mr-2 md:text-base']")
    public  WebElement eskiFiyat;

    @FindBy(xpath = "//ins[@class='text-2xl font-semibold text-accent no-underline md:text-3xl']")
    public  WebElement guncelFiyat;

    @FindBy(xpath = "//div[@class='rounded-full bg-yellow-500 px-3 text-xs font-semibold leading-6 text-light ltr:ml-auto rtl:mr-auto']")
    public  WebElement indirimOrani;

    @FindBy(xpath = "//div[@class='mb-3 w-full lg:mb-0 lg:max-w-[400px]']")
    public  WebElement sepeteEkle;

    @FindBy(xpath = "//button[@class='cursor-pointer p-2 transition-colors duration-200 hover:bg-accent-hover focus:outline-none px-5'][1]")
    public  WebElement sepettenAzalt;






}
