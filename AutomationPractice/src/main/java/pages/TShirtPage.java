package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.List;

public class TShirtPage {

    HomePage homePage = null;

    @FindBy(how = How.CSS, using = "#block_top_menu > ul li:nth-child(1)")
    public static WebElement womenTabWebElement;


    public void getItemsList(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = CommonAPI.getListOfText(".product_list.grid.row li");
        for(String st:list) {
            System.out.println(st);
        }
    }
    public void readNValidateTShirts(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnTShirtTab();
        getItemsList();
    }
}
