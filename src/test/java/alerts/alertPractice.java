package alerts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class alertPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
driver.findElement(By.xpath("//input[@id='alert1']")).click();
Alert alert=driver.switchTo().alert();
String str=alert.getText();
System.out.println(str);
alert.accept();

	
	
	
	
	}

}
