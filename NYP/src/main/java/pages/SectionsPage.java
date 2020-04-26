package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SectionsPage {

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement sectionMenuWebElement;

    public WebElement getSectionMenuWebElement(){
        return sectionMenuWebElement;
    }

    public void clickOnSectionMenuTab(){
        getSectionMenuWebElement().click();
    }
}
