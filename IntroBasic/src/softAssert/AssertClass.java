package softAssert;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

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
		WebElement homePage = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
		Assert.assertTrue(homePage.isDisplayed());
		
		//4. Click on 'Products' button
		driver.findElement(By.xpath("//a[@href='/products']")).click();
		
		//5. Verify user is navigated to ALL PRODUCTS page successfully
		String expectedUrl = "https://automationexercise.com/products";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		
		//6. The products list is visible
		List<WebElement> productList = driver.findElements(By.xpath("//a[contains(text(),'View Product')]"));
		Assert.assertTrue(productList.size() > 0);
		
		//7. Click on 'View Product' of first product
		driver.findElement(By.xpath("(//a[contains(text(),'View Product')])[1]")).click();
		
		//8. User is landed to product detail page
		WebElement detailsPage = driver.findElement(By.xpath("//div[@class='product-information']"));
		Assert.assertTrue(detailsPage.isDisplayed());
		
		//9. Verify that detail detail is visible: product name, category
		WebElement productName = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
		Assert.assertTrue(productName.isDisplayed());
		
		WebElement categoryName = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
		Assert.assertTrue(categoryName.isDisplayed());
		
		driver.close();
	}

}
