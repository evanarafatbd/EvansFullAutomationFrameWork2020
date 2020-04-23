package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthenticationPage {

    @FindBy(how = How.CSS, using = "")
    public static WebElement userNameWebElement;

    @FindBy(how = How.CSS, using = "")
    public static WebElement passwordWebElement;


    public void signUp(){

    }

    public void signIn(){

    }
}
