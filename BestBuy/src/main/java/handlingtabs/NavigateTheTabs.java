package handlingtabs;

import base.CommonAPI;
import datasuply.FetchExternalData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LandingPage;
import pages.Tabs;

import java.io.IOException;

public class NavigateTheTabs {
    Tabs tabs;
    LandingPage landingPage = null;

    public void navigateToCreditCard(WebDriver driver){
        landingPage = PageFactory.initElements(driver,LandingPage.class);
        landingPage.clickOnCreditCards();
    }
    public void navigateTopDeals(WebDriver driver){
        landingPage = PageFactory.initElements(driver,LandingPage.class);
        landingPage.clickOnTopDeals();
    }
    public void navigateToDealOfTheDay(WebDriver driver){
        landingPage = PageFactory.initElements(driver,LandingPage.class);
        landingPage.clickOnDealOfTheDay();
    }
    public void navigateToGiftCards(WebDriver driver){
        landingPage = PageFactory.initElements(driver,LandingPage.class);
        landingPage.clickOnGiftCards();
    }
    public void stepsFlow(String tabs, WebDriver driver){
        switch(tabs){
            case "CreditCards":
                navigateToCreditCard(driver);
                CommonAPI.navigateBack();
                break;
            case "TopDeals":
                navigateTopDeals(driver);
                CommonAPI.navigateBack();
                break;
            case "DealOfTheDay":
                navigateToDealOfTheDay(driver);
                CommonAPI.navigateBack();
                break;
            case "GiftCards":
                navigateToGiftCards(driver);
                CommonAPI.navigateBack();
                break;
            default:
                System.out.print("No more valid tabs");
                break;

        }
    }
    public void navigateKeyBars(WebDriver driver)throws IOException {
        String [] tabList = FetchExternalData.getDataFromExcelFile("/data/best-buy-file3.xls");
        for(int i=1; i<tabList.length; i++) {
            stepsFlow(tabList[i], driver);
        }
    }
}
