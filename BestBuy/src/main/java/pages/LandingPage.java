package pages;

import base.CommonAPI;
import datasuply.FetchExternalData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

import static pages.Tabs.CreditCards;

public class LandingPage {

    Tabs tabs;

    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(1)")
    public static WebElement creditCardsWebElement;

    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(2)")
    public static WebElement topDealsWebElement;

    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(3)")
    public static WebElement dealOfTheDayWebElement;

    @FindBy(how = How.CSS, using = ".top-nav-items li:nth-child(4)")
    public static WebElement giftCardsWebElement;

    public static WebElement getCreditCardsWebElement() {
        return creditCardsWebElement;
    }

    public static WebElement getTopDealsWebElement() {
        return topDealsWebElement;
    }

    public static WebElement getDealOfTheDayWebElement() {
        return dealOfTheDayWebElement;
    }

    public static WebElement getGiftCardsWebElement() {
        return giftCardsWebElement;
    }

    public void clickOnCreditCards(){
        getCreditCardsWebElement().click();
    }
    public void clickOnTopDeals(){
        getTopDealsWebElement().click();
    }
    public void clickOnDealOfTheDay(){
        getDealOfTheDayWebElement().click();
    }
    public void clickOnGiftCards(){
        getGiftCardsWebElement().click();
    }
    public void navigateBars(){
        clickOnCreditCards();
        CommonAPI.navigateBack();
        clickOnTopDeals();
        CommonAPI.navigateBack();
        clickOnDealOfTheDay();
        CommonAPI.navigateBack();
        clickOnGiftCards();
        CommonAPI.navigateBack();
    }



}
