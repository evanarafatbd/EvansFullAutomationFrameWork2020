package search;

import base.CommonAPI;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import reporting.TestLogger;

public class TestAmazonTitle extends CommonAPI {


    @Test
    public void testTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String expectedTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        String actualTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        softAssert.assertEquals( actualTitle,expectedTitle,"Title did not match. So you need to double check");
        softAssert.assertAll();
        System.out.println(actualTitle);
        System.out.println(expectedTitle);
    }

}

