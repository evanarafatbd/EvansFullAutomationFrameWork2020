package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {

    @FindBy(how = How.CSS, using = "#block_top_menu > ul li:nth-child(1)")
    public static WebElement womenTabWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[2]/a")
    public static WebElement dressesWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[3]")
    public static WebElement tShirtWebElement;

    public WebElement getWomenTabWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return womenTabWebElement;
    }

    public WebElement getDressesWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return dressesWebElement;
    }

    public WebElement gettShirtWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return tShirtWebElement;
    }

    public void clickOnWomenTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getWomenTabWebElement().click();
    }

    public void clickOnDressesTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getDressesWebElement().click();
    }

    public void clickOnTShirtTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        gettShirtWebElement().click();
    }

}
