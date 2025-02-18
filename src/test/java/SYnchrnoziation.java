import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class SYnchrnoziation {
WebDriver driver;
 //Thread t=new Thread();
private static ThreadLocal<WebDriver>t=new ThreadLocal<>();
 

public void  setDriver(WebDriver driver) {
	t.set(driver);
}

public WebDriver getDriver() {
	return t.get();
}
@Test
	public void test1() {
		driver=new ChromeDriver();
		t.set(driver);
	   getDriver();
	   getDriver().get("https://www.youtube.com/watch?v=H-IU7LjWGFc&list=PLUDwpEzHYYLuP6PBgxwJvRL7RXbvDpcm3&index=2");
	
		
		
	}
@Test
public void test2() {
	driver=new FirefoxDriver();
	t.set(driver);
	getDriver();

     getDriver().get("https://www.youtube.com/watch?v=H-IU7LjWGFc&list=PLUDwpEzHYYLuP6PBgxwJvRL7RXbvDpcm3&index=2");
      System.out.println("threadvalue");
  

}
	
}
