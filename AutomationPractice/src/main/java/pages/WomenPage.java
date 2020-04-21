package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenPage extends CommonAPI{

    public void goToWomenPage(){
        clickOn(".sf-with-ul");
    }
    public void selectItem(){
        goToWomenPage();
        String itemName = driver.findElement(By.cssSelector(".product_list.grid.row li:nth-child(4)")).getText();
        System.out.println(itemName);
    }

    public void selectItems(){
        goToWomenPage();
        List<String> list = getListOfText(".product_list.grid.row li");
        for(String st:list) {
            System.out.println(st);
        }
    }
}
