package groupss.group;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertFalse;

public class LoginTest {

    private WebDriver driver;

   @Test(priority=1)
    public void setUp() {
        // Set the path to your WebDriver executable
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//WebDriver driver;
        //ChromeOptions options = new ChromeOptions();
      //  options.addArguments("--headless"); // Runs Chrome in headless mode.

        driver = new ChromeDriver();
        driver.get("https://www.germanyiscalling.com/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        usernameField.sendKeys("venkyyetchina1996@gmail.com");
        passwordField.sendKeys("Venky@123");
        loginButton.click();

    }

   // @Test(priority=2)
 //   public void testSuccessfulLogin() {
       
        // Verify successful login, e.g., by checking the presence of a logout button
      //  WebElement logoutButton = driver.findElement(By.id("logoutButton"));
       // assertTrue(logoutButton.isDisplayed());
//    }

    @Test(priority=3)
    public void testUnsuccessfulLogin() {
        driver.get("https://www.germanyiscalling.com/login");

        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("invalidUsername@gmail.com");
        passwordField.sendKeys("invalidPassword");
        loginButton.click();

        // Verify unsuccessful login, e.g., by checking the presence of an error message
        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
       // assertTrue(errorMessage.isDisplayed());
    }

   
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

