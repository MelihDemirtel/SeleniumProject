package UdemyCourse;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
		String userName = "rahul";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername"))
		.sendKeys(userName);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']"))
		.sendKeys("1234");
		
		driver.findElement(By.id("chkboxTwo"))
		.click();
		
		driver.findElement(By.xpath("//button[@type='submit']"))
		.click();
		
		String actualErrorMessage = driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println("actualErrorMessage = "+actualErrorMessage);
		
		String expectedErrorMessage = "* Incorrect username or password";
		
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
		
		driver.findElement(By.linkText("Forgot your password?"))
		.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']"))
		.sendKeys("John");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']"))
		.sendKeys("John@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']"))
		.sendKeys("12345678");
	
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']"))
		.click();
		
		String actualMessage = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		System.out.println("actualMessage = "+actualMessage);
		
		String expectedMessage = "Please use temporary password 'rahulshettyacademy' to Login.";
		
		Assert.assertEquals(expectedMessage, actualMessage);

		driver.findElement(By.xpath("//button[@class='go-to-login-btn']"))
		.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("inputUsername"))
		.sendKeys(userName);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']"))
		.sendKeys("rahulshettyacademy");
		
		driver.findElement(By.id("chkboxOne"))
		.click();
		
		driver.findElement(By.xpath("//button[@type='submit']"))
		.click();
		
		Thread.sleep(1500);

		String actualMessage2 = driver.findElement(By.tagName("p")).getText();
		System.out.println("actualMessage2 = "+actualMessage2);

		String expectedMessage2 = "You are successfully logged in.";
		
		Assert.assertEquals(expectedMessage2, actualMessage2);

		String actualMessage3 = driver.findElement(By.tagName("h2")).getText();
		System.out.println("actualMessage3 = "+actualMessage3);

		String expectedMessage3 = "Hello"+" "+userName+",";
		
		Assert.assertEquals(expectedMessage3, actualMessage3);
		
		driver.findElement(By.xpath("//button[text()='Log Out']"))
		.click();

		Thread.sleep(1000);

		String actualUrl = driver.getCurrentUrl();
		System.out.println("actualUrl = "+actualUrl);

		String expectedUrl = "https://www.rahulshettyacademy.com/locatorspractice/";
		
		Assert.assertEquals(expectedUrl, actualUrl);


	}

}
