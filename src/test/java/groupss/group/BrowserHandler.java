package groupss.group;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrowserHandler {
    private WebDriver driver;

    // Constructor
    public BrowserHandler(WebDriver driver) {
        this.driver = driver;
    }

    public void openWebsite() {
        driver.get("http://www.example.com");
        System.out.println("Title of the page: " + driver.getTitle());
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit(); // Close the browser
        }
    }
}

class MultiBrowserTest {
    private BrowserHandler chromeHandler;
    private BrowserHandler firefoxHandler;
    private WebDriver chromeDriver;
    private WebDriver firefoxDriver;

    @BeforeClass
    public void setup() {
        // Set up ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        chromeDriver = new ChromeDriver();
        chromeHandler = new BrowserHandler(chromeDriver);

        // Set up FirefoxDriver
        //System.setProperty("webdriver.gecko.driver", "path/to/geckodriver");
        firefoxDriver = new FirefoxDriver();
        firefoxHandler = new BrowserHandler(firefoxDriver);
    }

    @Test
    public void testBrowsers() {
        chromeHandler.openWebsite();
        firefoxHandler.openWebsite();
    }

    @AfterClass
    public void tearDown() {
        chromeHandler.closeBrowser();
        firefoxHandler.closeBrowser();
    }
}

