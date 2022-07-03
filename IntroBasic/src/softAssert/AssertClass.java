package softAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertClass {
	
	@Test
	public void testAssert() {
		//1. Launch browser
		//2. Navigate to url 'http://automationexercise.com'
		//3. Verify that home page is visible successfully
		//4. Click on 'Products' button
		//5. Verify user is navigated to ALL PRODUCTS page successfully
		//6. The products list is visible
		//7. Click on 'View Product' of first product
		//8. User is landed to product detail page
		//9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//1. Launch Browser
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		//2. Navigate to url 'http://automationexercise.com'
		// Goes To Amazon Home Page
		driver.get("http://automationexercise.com");
		
		//3. Verify that home page is visible successfully
	}

}
