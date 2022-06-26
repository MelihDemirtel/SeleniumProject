package junitAssertionsExamples;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	
	@Test
	public void test01() {
		
		//1. Launch browser
		//2. Navigate to url 'http://automationexercise.com'
		//3. Verify that home page is visible successfully
		//4. Click on 'Signup / Login' button
		//5. Verify 'Login to your account' is visible
		//6. Enter correct email address and password
		//7. Click 'login' button
		//8. Verify that 'Logged in as username' is visible
		//9. Click 'Logout' button
		//10. Verify that user is navigated to login page
		//11. Close driver
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//1. Launch browser
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		//2. Navigate to url 'http://automationexercise.com'
		// Goes To Automation Exercise Home Page
		driver.get("https://www.automationexercise.com/");
		
		//3. Verify that home page is visible successfully
		WebElement homePageLogo = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
		Assert.assertTrue(homePageLogo.isDisplayed());
		
		//4. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		//5. Verify 'Login to your account' is visible
		WebElement loginPageText = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
		Assert.assertTrue(loginPageText.isDisplayed());
		System.out.println(loginPageText.getText());
		
		//6. Enter correct email address and password
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("turkcelltest7194@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Test1.");
		
		//7. Click 'login' button
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		
		//8. Verify that 'Logged in as username' is visible
		WebElement loginText = driver.findElement(By.xpath("//a[text()=' Logged in as ']"));
		Assert.assertTrue(loginText.isDisplayed());
		System.out.println(loginText.getText());
		
		//9. Click 'Logout' button
		driver.findElement(By.xpath("//a[@href='/logout']")).click();
		
		//10. Verify that user is navigated to login page
		String expectedUrl = "https://www.automationexercise.com/login";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
		
		//11. Close driver
		// Close Driver
		driver.close();
	}

}
