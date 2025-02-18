package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class handlingbrokenlinks {
	public static void main(String args[]) throws MalformedURLException, IOException {
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/b/?ie=UTF8&node=1389401031&ext=7043-32769&ref=pd_sl_5szpgfto9i_e&tag=googhydrabk1-21&hvpos=&hvnetw=g&hvrand=12606303784093597532&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062147&hvtargid=kwd-64107830&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=12606303784093597532&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062147&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
 List<WebElement>  list = driver.findElements(By.tagName("a"));
 for(WebElement li:list) {
	 
	 String url=li.getAttribute("href");
	 
	//HttpURLConnection https= (HttpURLConnection)(new URL(url).openConnection());
	 if(url==null || url.isEmpty()) {
		 System.out.println("url is blank"+url);
		 continue;
	 }
	 HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
	 huc.connect();
	 if(huc.getResponseCode()>=400) {
		 System.out.println("link is broken:::::"+url);
		 
	 }
	 else {
		 System.out.println(url+"link is valid");
	 }
 }
 

}
}