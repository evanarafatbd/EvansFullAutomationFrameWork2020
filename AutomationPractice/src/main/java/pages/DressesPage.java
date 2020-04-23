package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DressesPage {
    HomePage homePage = null;

    @FindBy(how = How.CSS, using = "#block_top_menu > ul li:nth-child(1)")
    public static WebElement womenTabWebElement;


    public void getItemsList(){
        List<String> list = CommonAPI.getListOfText(".product_list.grid.row li");
        for(String st:list) {
            System.out.println(st);
        }
    }
    public void readNValidateDresses(WebDriver driver){
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnDressesTab();
        getItemsList();
    }
}
