import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicMethods {

	public static void main(String[] args) throws InterruptedException {

		int sleep = 1000;
		// Launch Chrome Diver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();

		// GET Main URL
		driver.get("https://rahulshettyacademy.com");
		System.out.println("LOG - URL is Opened");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//driver.quit();
		
		Thread.sleep(sleep);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		Thread.sleep(sleep);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		Thread.sleep(sleep);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("1234");
		Thread.sleep(sleep);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(sleep);
		
		
		


	}

}
