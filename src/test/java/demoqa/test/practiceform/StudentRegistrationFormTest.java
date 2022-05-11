package demoqa.test.practiceform;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StudentRegistrationFormTest {

    @Test
    void testRegistrationFormTestPositive() throws InterruptedException {
        final String FIRST_NAME = "Masha";  //this is constanta! no change
        final String LAST_NAME = "Ivanova";
        final String USER_EMAIL = "a@a.ru";
        final String USER_NUMBER = "1234567890";
        final String DATE_OF_BIRTH = "01Jan1999";
        final String CURRENT_ADDRESS = "123 Irvine";
        final String GENDER_FEMALE = "1";

        System.setProperty("webdriver.chrome.driver", "C:/Users/rumbl/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();


        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();


        WebElement firstName = driver.findElement(By.cssSelector("input#firstName.mr-sm-2.form-control"));
        firstName.sendKeys(FIRST_NAME);

        WebElement lastName = driver.findElement(By.cssSelector("input#lastName.mr-sm-2.form-control"));
        lastName.sendKeys(LAST_NAME);

        WebElement userEmail = driver.findElement(By.cssSelector("#userEmail"));
        userEmail.sendKeys(USER_EMAIL);


        WebElement genderMale = driver.findElement(By.cssSelector("#genterWrapper div.custom-control.custom-radio.custom-control-inline label"));
        genderMale.click();
        WebElement genderFemale = driver.findElement(By.cssSelector("#genterWrapper div.custom-control.custom-radio.custom-control-inline label"));
        genderFemale.click();

        WebElement userNumber = driver.findElement(By.cssSelector("#userNumber"));
        userNumber.sendKeys(USER_NUMBER);

        WebElement currentAddress = driver.findElement(By.cssSelector("#currentAddress-wrapper.mt-2.row"));
        userNumber.sendKeys(CURRENT_ADDRESS);







        Thread.sleep(5000);

        driver.quit();
    }

}
















