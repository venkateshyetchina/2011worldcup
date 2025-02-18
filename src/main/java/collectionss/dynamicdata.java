package collectionss;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver = new ChromeDriver();
			driver.get("https://practice.expandtesting.com/dynamic-table");
			//
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='table table-striped']/tbody/tr")));
			
			List<WebElement> row=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
			System.out.println(row.size());
		
		for(int r=1;r<=row.size();r++) {

			WebElement chrome=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]//td[1]"));
			if(chrome.getText().equals("Chrome")) {
		WebElement mbps=driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]"));
		String mb=mbps.getText();	 
		System.out.println("mb::::"+mb);
			    String cpu=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
			     
			     if(cpu.contains(mb)) {
			    	 System.out.println("cpu===mbps");
			     }
			     else {}
			     break;
			}
	}
	}
}





/*for(int r=1;r<=row.size();r++) {

WebElement chrome=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr["+r+"]//td[1]"));
if(chrome.getText().equals("Chrome")) {
	WebElement mbps=driver.findElement(By.xpath("//td[normalize-space()='Chrome']//following-sibling::*[contains(text(),'%')]"));
   //  System.out.println("mbps::::"+mbps);
     WebElement cpu=driver.findElement(By.xpath(" //*[@id='chrome-cpu']"));
     
     if(cpu.getText().equals(mbps)) {
    	 System.out.println("cpu===mbps");
    	 
     }
}*/