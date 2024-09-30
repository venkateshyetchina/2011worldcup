package groupss.group;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class robots {
@Test
	public void robos() throws AWTException, IOException, InterruptedException {
		WebDriver driver =new ChromeDriver();
	 driver.get("https://the-internet.herokuapp.com/upload");
	 WebElement ele=driver.findElement(By.id("file-upload"));
	 Actions act =new Actions(driver);
	 act.moveToElement(ele).click().build().perform();	
	 Thread.sleep(5000);
	 /*Robot rs=new Robot();
	 rs.mouseWheel(15);
	 rs.delay(2000);
	 rs.mouseWheel(-10);*/
		String autoit = System.getProperty("user.dir")+"\\autoit\\no2.exe";
		System.out.println(autoit);
		Runtime.getRuntime().exec(autoit);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='file-submit']")).click();
		
	 
	}
}
