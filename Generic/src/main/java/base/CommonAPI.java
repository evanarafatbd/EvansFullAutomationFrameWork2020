package base;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("http://www.amazon.com") String url){
        System.setProperty("webdriver.gecko.driver", "/Users/matiur/IdeaProjects/SeleniumProject1B/driver/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

    //Selenium API
    public String scrapeText(String locator){
        String text = "";
        try {
            text = driver.findElement(By.cssSelector(locator)).getText();
        }catch (Exception ex1){
            System.out.println("Css Selector did not work, Trying some other options");
            text = driver.findElement(By.xpath(locator)).getText();
        }

        return text;
    }

    public void clickOn(String locator){
        try {
            driver.findElement(By.cssSelector(locator)).click();
        }catch (Exception ex1){
            System.out.println("Css Selector did not work, Trying some other options");
            driver.findElement(By.xpath(locator)).click();
        }
    }

    public List<WebElement> getWebElements(String locator){
        List<WebElement> list = null;
        try {
            list = driver.findElements(By.cssSelector(locator));
        }catch (Exception ex1){
            list = driver.findElements(By.xpath(locator));
        }

        return list;
    }

    public List<String> getListOfText(String locator){
        List<WebElement> list = getWebElements(locator);
        List<String> textList = new ArrayList<String>();
        for(WebElement element:list){
            textList.add(element.getText());
        }
        return textList;
    }

}
