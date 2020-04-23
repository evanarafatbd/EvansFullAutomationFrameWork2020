package allsections;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.collections.Objects;
import pages.TShirtPage;

public class TestTShirtSection extends CommonAPI {

    @Test
    public void lookUpTShirts(){
        TShirtPage tShirtPage = PageFactory.initElements(driver, TShirtPage.class);
        tShirtPage.readNValidateTShirts(driver);
    }

}
