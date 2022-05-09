package demoqa.test.mainpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class TitleTest {
    @Test
    public void exists() throws InterruptedException {
        String nameTitleExpected = "ToolsQA";
        System.setProperty("webdriver.chrome.driver","C:/Users/rumbl/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/");
        Thread.sleep(5000);
        String titleActual = driver.getTitle();

        Assert.assertEquals(driver.getTitle(),nameTitleExpected);





        driver.quit();

    }

}
