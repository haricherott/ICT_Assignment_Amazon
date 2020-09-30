package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    private WebElement txt_WelcomeMsg;
    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public boolean isWelcomeMessagePresent()
    {
        try {
            return txt_WelcomeMsg.isDisplayed();
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
