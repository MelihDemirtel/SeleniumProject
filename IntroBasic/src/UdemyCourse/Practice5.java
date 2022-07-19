package UdemyCourse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice5 {

	public static void main(String[] args) throws InterruptedException {
		int second = 2000;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();

		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Wait 15 seconds for the web elements on the page to be found. If it finds the
		// element, it continues without waiting.
		// Throws an error if it doesn't find the element within 15 seconds

		driver.get("https://qaclickacademy.com");
		Thread.sleep(second);

	}

}
