package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.CSS, using = "#block_top_menu > ul li:nth-child(1)")
    public static WebElement womenTabWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[2]/a")
    public static WebElement dressesWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id='block_top_menu']/ul/li[3]")
    public static WebElement tShirtWebElement;

    public static WebElement getWomenTabWebElement() {
        return womenTabWebElement;
    }

    public static WebElement getDressesWebElement() {
        return dressesWebElement;
    }

    public static WebElement gettShirtWebElement() {
        return tShirtWebElement;
    }

    public void clickOnWomenTab(){
        getWomenTabWebElement().click();
    }

    public void clickOnDressesTab(){
        getDressesWebElement().click();
    }

    public void clickOnTShirtTab(){
        gettShirtWebElement().click();
    }

}
