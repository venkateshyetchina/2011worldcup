package groupss.group;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowhandles {
	@Test
	public void windowhandles() {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String parent=	driver.getWindowHandle();
	driver.findElement(By.xpath("//*[@class=\"orangehrm-copyright-wrapper\"]/p[2]/a")).click();

		Set<String>s=driver.getWindowHandles();
		for(String s2:s) {
			if(!s2.equals(parent)) {
				driver.switchTo().window(parent);
				driver.findElement(By.xpath("//*[@type=\"password\"]")).sendKeys("Admin123");
			}
		}
		
		
	}

}
