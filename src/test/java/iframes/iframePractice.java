package iframes;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class iframePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
WebElement fr1=driver.findElement(By.xpath("//iframe[@id='iframe1']"));
driver.switchTo().frame(fr1);
WebElement clicks=driver.findElement(By.xpath("(//div[@id='crosscol-overflow']//table//tbody//tr//td//a[1])[1]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", clicks);
//driver.navigate().back();
//driver.switchTo().defaultContent();
Set<String> alhandles=driver.getWindowHandles();
for(String alh:alhandles) {
	driver.switchTo().window(alh);
	if((driver.getTitle().equals("omayo (QAFox.com)"))) {
		System.out.println("its not in new window");
	System.out.println(	driver.findElement(By.xpath("//h2[@class='date-header']//span")).getText());
	driver.switchTo().defaultContent();
	}
}

//System.out.println(driver.findElement(By.xpath("//div[@id='post-body-9023929218208337252']")).getText());

	}

}
