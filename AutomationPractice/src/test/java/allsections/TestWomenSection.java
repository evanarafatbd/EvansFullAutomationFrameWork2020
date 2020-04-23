package allsections;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WomenPage;

public class TestWomenSection extends CommonAPI {

    @Test
    public void lookUpWomenDress(){
        WomenPage womenPage = PageFactory.initElements(driver, WomenPage.class);
        womenPage.readNValidateWomenDresses(driver);
    }
}
