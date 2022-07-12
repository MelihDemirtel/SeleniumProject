package UdemyCourse;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practice2 {

	public static void main(String[] args) {
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

		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(parentId);
		
		WebElement text = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
		
		System.out.println(text.getText());
		
		Assert.assertEquals("Opening a new window", text.getText());

	}

}
