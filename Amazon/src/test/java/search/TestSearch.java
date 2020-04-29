package search;

import base.CommonAPI;
import data.TestData;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.List;

public class TestSearch extends CommonAPI {

    @Test
    public void testTypingOnSearchBox()throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //connect to db, read it for me
        List<String> list = TestData.getListOfItems();
        for(int i=0; i<list.size(); i++){
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(list.get(i), Keys.ENTER);
            Thread.sleep(2000);

        }

    }
}
