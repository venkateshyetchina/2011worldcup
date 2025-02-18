package alerts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class keychordpractice {
@Test
	public void  twokeysAtsametime() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
	WebElement s=	driver.findElement(By.xpath("(//form/input[@type='text'])[1]"));
	s.sendKeys("Venkatesh");
		s.sendKeys(Keys.chord(Keys.CONTROL),"A");
		s.sendKeys(Keys.chord(Keys.CONTROL),"B");
		
	}
	
}
