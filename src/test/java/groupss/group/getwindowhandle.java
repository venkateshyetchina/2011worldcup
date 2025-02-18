package groupss.group;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class getwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.programiz.com/java-programming/online-compiler/");
String parenthandle=driver.getWindowHandle();
JavascriptExecutor js=(JavascriptExecutor)driver;

WebElement js1=driver.findElement(By.xpath("//div[@id='feedback-desktop']//a[@id='ad-link']"));
js.executeScript("arguments[0].click();", js1);

String childhandle=driver.getWindowHandle();
System.out.println(childhandle+"         "+" child hanlfde");
driver.switchTo().window(childhandle);
System.out.println(driver.getTitle());
String childtitle=driver.getTitle();
Set<String>allhandles=driver.getWindowHandles();
for(String normal:allhandles){
	driver.switchTo().window(normal);
	if(driver.getTitle().equals("Online Java Compiler - Programiz")) {
		String str=driver.getTitle();
		System.out.println(str+" ***********");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File originas=ts.getScreenshotAs(OutputType.FILE);
	File temp=new File("C:\\Users\\DELL\\Downloads\\javapracticews\\javapracticews\\Mavenprojectinst\\DemoElipseMavenProject\\target\\ss1\\ss2.png");
	originas.renameTo(temp);
	}
	
}







	}

}
