package groupss.group;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getattribute {
	@Test
	public void attribute() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
	String s=	driver.findElement(By.xpath("(//*[@id='link2'])[2]")).getAttribute("href");
	System.out.println(s);
	driver.navigate().to(s);
	driver.navigate().back();
	
		
	}

}
