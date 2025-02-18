package mouseorkeyboardhadling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class mouseeventsandkeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
Actions act= new Actions(driver);
WebElement blogs=driver.findElement(By.xpath("//div[@id='cssmenu']/ul/li[2]"));
act.moveToElement(blogs).perform();



	}

}
