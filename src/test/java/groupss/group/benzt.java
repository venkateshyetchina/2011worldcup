package groupss.group;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class benzt {
	@Test
 public void signup() throws InterruptedException {
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://sg-app.abouv.com");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 //Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	// WebElement skip=driver.findElement(By.xpath("//button[text()='Skip']"));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Skip']"))).click();
	 
	// driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("6302444098");
	 
	 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Mobile Number']"))).sendKeys("9993332218");
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
	Thread.sleep(5000);
WebElement otps=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(), 'Verify OTP sent to')]")));
		
		
String otp = otps.getText().trim(); 
System.out.println(otp);
String s1=otp;
String s2=s1.substring(45,49);
System.out.println(s2);
for (int i = 0; i < s2.length(); i++) {
    String character = String.valueOf(s2.charAt(i));
    WebElement otpInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Please enter OTP character " + (i + 1) + "']")));
    otpInput.sendKeys(character);
    Thread.sleep(500); // Optional: wait for half a second between inputs
}
	
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='g'])[1]"))).click();
//driver.findElement(By.xpath("//button[contains(text(),'email')]")).sendKeys("v@gmail.com");	
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='g' ])[2]"))).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[name()='g'])[1]"))).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue']"))).click();
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Continue with email')]"))).click();


	}
}
