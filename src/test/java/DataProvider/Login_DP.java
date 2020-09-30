package DataProvider;

import org.testng.annotations.DataProvider;

public class Login_DP {

    @DataProvider(name="LoginData")
    public static Object[][] dataProviderLogin(){
        return new Object[][]{
                {"haricherott@gmail.com","cherotthouse"}
        };
    }
}
