package pages;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AllFunctionality {

    HomePage homePage = null;
    SignUpPage signUpPage = null;
    SearchPage searchPage = null;
    SectionsPage sectionsPage = null;

    public void signUp(WebDriver driver){

    }
    public void search(WebDriver driver){

    }
    public void clickOnSectionMenu(WebDriver driver){

    }
    public void runAllTheFeatureTest(WebDriver driver) {
        homePage = PageFactory.initElements(driver, HomePage.class);
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        sectionsPage = PageFactory.initElements(driver, SectionsPage.class);

    }

    public void select(String featureName, WebDriver driver)throws IOException, InterruptedException{
        switch(featureName){
            case "signIn":
                signUp(driver);
                break;
            case "clickOnSectionMenu":
                clickOnSectionMenu(driver);
                break;
            case "search":
                search(driver);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

}
