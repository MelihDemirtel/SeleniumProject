import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		// Goes To Amazon Home Page
		driver.get("https://www.facebook.com");
		
		// Send Random Text To Email label
		driver.findElement(By.id("email")).sendKeys("aaarewewtwa12");
		
		//Send Random Text To Password label
		driver.findElement(By.id("pass")).sendKeys("ýofauýdsfjn");
		
		// Click Login BUtton
		driver.findElement(By.name("login")).click();
		
		// Create A Web Element
		WebElement result = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		
		// Print Result Text
		System.out.println(result.getText());
		
		// Create Variable For Expected Result
		String expectedResult = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		
		// Create Variable For Actual Result
		String actualResult = result.getText();
		
		// Check Test Result Text True Or False
		if(expectedResult.equals(actualResult)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		// Close Driver-
		driver.close();
	}

}
