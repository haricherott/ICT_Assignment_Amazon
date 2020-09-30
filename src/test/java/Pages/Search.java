package Pages;

import TestMethods.SearchTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Search extends SearchTest {
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    private WebElement txt_search;
    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    private WebElement btn_search;

    public Search(WebDriver driver){ PageFactory.initElements(driver,this);
   // public void EnterSearch(String item)throws IOException{
     //   txt_search.sendKeys(item);
        btn_search.click();
        }
    }

