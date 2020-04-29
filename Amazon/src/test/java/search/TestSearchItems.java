package search;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.SearchPage;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;

public class TestSearchItems extends CommonAPI {

    @Test
    public void searchItems()throws Exception, IOException, SQLException, ClassNotFoundException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchPage searchPage = PageFactory.initElements(driver,SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }
}
