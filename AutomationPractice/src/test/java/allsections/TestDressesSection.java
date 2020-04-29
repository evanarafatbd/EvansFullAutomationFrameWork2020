package allsections;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.DressesPage;
import reporting.TestLogger;

public class TestDressesSection extends CommonAPI {

    @Test
    public void lookupDresses(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DressesPage dressesPage = PageFactory.initElements(driver,DressesPage.class);
        dressesPage.readNValidateDresses(driver);
    }
}
