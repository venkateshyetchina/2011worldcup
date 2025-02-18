package crossbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cb {
	WebDriver driver=null;
	@Parameters("browser")
		@Test
		public void test(String browser) {
			if(browser.equalsIgnoreCase("chrome")){
				
				driver=new ChromeDriver();
					}


			else if(browser.equalsIgnoreCase("firefox")){
				
				driver=new FirefoxDriver();
					}
	}
}
