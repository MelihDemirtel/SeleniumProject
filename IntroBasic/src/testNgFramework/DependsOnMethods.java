package testNgFramework;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void test01() {
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
		driver.get("https://www.amazon.com");
		
		@Test(dependsOnMethods ="test01")
		public void test02() {
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			
			// Send To Search Box Nutella Text
			searchBox.sendKeys("Nutella");
		}

}
