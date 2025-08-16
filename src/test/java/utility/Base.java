package utility;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static WebDriver driver;
	public static void initializeDriver() {
        if (driver == null) {
            // Set the path to your ChromeDriver executable if needed
            // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            driver = new ChromeDriver(); // You can parameterize this for cross-browser
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
