package groupss.group;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class stringss {
	@Test
	public void test() {
		
		
		String sap="salesforce0123";
String only=sap.substring(10,14);
int firstocc=sap.indexOf("e");
int secondocc=sap.indexOf('e',firstocc+1);
System.out.println("firstoccurence at index of e:"+firstocc);
System.out.println("secondoccurence at index of e:"+secondocc);
WebDriver driver =new ChromeDriver();


}
}






































