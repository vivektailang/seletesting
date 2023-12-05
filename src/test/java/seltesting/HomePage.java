package seltesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    //Page URL
    private static String PAGE_URL = "https://github.com/";
    private WebDriver driver;

    //Locators
    //SignIn Button
    @FindBy(xpath = "//a[@class='HeaderMenu-link no-underline mr-3']")
    private WebElement signInButton;
    //UserAvatar
    @FindBy(xpath = "//span[@class='flex-shrink-0 css-truncate css-truncate-target']")
    private WebElement userAvatar;

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public String getNameOfLoggedInUser() {
        return userAvatar.getText();
    }
}