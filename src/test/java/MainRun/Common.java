package MainRun;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;


public class Common extends Driver{

    public static ExtentReports reports;
    public static ExtentSparkReporter extentSparkReporter;
    public static ExtentTest extentTest;

    @BeforeMethod
    public void browserStart(){
        WebDriver driver=Driver.openBrowser("chrome","https://www.amazon.in/");
    }

    @AfterMethod
    public void browserStop(){
        Driver.closeBrowser();
    }

    @BeforeSuite
    public void reportStart()throws UnknownHostException {
        System.out.println("Reporting Start ");
        String path=System.getProperty("user.dir");
        reports=new ExtentReports();
        extentSparkReporter=new ExtentSparkReporter(path+"\\report\\report.html");
        reports.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());
        reports.attachReporter(extentSparkReporter);
    }
    @AfterSuite
    public void reportStop(){
        System.out.println("Reporting Stop ");
        reports.flush();
    }
    public static String takeScreenshot() throws IOException {
        WebDriver driver=Driver.getDriver();
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Random random = new Random();
        String file = "ss" + random.nextInt(1000) + ".png";
        String fileName = System.getProperty("user.dir") + "\\report\\" + file;
        File destinationFile = new File(fileName);
        FileUtils.copyFile(screenshot, destinationFile);
        return file;
    }
}
