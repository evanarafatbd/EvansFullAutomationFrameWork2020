package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {

    @FindBy(how = How.CSS, using = "#contact_fields_email")
    public static WebElement emailFieldWebElement;

    public WebElement getEmailFieldWebElement(){
        return emailFieldWebElement;
    }

    public void enterEmailAddress(String value){
        getEmailFieldWebElement().sendKeys(value);
    }


}
