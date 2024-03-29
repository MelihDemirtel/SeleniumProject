package UdemyCourse;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Delete All Cookies
		driver.manage().deleteAllCookies();
		
		//driver.manage().deleteCookieNamed("sessionKey");

		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Wait 15 seconds for the web elements on the page to be found. If it finds the
		// element, it continues without waiting.
		// Throws an error if it doesn't find the element within 15 seconds

		driver.get("https://google.com");
		
		// Screen Shot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\ext02d47194\\screenshot.png"));

	}

}
