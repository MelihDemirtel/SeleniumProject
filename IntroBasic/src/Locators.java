import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

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
		
		driver.get("URL");
		
		// ID
		driver.findElement(By.id("name of ID's attribute value"));
		
		// NAME
		driver.findElement(By.name("name of NAME's attribute value"));
		
		// CLASSNAME
		driver.findElement(By.className("name of CLASSNAME's attribute value"));

		// TAGNAME
		driver.findElement(By.tagName("name of TAGNAME's attribute value"));
		
		// LINK
		driver.findElement(By.linkText("link"));
		
		// PARTIAL LINK TEXT
		driver.findElement(By.partialLinkText("Part of the link post"));
		
		// XPATH
		driver.findElement(By.xpath("XPATH--> //tagName[@attribute='attribute value']"));
		driver.findElement(By.xpath("XPATH--> //tagName[@attribute='attribute value'][index value]"));
		driver.findElement(By.xpath("XPATH--> //tagName[text()='any text']"));
		driver.findElement(By.xpath("XPATH--> //tagName[contains(text(),'any text part')]"));
		
		// CSS SELECTOR
		driver.findElement(By.cssSelector("CSS SELECTOR--> tagname[attribute='attribute value']"));
		driver.findElement(By.cssSelector("CSS SELECTOR--> #tagname"));
		driver.findElement(By.cssSelector("CSS SELECTOR--> .class attribute"));
		
		
	}

}
