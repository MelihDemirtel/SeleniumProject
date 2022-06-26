package actionClasses;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {
	
	@Test
	public void test01() {
		//1. Launch browser
		//2. Navigate to url 'http://automationexercise.com'
		//3. Click on 'Signup / Login' button
		//4. Enter name and email address
		//5. Click on 'Signup' button
		//6. Fill details: Title, Name, Email, Password, Date of birth
		//7. Select checkbox 'Sign up for our newsletter!'
		//8. Select checkbox 'Receive special offers from our partners!'
		//9. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		//10. Click 'Create Account button'
		//11. Verify that 'ACCOUNT CREATED!' is visible
		
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
		
		//3. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		//4. Enter name and email address
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("TurkcellTest");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("turkcelltest27194@gmail.com");
		
		//5. Click on 'Signup' button
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		
		//6. Fill details: Title, Name, Email, Password, Date of birth
		driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.id("password")).sendKeys("Test12.");
		driver.findElement(By.id("days")).sendKeys("1");
		driver.findElement(By.id("months")).sendKeys("January");
		driver.findElement(By.id("years")).sendKeys("1991");
		
		//7. Select checkbox 'Sign up for our newsletter!'
		driver.findElement(By.id("newsletter")).click();
		
		//8. Select checkbox 'Receive special offers from our partners!'
		driver.findElement(By.id("optin")).click();
		
		//9. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		driver.findElement(By.id("first_name")).sendKeys("Test");
		driver.findElement(By.id("last_name")).sendKeys("Test");
		driver.findElement(By.id("company")).sendKeys("Turkcell");
		driver.findElement(By.id("address1")).sendKeys("Test");
		driver.findElement(By.id("address2")).sendKeys("Test");
		driver.findElement(By.id("country")).sendKeys("Canada");
		driver.findElement(By.id("state")).sendKeys("Test");
		driver.findElement(By.id("city")).sendKeys("Test");
		driver.findElement(By.id("zipcode")).sendKeys("1111");
		driver.findElement(By.id("mobile_number")).sendKeys("1234");
		
		//10. Click 'Create Account button'
		driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

		//11. Verify that 'ACCOUNT CREATED!' is visible
		WebElement text = driver.findElement(By.xpath("//b[text()='Account Created!']"));
		Assert.assertTrue(text.isDisplayed());

	}
	
	@Test
	public void test02() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//1. Launch browser
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();
		
		//Create Action Class Object
		Actions action = new Actions(driver);

		// Screen Manage
		driver.manage().window().maximize();
				
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
				
		//2. Navigate to url 'http://automationexercise.com'
		// Goes To Automation Exercise Home Page
		driver.get("https://www.automationexercise.com/");
		
		//3. Click on 'Signup / Login' button
		WebElement signUpButton = driver.findElement(By.xpath("//a[@href='/login']"));
		action.click(signUpButton).perform();
		
		//4. Enter name and email address
		WebElement nameLabel = driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
		action.click(nameLabel)
		.sendKeys("TurkcellTest2")
		.sendKeys(Keys.TAB)
		.sendKeys("turkcelltest2@gmail.com")
		.sendKeys(Keys.TAB)
		//5. Click on 'Signup' button
		.sendKeys(Keys.ENTER)
		.perform();
		
		//6. Fill details: Title, Name, Email, Password, Date of birth
		WebElement chcBox = driver.findElement(By.id("id_gender1"));
		action.click(chcBox)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("Test12.")
		.sendKeys(Keys.TAB)
		.sendKeys("1")
		.sendKeys(Keys.TAB)
		.sendKeys("January")
		.sendKeys(Keys.TAB)
		.sendKeys("1991")
		.sendKeys(Keys.TAB)
		//7. Select checkbox 'Sign up for our newsletter!'
		.click()
		.sendKeys(Keys.TAB)
		//8. Select checkbox 'Receive special offers from our partners!'
		.click()
		//9. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		.sendKeys(Keys.TAB)
		.sendKeys("Test")
		.sendKeys(Keys.TAB)
		.sendKeys("Test")
		.sendKeys(Keys.TAB)
		.sendKeys("Test")
		.sendKeys(Keys.TAB)
		.sendKeys("Turkcell2")
		.sendKeys(Keys.TAB)
		.sendKeys("Test")
		.sendKeys(Keys.TAB)
		.sendKeys("Test")
		.sendKeys(Keys.TAB)
		.sendKeys("Canada")
		.sendKeys(Keys.TAB)
		.sendKeys("Test")
		.sendKeys(Keys.TAB)
		.sendKeys("Test")
		.sendKeys(Keys.TAB)
		.sendKeys("2222")
		.sendKeys(Keys.TAB)
		.sendKeys("12345")
		//10. Click 'Create Account button'
		.sendKeys(Keys.ENTER)
		.perform();
		
		//11. Verify that 'ACCOUNT CREATED!' is visible
		WebElement text = driver.findElement(By.xpath("//b[text()='Account Created!']"));
		Assert.assertTrue(text.isDisplayed());
	}

}
