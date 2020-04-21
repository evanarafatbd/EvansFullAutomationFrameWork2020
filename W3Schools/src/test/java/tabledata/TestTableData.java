package tabledata;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestTableData extends CommonAPI{

    @Test
    public void readData(){
        String tableHeaderColumn1 = scrapeText(".w3-table-all.notranslate tr:nth-child(1) th:nth-child(1)");
        String tableHeaderColumn2 = scrapeText(".w3-table-all.notranslate tr:nth-child(1) th:nth-child(2)");
        String tableHeaderColumn3 = scrapeText(".w3-table-all.notranslate tr:nth-child(1) th:nth-child(3)");
        System.out.println(tableHeaderColumn1+ " "+ tableHeaderColumn2+" "+tableHeaderColumn3);
        Assert.assertEquals(tableHeaderColumn1,"CustomerID");
        Assert.assertEquals(tableHeaderColumn2,"CustomerName");
        Assert.assertEquals(tableHeaderColumn3,"ContactName");
        String cellValue = scrapeText(".w3-table-all.notranslate tr:nth-child(5) td:nth-child(4)");
        System.out.println(cellValue);

    }

    //@Test
    public void tableRow(){
        List<WebElement> list = driver.findElements(By.cssSelector(".w3-table-all.notranslate td:nth-child(4)"));
        for(WebElement element:list){
            System.out.println(element.getText());
        }
    }
}
