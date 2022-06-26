package junitFramework;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Before_After_Notations {
	static WebDriver driver;
	
	//@Before When you add a class to the end, it runs once at the beginning. Otherwise, it runs at the beginning of each test without stopping.
	//Classes must be static when you add a class to the end
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
	}
	
	//@After When you add a class to the end, it runs once at the ending. Otherwise, it runs at the ending of each test without stopping.
	@AfterClass
	public static void tearDown() {
		// Close Driver
		driver.close();
	}
	
	@Test
	public void test01() {
		// Goes To Amazon Home Page
		driver.get("https://www.amazon.com");
	}
	
	@Test
	public void test02() {
		// Goes To BestBuy Home Page
		driver.get("https://www.bestbuy.com");
		
		// Get Current Page URL
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void test03() {
		// Goes To Facebook Home Page
		driver.get("https://www.facebook.com");
		
		// Get Current Page Title Name
		System.out.println(driver.getTitle());
	}
	
	//@Ignore It means to ignore. This is done so that the work we are working on is not tested.
	@Test @Ignore
	public void test04() {
		// Goes To Fizy Home Page
		driver.get("https://www.fizy.com");
		
		// Get Current Page Title Name
		System.out.println(driver.getTitle());
	}

}
