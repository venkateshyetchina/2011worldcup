package groupss.group;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class germany {
	
@Test
	public void testsetup() {
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.germanyiscalling.com/login");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		 //driver.switchTo().frame("_hjSafeContext_87853547");

	       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Venky");
	       WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
	        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
WebDriverWait waits =new WebDriverWait(driver, Duration.ofSeconds(10));
//WebElement sss=waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']")));

	       // sss.sendKeys("venkyyetchina1996@gmail.com");
	        passwordField.sendKeys("Venky@123");
	        loginButton.click();
	}
}
