package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage {

    @FindBy(how = How.CSS, using = "#search-field")
    public static WebElement searchFieldWebElement;

    public WebElement getSearchFieldWebElement(){
        return searchFieldWebElement;
    }
    public void typeOnSearchField(String value){
        getSearchFieldWebElement().sendKeys(value);
    }

}
