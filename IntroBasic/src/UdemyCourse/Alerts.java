package UdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		int second = 500;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();

		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Wait 15 seconds for the web elements on the page to be found. If it finds the
		// element, it continues without waiting.
		// Throws an error if it doesn't find the element within 15 seconds

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys("Raul");
		Thread.sleep(second);

		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(second);

		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("alertMessage : " + alertMessage);
		driver.switchTo().alert().accept();
		Thread.sleep(second);

		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(second);

		String alertMessage2 = driver.switchTo().alert().getText();
		System.out.println("alertMessage2 : " + alertMessage2);
		driver.switchTo().alert().dismiss();
		Thread.sleep(second);
	}

}
