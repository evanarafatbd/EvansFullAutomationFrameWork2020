package pages;

import datasuply.FetchExternalData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SearchPage {

    @FindBy(how = How.CSS, using = ".search-input")
    public static WebElement searchWebElement;

    @FindBy(how = How.CSS, using = ".header-search-button")
    public static WebElement searchSubmitButtonWebElement;

    public static WebElement getSearchWebElement(){
        return searchWebElement;
    }

    public static WebElement getSearchSubmitButtonWebElement(){
        return searchSubmitButtonWebElement;
    }

    public static void clearSearchInputBox(){
        getSearchWebElement().clear();
    }
    public static void typeInSearchInputBox(String value){
        getSearchWebElement().sendKeys(value);
    }
    public static void clickOnSubmitButton(){
        getSearchSubmitButtonWebElement().click();
    }


    public void searchNSubmit(WebDriver driver)throws IOException{
        SignUpPage signUpPage = PageFactory.initElements(driver,SignUpPage.class);
        String [] items = getItems();
        signUpPage.handleSignUpPopUp();
        for(int i=1; i<items.length; i++) {
            clearSearchInputBox();
            typeInSearchInputBox(items[i]);
            clickOnSubmitButton();
        }
    }

    public String[] getItems()throws IOException {
        String [] items = FetchExternalData.getDataFromExcelFile("/data/best-buy-file.xls");
        return items;
    }

}
