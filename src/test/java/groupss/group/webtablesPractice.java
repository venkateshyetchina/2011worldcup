package groupss.group;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtablesPractice {
@Test
	public void webtabledata() {
	WebDriver driver =new ChromeDriver();	
	driver.get("https://testautomationpractice.blogspot.com/");
	WebElement scroll=driver.findElement(By.xpath("//h2[text()='Static Web Table']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", scroll);
	List<WebElement> ls=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
	for(WebElement li:ls) {
	System.out.println(li.getText());	
	}
	WebElement s=driver.findElement(By.xpath("(//table[@name='BookTable']//tbody/tr//td[1])[2]"));
	System.out.println(s.getText());
	}
	
	
}
