package UdemyCourse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		int second = 1000;
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

		driver.get("https://www.amazon.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		
		actions.moveToElement(move).build().perform();
		
		Thread.sleep(second);
		
		WebElement move2 = driver.findElement(By.id("twotabsearchtextbox"));
		
		actions.moveToElement(move2).click().keyDown(Keys.SHIFT).sendKeys("hello").sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(second);

		actions.moveToElement(move2).doubleClick().sendKeys(Keys.BACK_SPACE).build().perform();
		
		Thread.sleep(second);

		actions.moveToElement(move2).sendKeys("nutella").sendKeys(Keys.ENTER).build().perform();
	
		

	}

}
