package UdemyCourse;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice4 {

	public static void main(String[] args) throws InterruptedException {
		int second = 2000;
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

		driver.get("https://qaclickacademy.com");
		Thread.sleep(second);
		
		driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
		Thread.sleep(second);
		
		driver.findElement(By.xpath("//a[text()='Practice']")).click();
		Thread.sleep(second);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(second);

		List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
		
		System.out.println("Number of Rows : "+rows.size());
		
		List<WebElement> columns = driver.findElements(By.cssSelector(".table-display th"));
		
		System.out.println("Number of Columns : "+columns.size());
		
		String secondRow = driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText();
		
		System.out.println("Values of SecondRow : "+secondRow);

	}

}
