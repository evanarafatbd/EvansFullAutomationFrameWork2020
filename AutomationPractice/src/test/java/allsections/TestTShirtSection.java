package allsections;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.collections.Objects;
import pages.TShirtPage;
import reporting.TestLogger;

public class TestTShirtSection extends CommonAPI {

    @Test
    public void lookUpTShirts(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TShirtPage tShirtPage = PageFactory.initElements(driver, TShirtPage.class);
        tShirtPage.readNValidateTShirts(driver);
    }

}
