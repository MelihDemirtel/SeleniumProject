package UdemyCourse;

import java.net.SocketException;
import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {
	int second = 500;
	static String userName = "Raul";
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Create Chrome Driver Object
		driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();

		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Wait 15 seconds for the web elements on the page to be found. If it finds the
		// element, it continues without waiting.
		// Throws an error if it doesn't find the element within 15 seconds

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

	}
	
	@AfterClass
	public static void tearDown() throws SocketException{
		driver.close();
	}
	
	@Test
	public void test01() throws InterruptedException {
		driver.findElement(By.id("name")).sendKeys(userName);
		Thread.sleep(second);

		WebElement alertbtn = driver.findElement(By.id("alertbtn"));
		Assert.assertTrue(alertbtn.isDisplayed());
		alertbtn.click();
		Thread.sleep(second);
		
		String expectedAlertMessage = "Hello "+userName+", share this practice page and share your knowledge";
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("alertMessage : " +alertMessage);
		
		Assert.assertEquals(expectedAlertMessage, alertMessage);
		
		driver.switchTo().alert().accept();
		Thread.sleep(second);
	}
	
	@Test
	public void test02() throws InterruptedException {
		WebElement confirmbtn = driver.findElement(By.id("confirmbtn"));
		Assert.assertTrue(confirmbtn.isDisplayed());
		confirmbtn.click();
		Thread.sleep(second);
		
		String expectedAlertMessage2 = "Hello , Are you sure you want to confirm?";
		String alertMessage2 = driver.switchTo().alert().getText();
		System.out.println("alertMessage2 : " +alertMessage2);
	
		Assert.assertEquals(expectedAlertMessage2, alertMessage2);
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(second);
	
	}

}
