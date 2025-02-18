package dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdownhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://omayo.blogspot.com/");
WebElement sl=driver.findElement(By.xpath("//div[@class='column-left-outer']//*[@id='HTML1']//select"));
	Select select =new Select(sl);
	select.selectByValue("jkl");
	
	}

}
