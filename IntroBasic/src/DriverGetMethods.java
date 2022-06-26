import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {

	public static void main(String[] args) {
		// Launch Chrome Diver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Goes To The URL We Typed
		driver.get("https://rahulshettyacademy.com");
		
		// Get Current Page Title
		System.out.println("Page Title : "+driver.getTitle());
		// Get Current Page URL
		System.out.println("Current Page URL : "+driver.getCurrentUrl());

		// Get Current Page Source Code0
		System.out.println("=========================================================");
		System.out.println(driver.getPageSource());
		System.out.println("=========================================================");
		
		// Get Current Hash Code
		System.out.println(driver.getWindowHandle());
		// Get All Open Hash Code
		System.out.println(driver.getWindowHandles());
	}

}
