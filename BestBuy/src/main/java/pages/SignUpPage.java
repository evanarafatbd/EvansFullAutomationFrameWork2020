package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage {

    @FindBy(how = How.CSS, using = ".email-submission-form")
    public static WebElement signUpWebElement;

    @FindBy(how = How.CSS, using = ".btn.btn-primary")
    public static WebElement signUpButtonWebElement;


    @FindBy(how = How.CSS, using = ".c-modal-grid.col-xs-6") //c-overlay-fullscreen
    public static WebElement signUpModalWebElement;


    public WebElement getSignUpWebElement(){
        return signUpWebElement;
    }
    public WebElement getSignUpButtonWebElement(){
        return signUpButtonWebElement;
    }
    public void typeOnSignUp(){
        getSignUpWebElement().sendKeys("rahmanww@gmail.com");
    }
    public void clickOnSignUp(){
        getSignUpButtonWebElement().click();
    }
    public void handleSignUpPopUp(){
        if(signUpModalWebElement.isDisplayed()) {
            typeOnSignUp();
            clickOnSignUp();
        }
    }
}
