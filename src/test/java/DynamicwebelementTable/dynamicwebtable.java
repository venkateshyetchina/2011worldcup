package DynamicwebelementTable;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class dynamicwebtable {
@Test
	public void Dynamictable() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://practice.expandtesting.com/dynamic-table");
	//
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table table-striped']/tbody/tr//td")));
	
	List<WebElement> row=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr//td"));
	System.out.println(row.size());
	for(int r=1;r<=row.size();r++) {
	
		WebElement chrome=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]/td[1]"));
		if(chrome.getText().equals("Chrome")) {
			WebElement mbps=driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]"));
	       //  System.out.println("mbps::::"+mbps);
	         WebElement cpu=driver.findElement(By.xpath(" //*[@id='chrome-cpu']"));
	         
	         if(cpu.getText().equals(mbps)) {
	        	 System.out.println("cpu===mbps");
	        	 
	         }
		}
	}
	
	
	}
}
