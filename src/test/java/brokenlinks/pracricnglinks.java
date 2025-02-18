package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracricnglinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo");
		List<WebElement >links=driver.findElements(By.tagName("a"));
		
		for(WebElement link:links ) {
			String url=link.getAttribute("href");
			if(url.isEmpty() || url==null) {
				System.out.println("link is empty");
				continue;
			}
try {
	HttpURLConnection huc= (HttpURLConnection)(new URL(url).openConnection());
	if(huc.getResponseCode()>=400) {
		System.out.println("link is not working");
	}
	else {
		System.out.println(url+"link is working");
	}
} catch (MalformedURLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		}
	}

}
