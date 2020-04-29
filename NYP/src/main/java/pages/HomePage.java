package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage {

    @FindBy(how = How.CSS, using = "#sections > span.menu-icon > svg")
    public static WebElement sectionNavBarWebElement;

    @FindBy(how = How.CSS, using = "#search > span.search-text")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = "#page-nav a.nav-header.nav-header--email > span")
    public static WebElement signUpWebElement;

    public static WebElement getSectionNavBarWebElement() {
        return sectionNavBarWebElement;
    }

    public WebElement getSearchWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return searchWebElement;
    }

    public WebElement getSignUpWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return signUpWebElement;
    }

    public void clickOnSignUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSignUpWebElement().click();
    }

    public void clickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSearchWebElement().click();
    }

    public void clickOnSectionsMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionNavBarWebElement().click();
    }
}
