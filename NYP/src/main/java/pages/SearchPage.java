package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class SearchPage {

    @FindBy(how = How.CSS, using = "#search-field")
    public static WebElement searchFieldWebElement;

    @FindBy(how = How.CSS, using = "#search-submit")
    public static WebElement searchSubmitButtonWebElement;

    public WebElement getSearchFieldWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchFieldWebElement;
    }
    public WebElement getSearchSubmitButtonWebElement(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchSubmitButtonWebElement;
    }
    public void typeOnSearchField(String value){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchFieldWebElement().sendKeys(value);
    }
    public void clickOnSearchButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchSubmitButtonWebElement().click();
    }

}
