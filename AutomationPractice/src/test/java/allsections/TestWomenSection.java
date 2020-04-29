package allsections;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WomenPage;
import reporting.TestLogger;

public class TestWomenSection extends CommonAPI {

    @Test
    public void lookUpWomenDress(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WomenPage womenPage = PageFactory.initElements(driver, WomenPage.class);
        womenPage.readNValidateWomenDresses(driver);
    }
}
