package groupss.group;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class paralles {
//WebDriver driver;

@Test(dataProvider="aps")
public void par(String username, String password) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	//driver.close();
}
@DataProvider(parallel=true)
public Object aps() {
	Object data[][]=new Object[2][2];
	data[0][0]="Admins";
	data[0][1]="admin123";
	
	data[1][0]="Admin";
	data[1][1]="admin123";
	
	return data;
	
}
@Test(timeOut=2000)
public void timing() {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
}


}
