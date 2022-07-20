package UdemyCourse;

import java.time.Duration;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) throws InterruptedException {
		int second = 500;
		
		//Using the ChromeOptions class
		ChromeOptions options = new ChromeOptions();
		//Using the ChromeOptions class
		Proxy proxy = new Proxy();
		//Using the ChromeOptions class
		proxy.setHttpProxy("ipaddress:4444");
		//Using the ChromeOptions class
		options.setCapability("proxy", proxy);
		
		//By Pass SSL Certificates
		options.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Create Chrome Driver Object
		WebDriver driver = new ChromeDriver(options);

		// Screen Manage
		driver.manage().window().maximize();

		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Wait 15 seconds for the web elements on the page to be found. If it finds the
		// element, it continues without waiting.
		// Throws an error if it doesn't find the element within 15 seconds

		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		Thread.sleep(second);

	}

}
