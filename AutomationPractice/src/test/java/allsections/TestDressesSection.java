package allsections;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.DressesPage;

public class TestDressesSection extends CommonAPI {

    @Test
    public void lookupDresses(){
        DressesPage dressesPage = PageFactory.initElements(driver,DressesPage.class);
        dressesPage.readNValidateDresses(driver);
    }
}
