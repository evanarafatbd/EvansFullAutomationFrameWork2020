package features;

import base.CommonAPI;
import datasuply.FetchTheSteps;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.SearchPage;
import pages.SectionsPage;
import pages.SignUpPage;
import reporting.TestLogger;

import java.io.IOException;

public class AllFunctionality extends CommonAPI{

    HomePage homePage = null;
    SignUpPage signUpPage = null;
    SearchPage searchPage = null;
    SectionsPage sectionsPage = null;

    public void signUp(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnSignUp();
        signUpPage.enterEmailAddress("abc123@gmail.com");
        signUpPage.clickOnSignUp();
    }
    public void search(WebDriver driver){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSearch();
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.typeOnSearchField("covid-19");
        searchPage.clickOnSearchButton();
    }
    public void clickOnSectionMenu(WebDriver driver){
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSectionsMenu();
    }
    public void sectionsMenu(WebDriver driver){
        clickOnSectionMenu(driver);
        sectionsPage = PageFactory.initElements(driver, SectionsPage.class);
        sectionsPage.goToMetroPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);
        sectionsPage.goToBusinessPage(driver).clickOnHeadLineNews();
        clickOnSectionMenu(driver);
        sectionsPage.goToEntertainmentPage(driver).clickOnHeadLineNews();
    }

    public void select(String featureName, WebDriver driver)throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        switch (featureName) {
            case "signUp":
                signUp(driver);
                break;
            case "sectionsMenu":
                sectionsMenu(driver);
                break;
            case "search":
                search(driver);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
    public void runAllTheFeatureTest(WebDriver driver) throws IOException {
        FetchTheSteps fetchTheSteps = new FetchTheSteps();
        String [] featureSteps = fetchTheSteps.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<featureSteps.length; i++){
            select(featureSteps[i],driver);
        }
    }


    }


