package groupss.group;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class colorpicker {
	@Test
	public void colors() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement c=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		String s=c.getCssValue("background-color");
		System.out.println(s);
		String originalcolor=Color.fromString(s).asHex();
		System.out.println(originalcolor+":orginal color ");
		if(originalcolor.equals("#ff7b1d") ){
			System.out.println("task completed for color pickers");
		}
		
		
	}

}
