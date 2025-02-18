import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

String parenthandle=driver.getWindowHandle();
System.out.println("parenthandle id :"+parenthandle);
JavascriptExecutor js=(JavascriptExecutor)driver;


WebElement newwindow=driver.findElement(By.xpath("//div//button[@id='newWindowBtn']"));
js.executeScript("arguments[0].scrollIntoView();", newwindow);
js.executeScript("arguments[0].click();", newwindow);
String childhandle=driver.getWindowHandle();
System.out.println("childhandle id:"+childhandle);

Set<String> allwinds= driver.getWindowHandles();
for(String particularwind:allwinds) {
	driver.switchTo().window(particularwind);
	if(driver.getTitle().equals("Basic Controls - H Y R Tutorials")) {
		System.out.println("it is in childwindow:"+childhandle);
	}
			
		           
}

	
	
	
	
	
	}

}
