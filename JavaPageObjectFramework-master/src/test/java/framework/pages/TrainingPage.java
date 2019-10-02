package framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TrainingPage {
    private WebDriver driver;

    //Locators

    @FindBy(how = How.ID, using = "search-key")
    public WebElement paieska;

    @FindBy(how = How.CSS, using = "input[placeholder*='min']")
    public WebElement minimalus;

    @FindBy(how = How.CSS, using = "input[placeholder*='max']")
    public WebElement maksimalus;

    @FindBy(how = How.ID, using = "search")
    public WebElement searchLaukas;

    @FindBy(how = How.XPATH, using = "//button[@class='ytp-ad-skip-button ytp-button']//div[@class='ytp-ad-text ytp-ad-skip-button-text']")
    public WebElement skip;

    @FindBy(how = How.CSS, using = "button[aria-label*='like this']")
    public WebElement like;

    @FindBy(how = How.CLASS_NAME, using = "close-layer")
    public WebElement xbutton;

    @FindBy(how = How.ID, using = "gh-ac")
    public WebElement ebaysearch;

    @FindBy(how = How.XPATH, using = "//input[@aria-label='2019']")
    public WebElement ebay2019;


    //input[@id='gh-ac']
    //Constructor
    public TrainingPage(WebDriver driver){
        this.driver=driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }
}