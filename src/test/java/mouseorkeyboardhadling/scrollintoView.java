package mouseorkeyboardhadling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class scrollintoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.w3schools.com/mysql/mysql_alter.asp");
WebElement s=driver.findElement(By.xpath("//a[@class='no-checkmark'][5]"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView();", s);
System.out.println(s.getText());


	}

}
