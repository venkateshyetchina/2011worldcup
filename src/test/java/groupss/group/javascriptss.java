package groupss.group;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class javascriptss {
	@Test
	public void js() throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
	//WebElement ele=driver.findElement(By.xpath("//input[@name='username']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Admin')",usernameField);
	

	}

}
/*
 * package groupss.group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class javascriptss {
    @Test
    public void js() {
        // Setup WebDriver
        WebDriver driver = new ChromeDriver();
        
        try {
            // Navigate to the URL
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            
            // Wait for the username input field to be present
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
            
            // Set the value using JavaScript
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].value='Admin';", usernameField);
            
            // Optional: Trigger the 'input' event to ensure the value is registered
            js.executeScript("arguments[0].dispatchEvent(new Event('input', { bubbles: true }));", usernameField);
            
        } finally {
            // Clean up and close the browser
            driver.quit();
        }
    }
}

 */
