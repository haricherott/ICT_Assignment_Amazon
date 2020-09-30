package TestMethods;

import MainRun.Common;
import Pages.HomePage;
import Pages.Search;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchTest extends Common {
    @Test
    public void validateLogin()throws IOException{
        Search search = new Search(getDriver());
        HomePage homePage=new HomePage(getDriver());
        //Search.EnterSearch("i phone");



    }
}
