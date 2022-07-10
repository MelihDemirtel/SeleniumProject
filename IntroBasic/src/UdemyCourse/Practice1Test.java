package UdemyCourse;

import java.net.SocketException;
import java.time.Duration;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1Test {
	static WebDriver driver;
	static List<WebElement> products;
	static int second = 2000;
	
	@BeforeClass
	public static void setUp(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}
		
	@AfterClass
	public static void tearDown() throws SocketException{
		driver.close();
	}
	
	@Test
	public void test01() throws InterruptedException {		
		products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		System.out.println("Product Size : "+products.size());
		Thread.sleep(second);
		Assert.assertEquals(30, products.size());
	}
	@Test
	public void test02() throws InterruptedException {
		products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		String expectedTomato = "Tomato - 1 Kg";
		for(WebElement product : products) {
			if(product.getText().equals(expectedTomato)) {
				driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[6]")).click();
				System.out.println("Tomato - 1 Kg is ADDED");
				break;
			}
		
		}Thread.sleep(second);
	}
	@Test
	public void test03() throws InterruptedException {	
		String totalAmount = driver.findElement(By.xpath("(//strong[contains(text(),'')])[2]")).getText();
		Thread.sleep(second);
		Assert.assertEquals("16", totalAmount);
	}
	
	}
