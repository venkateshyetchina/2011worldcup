package groupss.group;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chord {
	@Test
	public void newtab() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.scnsoft.com/ecommerce/demo");
	String newtab=	Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"header-logo has-site-list\"]/a")).sendKeys(newtab);
	}

}
