package Pages;

import TestMethods.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends LoginTest {
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    private WebElement txt_email;
    @FindBy(xpath = "//*[@id=\"continue\"]")
    private WebElement btn_continue;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    private WebElement txt_pwd;
    @FindBy(xpath="//*[@id=\"signInSubmit\"]")
    private WebElement btn_login;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    private WebElement btn_signin;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    public void enterUserNameAndPassword(String userName,String pwd) throws IOException {
        btn_signin.click();
        txt_email.sendKeys(userName);
        btn_continue.click();
        txt_pwd.sendKeys(pwd);
        btn_login.click();
    }
}
