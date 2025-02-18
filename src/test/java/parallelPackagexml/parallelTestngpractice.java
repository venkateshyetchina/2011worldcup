package parallelPackagexml;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallelTestngpractice {
	WebDriver driver=null;
	
@Test
	public void TestMethod1() {
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=FlskHjY_m5Q");	}
@Test
public void TestMethod2() {
		driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/watch?v=FlskHjY_m5Q");
	}

	
}
