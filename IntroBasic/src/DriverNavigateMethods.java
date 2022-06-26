import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethods {

	public static void main(String[] args) {
		// Launch Chrome Diver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Goes To The URL We Typed
		driver.get("https://www.amazon.com");
		
		// Goes To The URL We Typed And Allows Forward And Back Operations
		driver.navigate().to("https://www.facebook.com");
		
		// Back Operation
		driver.navigate().back();
		
		// Forward Operation
		driver.navigate().forward();
		
		// Refresh Current Page
		driver.navigate().refresh();
		
		// Close Driver One Tab Or One Window
		driver.close();
		// Close Driver All Tabs And Windows
		//driver.quit();

	}

}
