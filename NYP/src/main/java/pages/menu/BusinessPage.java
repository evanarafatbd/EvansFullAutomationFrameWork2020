package pages.menu;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BusinessPage {

    private final WebDriver driver;
    public BusinessPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.CSS, using = "div.headline-wrapper a:nth-child(2) h3")
    public static WebElement headLineNewsWebElement;

    public WebElement getHeadLineNewsWebElement(){
        return headLineNewsWebElement;
    }

    public void clickOnHeadLineNews(){
        CommonAPI.waitUntilVisible(headLineNewsWebElement);
        String headLineNews = getHeadLineNewsWebElement().getText();
        System.out.println(headLineNews);
        CommonAPI.waitUntilClickAble(headLineNewsWebElement);
        getHeadLineNewsWebElement().click();
    }

}
