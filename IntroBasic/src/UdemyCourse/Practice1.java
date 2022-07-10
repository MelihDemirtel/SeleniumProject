package UdemyCourse;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		String name = "turkcell";
		String email = "turkcelltest7194@gmail.com";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ext02d47194\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Create Chrome Driver Object
		WebDriver driver = new ChromeDriver();

		// Screen Manage
		driver.manage().window().maximize();
		
		// Wait 15 Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Wait 15 seconds for the web elements on the page to be found. If it finds the element, it continues without waiting.
		//Throws an error if it doesn't find the element within 15 seconds
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> productsPrice = driver.findElements(By.xpath("//p[@class='product-price']"));
		
		System.out.println("Product Size : "+products.size());
		
		String expectedTomato = "Tomato - 1 Kg";
		String expectedStrawberry = "Strawberry - 1/4 Kg";
		for(WebElement product : products) {
			String actualName = product.getText();
			System.out.println(actualName);
			Thread.sleep(500);
			if(actualName == expectedTomato) {
				driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[6]")).click();
				System.out.println("Tomato - 1 Kg is ADDED");
			}
			else if(actualName == expectedStrawberry) {
				driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[24]")).click();
				System.out.println("Strawberry - 1/4 Kg");
			}
		}
		
		String totalAmount = driver.findElement(By.xpath("(//strong[contains(text(),'')])[2]")).getText();
		
		Assert.assertEquals("196", totalAmount);
		

	}

}
