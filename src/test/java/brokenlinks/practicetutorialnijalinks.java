package brokenlinks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class practicetutorialnijalinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");//launch
List<WebElement>links =driver.findElements(By.tagName("a"));
for(WebElement link:links) {
 
	String url=link.getAttribute("href");
	if(url.isEmpty() ||url==null) {
		System.out.println("links are empty or null");
	}
	try {
		HttpURLConnection huc=(HttpURLConnection)new URL(url).openConnection();
		huc.connect();
		if(huc.getResponseCode()>=400) {
			System.out.println("links is broken"+":::::"+url);
			
		}
		else {
			System.out.println("links are working fine"+"::::"+url);
			
			
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

	}

}
