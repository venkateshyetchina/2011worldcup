package groupss.group;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class staticwebtable {
	
	@Test
	public void handlingwebtables() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
	
		/*for(int i=1;i<=4;i++) {
			 String xpath = "//div[@class='table-container']//table[@id='productTable']//tbody/tr[" + i + "]/td[1]";
	            
	            // Find the cell element
	            WebElement cell = driver.findElement(By.xpath(xpath));
	            
	            // Print the text of the cell
	            System.out.println(cell.getText());
	     
		}*/
		for(int i=0;i<=4;i++) {
		List secondlink=driver.findElements(By.xpath("//ul[@id='pagination']//li+[i]+//a"));
		
		secondlink
	}
	}
}
