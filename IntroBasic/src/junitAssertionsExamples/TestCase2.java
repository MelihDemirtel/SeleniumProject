package junitAssertionsExamples;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	
	@Test
	public void test01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		// Goes To Amazon Home Page
		driver.get("https://www.amazon.com");
		
		// Create A Web Element
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		// Send To Search Box Nutella Text
		searchBox.sendKeys("Nutella");
		
		// Click Enter
		searchBox.submit();
		
		// Create A List Web Element
		List<WebElement> actualResult = driver.findElements(By.xpath("//span[contains(text(),'Nutella')]"));
		System.out.println("Size : "+actualResult.size());
		String expectedResult = "Nutella";
		int counter = 0;
		for(int i = 0; i < 15; i++) {
			String list = actualResult.get(i).getText().substring(0, 8);
			System.out.println(list);
			
			if(list.contains(expectedResult)) {
				System.out.println(i+" . Object CONTAINS NUTELLA "+actualResult.get(i).getText());
				Thread.sleep(150);
				counter = counter + 1;
			}else {
				System.out.println(i+" .Object NOT-CONTAINS NUTELLA "+actualResult.get(i).getText());
				counter = counter - 1;
			}
		
		}
		
		System.out.println("Loop Over");
		System.out.println(counter+" Object Contains Nutella's Name");
			
	}

}
