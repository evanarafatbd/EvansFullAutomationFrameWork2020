package navigation;

import base.CommonAPI;
import handlingtabs.NavigateTheTabs;
import org.omg.CORBA.NamedValue;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LandingPage;

import java.io.IOException;

public class TestNavigation extends CommonAPI {

    @Test
    public void navigateTabs()throws IOException {
        NavigateTheTabs navigateTheTabs = PageFactory.initElements(driver, NavigateTheTabs.class);
        navigateTheTabs.navigateKeyBars(driver);
    }
}
