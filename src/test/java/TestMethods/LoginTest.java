package TestMethods;

import MainRun.Common;
import Pages.HomePage;
import Pages.LoginPage;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends Common {
    @Test
    public void validateLogin()throws IOException {
        LoginPage loginPage=new LoginPage(getDriver());
        HomePage homePage=new HomePage(getDriver());
        //user your amazon login id and pass
        loginPage.enterUserNameAndPassword("haricherott@gmail.com","cherotthouse");
        boolean loginFlag=homePage.isWelcomeMessagePresent();
        if(loginFlag==true){
            extentTest=reports.createTest("LOGIN");
            extentTest.log(Status.PASS,"Login Passed");
            extentTest.addScreenCaptureFromPath(Common.takeScreenshot());
        }
        else if(loginFlag==false){
            extentTest=reports.createTest("LOGIN");
            extentTest.log(Status.FAIL,"Login Failed");
            extentTest.addScreenCaptureFromPath(Common.takeScreenshot());
        }
    }
}
