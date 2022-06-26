import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args){

		// Launch Chrome Diver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
	
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("1234");
	
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	
		
		


	}

}
