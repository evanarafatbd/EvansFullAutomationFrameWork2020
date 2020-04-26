package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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

    public static WebElement getSearchWebElement() {
        return searchWebElement;
    }

    public static WebElement getSignUpWebElement() {
        return signUpWebElement;
    }

    public void clickOnSignUp() {
        getSignUpWebElement().click();
    }

    public void clickOnSearch() {
        getSearchWebElement().click();
    }

    public void clickOnSectionsMenu() {
        getSectionNavBarWebElement().click();
    }
}
