import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		// Goes To BestBuy Home Page
		driver.get("https://www.bestbuy.com");
		
		// Create A List For WebElement
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		// Print Number Of Links
		System.out.println("Number Of Links : "+links.size());
		
		// Print All Texts Of Links With For Loop
		for(int i = 0; i < links.size(); i++) {
			System.out.println("Link "+i+" = "+links.get(i).getText());
		}
		
	}

}
